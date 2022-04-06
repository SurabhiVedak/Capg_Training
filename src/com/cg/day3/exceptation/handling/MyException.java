package com.cg.day3.exceptation.handling;

public class MyException {
    public static void main(String[] args) {
        
        try
        {
        int a=10;
        int b=0;
        //int c=a/b;  //you cannot divide any number with zero
//        System.out.println(c);
        
        //Three things
        
        //Exception class 
        //java.lang.ArithmeticException:
        //exception message --/ by zero
        //Line no where exception thrown
        
         String str=null;
        // System.out.println(str.toUpperCase());
         //java.lang.NullPointerException
         //line no
         
         
         //System.out.println(str.charAt(5));
         
         //java.lang.StringIndexOutOfBoundsException
         //String index out of range: 5
         //line no 20
         
          int[] arr=new int[3];
          System.out.println(arr[10]);
         //java.lang.ArrayIndexOutOfBoundsException
          //Index 10 out of bounds for length 3
          //line no 32
        }
        catch(Exception e)
        {
            System.out.println("some error");
        }
    }
}
