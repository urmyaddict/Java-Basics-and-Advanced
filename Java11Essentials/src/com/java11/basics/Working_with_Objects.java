package com.java11.basics;

//Product class
class Product {

	private int productId;
	private float price;
	private int stock;
	
	public Product() {
		System.out.println("Product constructor is called");
	}
	public void displayDetails() {
		System.out.println("Product Id: " + productId);
		System.out.println("Product Price: " + price);
	}

	public void displayDetails(int discount) {
		System.out.println("Product discounted price: " + this.getPriceAfterDiscount(discount));
		if (this.stock > 0)
			System.out.println("Stock Available");
		else
			System.out.println("Stock not available");
	}

	public float getPriceAfterDiscount(int discountPercentage) {
		float discountedPrice = price - (price * discountPercentage / 100);
		return discountedPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}

//This is the class which creates new Product objects
public class Working_with_Objects {
	public static void main(String[] args) {
		Product p1 = new Product();// declaring new object
//		this();
		p1.setProductId(1001);// setting attributes with values
		p1.setPrice(400);
		p1.setStock(6);

		Product p2 = new Product();
		p2.setProductId(1005);
		p2.setPrice(500);
		p2.setStock(4);

		p2.displayDetails();System.out.println();
		p2.displayDetails(50);System.out.println();
		
//		Product p3 = new Product();

		p1.displayDetails();// method call
		System.out.println();
		
//		p3.displayDetails();
//		System.out.println();
		
		p1.displayDetails(50);System.out.println();
	
		
		
		Product p4 = new Product();
		p4.setProductId(1002);
		p4.setPrice(100);
		p4.setStock(0);
		p4.displayDetails();
		p4.displayDetails(50);
		
	}
}
