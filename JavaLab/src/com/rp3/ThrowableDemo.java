package com.rp3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		tryCatchFinally();
		
		
	}

	public static void checkedException(){
		// Compile time exception
		// Need to handle at compile time using try-catch OR throws
		// 1. FileNotFoundException
			//FileInputStream file = new FileInputStream(new File("fghk"));
		
		
		
	}
	
	public static void unCheckedException(){
		// Runtime time exception
		
		// 1. ArithmaticException - / by zero
			//int i = 5/0;
			//System.out.println(" i >> "+i);

		
		
		// 2. NustatillPointerException
		
		
		
		// 3. NumberFormatException
		
		
	}
	
	static public void tryCatchFinally() {
		
		try{
			System.out.println(" In try... ");
			int i = 7/0;
		
		}catch(ArithmeticException e){
			System.out.println(" In catch... ");
			try{
				Thread.sleep(2000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			e.printStackTrace();
			
			try{
				Thread.sleep(2000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}finally{
			System.out.println(" In finally... ");
		}
	}
	
	public void throwsDemo() throws FileNotFoundException {
		FileInputStream file = new FileInputStream(new File("sdjkghk"));
	
	}
}
