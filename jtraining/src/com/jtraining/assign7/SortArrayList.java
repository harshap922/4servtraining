package com.jtraining.assign7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.addAll(Arrays.asList(1,2,2,3,6,8,8,9));
		Collections.sort(arrayList);
		System.out.println("The ArrayList after sorting: " + arrayList);
	}

}