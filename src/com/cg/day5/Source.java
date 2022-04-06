package com.cg.day5;

import java.util.Date;

public class Jobrepository {
  static String ret;
  static String getjobvccancy(int age ,String qualification)throws NotEligibleException {
   if (age<19)
   throw NotEligibleException("You are underage for any job");
      
      if(age >=21 && qualification=="B.E")
      ret="We have openings for junior developer";
      
      if(age>=26 && (qualification=="M.S"|| qualification=="Phd"))
      ret="We have openings for senior developer";
      
      if(age>=19 && (qualification!="M.S" || qualification!="Phd" || qualification!="B.E"))
      throw NotEligibleException("We do not have any job that matches your qualification");
      
      return ret;
  }
}
  
  
  public class Source {
    String jobsearch(int age,String qualification) throws NotEligibleException{
      
      if (age>=200 || age <=0)
      throw NotEligibleException("The age entered is not typical for a human being");
      
      
    }
  }
  
  public class NotEligibleException extends Exception{
    
    public NotEligibleException(String s){
      super (s);
    }
  }
    
    


//  public static void main (String [] args){
//    getjobvccancy(9,"b.e");
//  }
}