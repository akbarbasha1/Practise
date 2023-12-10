package com.java.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class CollectionDemo {
	//If we want to represent a group of individual objects as a single entity then we should go for Collection interface
//	Usually we can use collection to hold and transfer objects from one tier to another tier. 
//	To provide support for this requirement every Collection class already implements Serializable and Cloneable interfaces.

//	boolean add(Object o);
//	boolean addAll(Collection c);
//	boolean remove(Object o);
//	boolean removeAll(Object o);
//	boolean retainAll(Collection c);
//	To remove all objects except those present in c.
//	Void clear();
//	boolean contains(Object o);
//	boolean containsAll(Collection c);
//	boolean isEmpty();
//	Int size();
//	Object[] toArray();
//	Iterator iterator();
	
// Duplicates remove
// https://www.benchresources.net/java-8-how-to-remove-duplicates-from-arraylist/

	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		System.out.println(li instanceof Serializable);
		System.out.println(li instanceof Cloneable);
		System.out.println(li instanceof RandomAccess);
	}
}
