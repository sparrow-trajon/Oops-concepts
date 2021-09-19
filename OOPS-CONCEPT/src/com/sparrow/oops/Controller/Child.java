package com.sparrow.oops.Controller;

public class Child extends Parent{
	
	
	public static void main(String [] args) {
		/**
		 * Case 1 . when child class reference variable is holding child class object 
		 * 
		 * c -- reference variable  child class 
		 * new Child() >> child class object 
		 * 
		 * we can say that in this case child have access to all the property of parent and itself 
		 * 
		 * 
		 */
		Child c= new Child();
		
		//c.disp();
		//c.print();
		
		
		/**
		 * case 2 
		 *  parent class reference variable is holding parent class object
		 * Parent can't access child class property at all. 
		 * 
		 */
		
		Parent p= new Parent();
		
		//p.disp();
		//p.print();
		
		/**
		 * Case 3 
		 * when parent class reference variable is holding child class object 
		 * 
		 */
		
		Parent p1 = new Child();
		p1.disp();
		//p1.print()
		
		/**
		 * case 4 
		 * This is not possible 
		 * child cant hold parent class object 
		 * 
		 */
		
	//	Child c1= new Parent();
		
		
	}
	
	public void print() {
		System.out.println("Child method print is running ");
	}
}
