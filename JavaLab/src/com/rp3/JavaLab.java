package com.rp3;

import java.io.File;

public class JavaLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Java Lab starts ... ");
		
		File file = new File("fhgkj");
		
		//FileInputStream io = new FileInputStream(file);
		
		file.renameTo(new File("ghjdfkg"));
		System.out.println(" >>   "+ file.getPath());
		
		System.out.println(" >>   "+ file.compareTo(new File("dfghhjkbxhkgjkjd")));
		
		
		Thread th = Thread.currentThread();
		
		int i = 5;
		System.out.println(" Java Lab ends .. ");
		
		
	}
}
