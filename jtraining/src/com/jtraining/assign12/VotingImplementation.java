package com.jtraining.assign12;

import java.util.LinkedList;

public class VotingImplementation implements Runnable {

	long startTime;
	String motionName;
	public static long endTime;
	LinkedList<Voter> ll = new LinkedList<>();
	public static int countYes = 0;
	public static int countNo = 0;

	public VotingImplementation(String mtn, long startTime) {
		this.motionName = mtn;
		this.startTime = startTime;
		VotingImplementation.endTime = startTime + 60000;
	}

	public VotingImplementation() {
	}

	public void add(Voter v) {
		ll.add(v);
	}	
//	motion Start avagane vote padipothundi, fix that!

	@Override
	public void run() {

		Voter vote = new Voter();

		while (System.currentTimeMillis() < endTime) {
			
//			if(){
//				
//			}

			if (vote.isVote()) {
				if (ll.contains(vote)) {
					ll.pop();
				} else {
					countYes++;
				}
			} else {
				countNo++;
			}
			
			if (countYes > countNo) {
				System.out.println("The motion passed");
				System.out.println("Number of Yeahs and Nahs" + countYes + "," + countNo);
			}

			if (countYes < countNo) {
				System.out.println("The motion failed");
				System.out.println("Number of Yeahs and Nahs" + countYes + "," + countNo);
			}

		}
	}

}