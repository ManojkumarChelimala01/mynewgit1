package com.acc.day4;
import java.util.*;
public class stackoverflowdemo {

	public static void main(String[] args) {
		 
		   TreeMap<String,Integer> map=new TreeMap<String,Integer>();    
		      map.put("Amit",89);    
		      map.put("Ravi",101);    
		      map.put("Vijay",78);    
		      map.put("klRahul",null); 
		      map.put("Rahul",null); 
		      map.put("Rahul",34); 
		      System.out.println(map); 
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
		 }  
		  
	}


