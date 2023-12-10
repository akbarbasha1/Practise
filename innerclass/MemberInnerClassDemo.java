package com.java.innerclass;

public class MemberInnerClassDemo {
	void show() {
		System.out.println("Outer class");
	}
	
	class MemberClass{
		void show() {
			System.out.println("Inner class");
		}
	}
	public static void main(String[] args) {
		MemberInnerClassDemo id = new MemberInnerClassDemo();
		id.show();
		// For inner class object creation outerclasss reference is needed(MemberInnerClassDemo.MemberClass) 
		// for Member innerclass while object creation time outerclass reference(id.new) isneeded
		MemberInnerClassDemo.MemberClass mc = id.new MemberClass();
		mc.show();
		
	}

}
