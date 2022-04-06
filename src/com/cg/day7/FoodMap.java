package com.cg.day7;

import java.util.*;

public class FoodMap {

	public static void main(String[] args) {
		HashMap<Integer, Food> m1= new HashMap<Integer, Food>();
		m1.put(1001, new Food("Pav Bhaji",95.6));
		m1.put(1002, new Food("Vada Pav",66));
		m1.put(1003, new Food("Misal Pav",80));
		
		System.out.println(m1);
		 for(Integer i:m1.keySet()){
			 System.out.println(i);
		 }
		 Food f1 = new Food("Misal Pav",80);
		 System.out.println(f1.print());
		
		
		
		
		
	}

}
