package com.capg.java8;

import java.util.ArrayList;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		al.add(new Product(100,"laptop",30000f));
		al.add(new Product(101,"refrigerator",50000f));

		al.add(new Product(102,"tv",20000f));
		al.add(new Product(103,"washingmachine",25000f));
		
		ArrayList<Float> al1 = new ArrayList<Float>();
		
		for(Product p: al)
		{
			if(p.getPprice()<30000)
			{
				al1.add(p.getPprice());
			}
			
		}
		
		System.out.println(al1);
		
		
		
	}

}
