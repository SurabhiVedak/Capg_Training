package com.cg.day4;
interface Vehical{  
void run();  
}  
  
class Car implements Vehical{  
public void run(){
	System.out.println("Car is running...");
	}  
}  
 

public class Main {

	public static void main(String[] args) {
		Car c=new Car();
		c.run(); 

	}

}

