package com.java.innerclass;

public class AnonymousInnerClass {
	void show() {
		System.out.println("normal output");
	}
}
// Different implementation will be used only once
	class AnonymousInnerClassDemo {
		public static void main(String[] args) {
			AnonymousInnerClass ai = new AnonymousInnerClass()
					{
				void show() {
					System.out.println("override output ");
				}
					};
					ai.show();
		}

	}


