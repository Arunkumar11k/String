package org.string;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class B {
	public static void main(String[] args) {
		
		Map<String,A> l = new LinkedHashMap<>();
		  A a = new A();
		  
		  a.setEmpId(8765);
		  a.setEmpName("Arunkumar");
		  a.setPhNum(9326946038l);
		  a.setDob("11/05/1996");
		  a.setDoj("18/02/2018");
		  a.seteMail("arun@gmail.com");
		  a.setAdd("chennai");
		  a.setSal(98766.456f);
		  a.setGender('m');
		A a1= new A();
		  a1.setEmpId(8146);
		  a1.setEmpName("kumar");
		  a1.setPhNum(9324567787l);
		  a1.setDob("11/02/2004");
		  a1.setDoj("31/07/2021");
		  a1.seteMail("kumar@gmail.com");
		  a1.setAdd("trichy");
		  a1.setSal(28766.456f);
		  a1.setGender('m');
		  l.put("1st employee details",a);
		  l.put("2nd employee datails",a1);
		  
		  
		  
//for (int i = 0; i < l.size(); i++) {
//	System.out.println(l.get(i).getEmpName());
//	System.out.println(l.get(i).geteMail());
//	System.out.println(l.get(i).getEmpName());
//	System.out.println(l.get(i).getDob());
//	System.out.println(l.get(i).getEmpId());
//	System.out.println(l.get(i).getGender());
//	System.out.println(l.get(i).getSal());
//	System.out.println(l.get(i).getDoj());
//	System.out.println(l.get(i).getAdd());
	
		  Set<Entry<String,A>> entrySet = l.entrySet();
	System.out.println(entrySet);	  
		  
		  
	for (Entry<String, A> j : entrySet) {
		System.out.println(j.getValue().getEmpName());
		System.out.println(j.getValue().getEmpId());
		System.out.println(j.getValue().geteMail());
		System.out.println(j.getValue().getPhNum());
		System.out.println(j.getValue().getDob());
		System.out.println(j.getValue().getDoj());
		System.out.println(j.getValue().getAdd());
		System.out.println(j.getValue().getGender());
		System.out.println(j.getValue().getSal());
		
		 
		
		
	}
	
	
	



}			
		}
		
		
		
		
	


