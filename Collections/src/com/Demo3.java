package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {
//		List l=new List(); //interface
			//Duplicates are allowed
		ArrayList a1=new ArrayList(); //best for search operation
//		LinkedList a1 = new LinkedList(); // best for insert and delete (manipulation)
		
//		Set s=new Set();
			//Duplicates are not allowed
//		HashSet a1 = new HashSet(); //no duplicate + no order
//		LinkedHashSet a1=new LinkedHashSet(); //no duplicate + user entered order
//		TreeSet a1 = new TreeSet(); //no duplicate + sorted order
		a1.add(100);
		a1.add(355);
		a1.add(444);
		a1.add(50);
		a1.add(355);
		a1.add(121);
		a1.add(7);
		a1.add(789);
		a1.add(33);
		a1.add(121);
		System.out.println("=====");
		Iterator i =a1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}		System.out.println("=====");


	}

}
