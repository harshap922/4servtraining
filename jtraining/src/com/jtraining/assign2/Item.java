package com.jtraining.assign2;

public class Item {
	
		
		final String name;
		double price;
		int quantity;
		
		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}

		public int getQuantity() {
			return quantity;
		}
		
		public double getValue() {
			return quantity*price;
		}

		public Item(String name, double price, int quantity) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
			
		
		
	
}
