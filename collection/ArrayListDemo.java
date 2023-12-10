package com.java.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
//
//  Implements list only
//	The underlying data structure is resizable array (or) growable array (or) Dynamic Array.
//	Duplicate objects are allowed.
//	Insertion order preserved.
//	Heterogeneous objects are allowed.(except TreeSet , TreeMap every where heterogenious objects are allowed)
//	Null insertion is possible.
//--> More suitable to perform insertion operation rear end(last end)
//--> More suitable to access object at any index because it implements Random Access interface
//	
//	ArrayList and Vector classes implements RandomAccess interface so that any random element we can access with the same speed. Hence ArrayList is the best choice of "retrival operation".
//	RandomAccess interface present in util package and doesn't contain any methods. It is a marker interface.
	
public class ArrayListDemo {
	public static void main(String[] args) {
		 
		ArrayList<String> al = new ArrayList<String>(); // It would be prefer when the Arraylist method is needed
		List<String> l =new ArrayList<String>(); // mostly prefer list as reference for object creation now Arraylist methods are not available.
		l.add("akbar");
//		l.add(1); Error: only string type is allowed because of generic, if we given generic as object then all types are allowed
		l.add("basha");
		l.add("foujiya");
		System.out.println(l);
		l.add(1, "naseema"); // Manipulation with ArrayList is slow because it internally uses an array
		l.add(1, "faruq");
		l.remove(2);  // If any element is removed from the array (or) adding, all the other elements are shifted in memory.
		l.add(1, "naseema"); // Manipulation with ArrayList is slow because it internally uses an array
		l.get(3); //  ArrayList is better for storing and accessing data.
		l.add("akbar");
		l.add(null);
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
	}
}
