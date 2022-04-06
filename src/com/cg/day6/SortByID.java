package com.cg.day6;


import java.util.Comparator;

 

public class SortByID implements Comparator<Student> {

 

    @Override
    public int compare(Student s1, Student s2) {
        
        if(s1.getId()>s2.getId())
        {
            return 1;//ASE order
            //for DESC order type -1
        }
        else if(s1.getId()>s2.getId())
        {
            return -1;//ASE order
            //for DESC order type 1
        }
        else
        {
        return 0;
        }
    }
    
    

 

}