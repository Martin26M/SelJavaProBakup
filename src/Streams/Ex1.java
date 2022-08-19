package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list = new ArrayList<String>(Arrays.asList("Mkrtin","Mathew", "Hello"));
		List <String> list1 = new ArrayList<String>(Arrays.asList("Ann","Mary", "Jose"));
//	long res =	list.stream().filter(s->s.startsWith("M")).count();// using count and filtermethod on Stream
	
	list.stream().filter(s-> s.startsWith("M")).forEach(s->System.out.println(s));
	list.stream().filter(s-> s.equals("Martin")).forEach(s-> System.out.println(s));
	list.stream().filter(s-> s.contains("ell")).forEach(s->System.out.println(s)); // using foreachh to print each
	
	list.stream().filter(s-> s.startsWith("M")).sorted().map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));// using map method
	
	
	// Merging 2 list
	
        Stream <String> newlist  =	Stream.concat(list.stream(), list1.stream());

         newlist.forEach(s-> System.out.println(s));
	
		
	//	System.out.println(res);
	}

}
