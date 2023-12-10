package com.java.collection;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

// LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
//The underlying data structure is double LinkedList
//If our frequent operation is insertion (or) deletion in the middle then LinkedList is the best choice.
//If our frequent operation is retrieval operation then LinkedList is worst choice.
//Duplicate objects are allowed.
//Insertion order is preserved.
//Heterogeneous objects are allowed.
//Null insertion is possible.
//Implements Serializable and Cloneable interfaces but not RandomAccess.
public class LinkedListDemo {

	public static void main(String[] args) {
		 
		LinkedList<String> al = new LinkedList<String>(); // It would be prefer when the LinkedList and queue methods are needed
		List<String> l =new LinkedList<String>(); // mostly prefer list as reference for object creation now LinkedList methods are not available.
		l.add("akbar");
//		l.add(1); Error: only string type is allowed because of generic, if we given generic as object then all types are allowed
		l.add("basha");
		l.add("foujiya");
		System.out.println(l);
		l.add(1, "naseema"); // Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list
		l.add(1, "faruq");
		l.remove(2);  // There is no bit shifting is required in memory.
		l.add(1, "naseema"); 
		l.get(3); //  ArrayList is slow for accessing data because it not implements Random Acrss
		l.add("akbar");
		l.add(null);

		System.out.println(l);
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess); // False
	}
}
