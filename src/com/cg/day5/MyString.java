package com.cg.day5;



public class MyString {

 

    public static void main(String[] args) {
       
        String str = "Surabhi"; 
        String str1 = new String("Hello");
        
        String str2="Vedak";
        
        if (str.equalsIgnoreCase(str1))
        
        {
            System.out.println("true");
        } else {
            System.out.println("flase");
        }
        
         String one="A"; 
         String two="A"; 
                       
         
 

         
         System.out.println(one.compareTo(two));
        
    
         str.charAt(0);
          
         System.out.println(str.charAt(0));
      
         System.out.println(str.concat(str2));
           
         System.out.println(str.contains("Bell"));
         
   
         byte[] b=str.getBytes();
     
         System.out.println(str.indexOf("e"));

 

         String str4="";
         System.out.println(str4.isBlank());
         
    
        System.out.println(str.length());
        
       
        str.replace("H", "J");
        System.out.println(str.replace("H", "J"));
     

 

         System.out.println(str.subSequence(0, 3));
         
      
         
         System.out.println(str.toUpperCase());
         
         System.out.println(str.toLowerCase());
      
         String str6 =" hello   java       ";
         System.out.println(str6.trim());
         System.out.println(str6);
         
         System.out.println(str.subSequence(2, 4));
         
    }
}
 
