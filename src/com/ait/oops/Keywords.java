package com.ait.oops;

class Product{
	
	final String name="Nagesh";
	
	private int productId;
	private String productName;
	private double price;
	
	Product(){
		System.out.println("Product Class Constructor");
		
	}
	
	Product(int productId, String productName, double price) {
		
		this.productId = productId;
		
		this.productName = productName;
		this.price = price;
		
		
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	final void display() {
//		name="Prem";
		System.out.println("Product Id: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}
}

class Mobile extends Product {
	
	

	Mobile() {
		System.out.println("Mobile Class Constructor");
	}

	Mobile(int productId, String productName, double price) {
		super(productId, productName, price);
		this.show();
	}
	
//	@Override
//	void display() {
//		System.out.println("Mobile Class Display Method");
//		System.out.println("Product Id: " + getProductId());
//		System.out.println("Product Name: " + getProductName());
//		System.out.println("Price: " + getPrice());
//	}
	
	void show() {
		System.out.println("Mobile Class Show Method");
//		name="Bhuvan";
		System.out.println("name is: "+name);
		super.display();
	}
	
}

public class Keywords {

	public static void main(String[] args) {
		
		
		Mobile m1=new Mobile(102, "Mobile", 25000);
		
		
		
//		Product p1=new Product(101, "Laptop", 45000);
//		p1.setProductId(101);
//		p1.setProductName("Laptop");
//		p1.setPrice(45000);
//		p1.display();
		
//		Product p2=new Product(102, "Mobile", 25000);
//		p2.setProductId(102);
//		p2.setProductName("Mobile");
//		p2.setPrice(25000);
//		p2.display();

	}

}
