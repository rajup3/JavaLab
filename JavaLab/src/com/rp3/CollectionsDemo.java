package com.rp3;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;


public class CollectionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(" Collections demo starts.. ");
		
		try {
			
			// ArrayList
			
			
			// vector
			
			
			// hashtable
			Hashtable<Object, Object> env = new Hashtable<Object, Object>();
			env.put("ADMIN_EMAIL_ID", "admin@emailtest.com");
		    Iterator<Map.Entry<Object, Object>> it = env.entrySet().iterator();
		    while(it.hasNext()){
		    	Map.Entry<Object, Object> entry = it.next();
		    	System.out.println(" KEY: "+entry.getKey()+", VALUE: "+entry.getValue());
		    }
			
			
			// map
			
			// List
			
			// tree
			
			
			// enumeration
			
			
			
			
			
			
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println(" Collections  demo ends.. ");
	
	}

}
