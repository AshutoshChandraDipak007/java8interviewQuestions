package com.org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeAWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stream<String> stream
         = Stream.of("aman", "amar", "suraj","suvam", "Zahafuj");
		 List<String> list3= Arrays.asList("aman", "amar", "suraj","suvam", "Zahafuj");
		 

     // apply takeWhile to take all the names
     // matches passed predicate
   
     
     List<String> list2
     = list3.stream().filter(name -> (name.charAt(0) == 'a'))
           .collect(Collectors.toList());
     System.out.println(list2);
     
     stream.filter(name -> (name.charAt(0) == 'a')).collect(Collectors.toList()).forEach(item->{
    	 System.out.println(" Item "+item);
     });
     
     List<String> list
     = stream.takeWhile(name -> (name.charAt(0) == 'a'))
           .collect(Collectors.toList());

		 // print list
		 System.out.println(list);

	}

}
