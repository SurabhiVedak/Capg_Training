package com.cg.day8;





import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 

public class MyStreamApi {

 

    public static void main(String[] args) {
        // List of data
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(1);
        list.add(-4);
        list.add(-8);

 

        
        //list.add(10).remove()
        
        
        //10,20,1,-4,-8
        // ArrayList<Integer> list2=A

 

        //
        // Stream<Integer> st=list.stream();

 

        // print the steam element
        // list.stream().forEach(System.out::println);

 

        // java.lang.IllegalStateException
        // stream is already operated
        // list.stream().forEach(System.err::println);

 

        // find the only positive number
        // filter
        // 10
        // 10>0
        // filter need the lambda expression
        long count = list.stream()
                //> < == ! startwith 
                .filter(e -> e < 0) //true //false
                //and multiple with 2
                .map(num->num*2)
                //sort the data
                .sorted(Collections.reverseOrder())
                .distinct()
                //count the element in array
                .count();
        //list.stream().filter();
        //list.stream().map();
        //list.stream().sorted();
        //list.stream().distinct();
        //distinct
        
        
        System.out.println(count);

 

        //list2.forEach(System.out::println);
    
    }

 

    

 

}