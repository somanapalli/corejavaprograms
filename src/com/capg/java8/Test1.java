package com.capg.java8;

public interface Test1 {
	
	public static void main(String[] args) {
		
		Interf i = ()->System.out.println("m1 got implemented");	
	    i.m1();
	    
	    SquareInterface sq = x->x*x;    	
	    int y = sq.square(4);
	    System.out.println("square value is: " + y);
	}

}
