package com.sparrow.oops.service.impl;

public class MathImpl implements com.sparrow.oops.Service.Math {
	/**
	 * Inheritence through implements key word
	 * 
	 * implements --->> It is useful to implement the interface(almost all the
	 * abstract method) eg. MathImpl implements Math Math is parent and MathImpl is
	 * child complusion >> MathImpl should implemnt the unimplemented parent method
	 * in interface or if not then it should declare itself as abstract class
	 * 
	 */

	/**
	 * Concepts of inheritence child inherited the parent property. Sania -->>
	 * Car... Raul ---->>> inherited property Car Parent to child relation How to
	 * implement the parent child relation in JAVA 1. through implements key word 2.
	 * through extends keyword.
	 * 
	 */
	@Override
	public int add(int a, int b) {
		return (a + b);
	}

	/**
	 * 
	 * Method Overloading when a method is being overloaded with some extra
	 * functionality 1. method name should be same 2. method signautre should be
	 * different 3. return type
	 * 
	 */

	/**
	 * Method signautre >>> addition(int a , int b);
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int addition(int a, int b) {
		System.out.println(" int int method is running ");
		return a + b;
	}

	public float addition(float a, int b) {
		System.out.println("Parent method is runnig ");
		return a+b;
	}
	
	public int addition(int a ) {
		return 10+a;
	}

	/**
	 * method signature >> addition (int a, float b) method name is same return type
	 * is same
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int addition(int a, float b) {
		System.out.println("int float mehthod is running ");
		return (int) (a + b);
	}

	public static void main(String[] args) {

		MathImpl m = new MathImpl();

		/**
		 * these are the overloaded methods
		 * 
		 */
		m.addition(12, 13);// int int
		m.addition(10, 15.12f); // int float

	}

}
