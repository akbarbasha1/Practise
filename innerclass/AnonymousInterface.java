package com.java.innerclass;


//IS-A -> Abstract class
//behaviour -> interface
//class Remote extends ElectronicDevice implement Drivable

public interface AnonymousInterface {
	void show();

}

class AnonymousInterfaceClass {
	public static void main(String[] args) {
		// Here  we are not Instantiate interface we Instantiate class here
		AnonymousInterface ai = new AnonymousInterface() {
			public void show() {
				System.out.println("AnonymousInnerClass");
			}
		};
		ai.show();
	}
}