package com.java.innerclass;

public class StaticInnerClassDemo {
	void show() {
		System.out.println("Outer class");
	}
	// Generally for class static is not applicable but in inner class time static keyword applicable
	static class StaticClass{
		void show() {
			System.out.println("Inner class");
		}
	}
	public static void main(String[] args) {
		StaticInnerClassDemo id = new StaticInnerClassDemo();
		id.show();
		// For inner class object creation outerclasss reference is needed(StaticInnerClassDemo.StaticClass) 
		// for static inner class while object creation no need outer class reference
		StaticInnerClassDemo.StaticClass sc =new StaticClass();
		sc.show();
		
	}

}
