package com.sparrow.oops.service.impl;

public class MathImplExt extends MathImpl {

	public static void main(String[] args) {

		MathImplExt mm = new MathImplExt();
		mm.addition(10.15f, 20);

	}
	
	/**
	 * this is method overriding 
	 * method signature is same 
	 * just the implementaion is different 
	 * 
	 */
	public float addition(float a, int b) {
		System.out.println("this is child method running ");
		return a - b;
	}

}
