package com.cg.day8;
interface EvenOdd {
	void check(int a);
}

interface PovNeg {
	void check2(int n);
}
public class LambdaEx {

	public static void main(String[] args) {
		// Lambda Expression
		EvenOdd evenOdd = (int a) -> {
			if(a%2==0){
				System.out.println("Number "+a+" is even.");
			}else{
				System.out.println("Number "+a+" is odd.");
			}
		};
		
		//Check numbers
		evenOdd.check(5);
		evenOdd.check(8);
		
		PovNeg povNeg = (int n) -> {
			if(n>0){
				System.out.println("Number "+n+" is positive.");
			}else if(n<0){
				System.out.println("Number "+n+" is negative.");
			}
			else {
				System.out.println("Number "+n+" is equal to zero.");
			}
		};
		
		povNeg.check2(5);
		povNeg.check2(-85);
		povNeg.check2(0);
	}

}
