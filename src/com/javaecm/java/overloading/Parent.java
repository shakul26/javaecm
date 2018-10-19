package com.javaecm.java.overloading;
/**
 * Demonstrates the overloading resolution of method
 * @author Java ECM
 * @Date 19/Oct/2018
 */
public class Parent {

	
	public void m1(String str) {
		
		System.out.println("m1(String) called with str "+str);
	}
	
	/**
	 * Overloaded method with different signature
	 * @param obj
	 */
	public void m1(Object obj) {
		
		System.out.println("m1(Object) called with obj "+ obj);
	}
	
	
	public static void main(String[] args) {
		Parent p = new Parent();
		/**
		 * at the time of resolution it checks for more specialized ,
		 * that is it gives preference to child class
		 */
		p.m1(null); 
	}
	
}
