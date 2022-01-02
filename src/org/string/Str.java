package org.string;

import java.util.*;
import java.util.LinkedHashSet;

public class Str {
	public static  void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(20);
	    l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		l.add(20);
        System.out.println(l);

     Set<Integer>l1=new LinkedHashSet<>();
    l1.addAll(l);
    
     for (Integer integer : l1) {
    	 System.out.println(integer);
		
	}

	}




}
