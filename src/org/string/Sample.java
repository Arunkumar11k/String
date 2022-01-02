package org.string;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		Map<Integer, String> l = new Hashtable<>();
		
		l.put(10,"java");
		l.put(20,"sql");
		l.put(30,"oops");
		l.put(40,"oracle");
		l.put(50,"java");
		l.put(60,"oracle");
		l.put(70,"DB");
		l.put(80,"selenium");
		l.put(30,"psql");
		
		Collection<String> values = l.values();
		System.out.println(values);
		
		Set<Integer> keySet = l.keySet();
		System.out.println(keySet);
		
		Set<Entry<Integer,String>> entrySet = l.entrySet();
		System.out.println(entrySet);
	
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		
	}
	}
}

