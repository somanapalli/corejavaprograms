package com.capg.cfw;

import java.util.Comparator;

public class Product implements Comparable<Product> {
	
	private int pid;
	private String pname;
	private String brandName;
	private double price;
	
	public Product()
	{
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String toString()
	{
		return pid + " " + pname + " " +brandName + " " + price;
	}

	@Override
	public int compareTo(Product o) {
		return pid;
		
	}

	

}

 
 