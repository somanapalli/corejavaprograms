package com.capg.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test4 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		al.add(new Product(100,"laptop",30000f));
		al.add(new Product(101,"refrigerator",50000f));

		al.add(new Product(102,"tv",20000f));
		al.add(new Product(103,"washingmachine",25000f));
		
		
		  Double totalPrice = al.stream()
				 .collect(Collectors.summingDouble(p->p.getPprice()));
			 
		  System.out.println(totalPrice);
	}

}
