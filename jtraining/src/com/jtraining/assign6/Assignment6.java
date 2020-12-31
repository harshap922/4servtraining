package com.jtraining.assign6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		StoreRegister store = new StoreRegister();
		File file = new File("C:/Users/harsh/Desktop/storeinventory.csv");
		store.loadInventory(file);

		List<String> listItems = new ArrayList<String>();
		listItems.add("PC1033");
		listItems.add("GenericMotherboard");
		listItems.add("GenericProcessor");
		listItems.add("Mouse");
		listItems.add("LCD");
		listItems.add("LCD");

		Receipt receipt = store.checkoutOrder(listItems);
		System.out.println(receipt.getFormattedTotal());
		System.out.println(receipt.getOrderedItems());
	}
}