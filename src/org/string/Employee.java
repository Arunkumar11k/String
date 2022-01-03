package org.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
	
       public static void main(String[] args) {
		
    	   List<Integer>l = new ArrayList<>();
    	   
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
   		
   		int size = l.size();
   		System.out.println(size);
   		
   		Integer integer2 = l.get(5);
   		System.out.println(integer2);
   		
   		l.add(5, 80);
   		System.out.println(l);
   		
   		l.remove(6);
   		System.out.println(l);
   		for (int i = 0; i < l.size(); i++) {
   			Integer integer = l.get(i);
   			
   			System.out.println(integer);
			
		}
   		
   		System.out.println("=====");
   		
        Set<Integer> l1 = new LinkedHashSet();
        l1.addAll(l);
       
       
        System.out.println("=====");
        
        for (Integer integer : l1) {
			
        	System.out.println(integer);
		}
        Map<List<Integer>,List<Integer> > m = new LinkedHashMap<>();
        m.put(l, l);
        m.put(l, l);
        
        Set<Entry<List<Integer>, List<Integer>>> entrySet = m.entrySet();
        for (Entry<List<Integer>, List<Integer>> entry : entrySet) {
			System.out.println(entry);
		}
           
    	   
	}
}
