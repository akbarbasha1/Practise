package com.java.exception;

public class CheckedDemo {
	
	// checked Exception: It is also run time Exception but,The compiler tells possibility of exception while writing coding.
	// compiler only can check possibility of checked exception
	public static void main(String[] args) throws InterruptedException { // checked Exception
		System.out.println("Hello!");
		Thread.sleep(2000);
		System.out.println("After 5 seonds Hello!");
	}

}
