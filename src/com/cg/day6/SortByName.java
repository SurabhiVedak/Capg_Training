package com.cg.day6;


import java.util.Comparator;

 

public class SortByName implements Comparator<Student>{

 

    @Override
    public int compare(Student s1, Student s2) {
        // TODO Auto-generated method stub
        return s1.getName().compareTo(s2.getName());
    }

 

}