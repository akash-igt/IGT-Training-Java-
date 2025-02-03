//package com;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.Set;
//import java.util.TreeMap;
//import java.util.TreeSet;
//
//public class Demo4 {
//
//	public static void main(String[] args) {
////		List l=new List(); //interface
//			//Duplicates are allowed
////		ArrayList map=new ArrayList(); //best for search operation
////		LinkedList map = new LinkedList(); // best for insert and delete (manipulation)
//		
////		Set s=new Set();
//			//Duplicates are not allowed
////		HashSet map = new HashSet(); //no duplicate + no order
////		LinkedHashSet map=new LinkedHashSet(); //no duplicate + user entered order (HeteroGeneous)
////		TreeSet map = new TreeSet(); //no duplicate + sorted order (Homogeneous)
////		HashMap map = new HashMap();
//		LinkedHashMap map = new LinkedHashMap();
////		TreeMap map = new TreeMap();
//		map.put(100, "Akash");
//		map.put(355, "Sunny");
//		map.put(50, "Gaurav");
//		map.put(355, "Shailesh");
//		map.put(121, "Isha");
//		map.put("ABC", "Lalit");
//		map.put(7, "Prerana");
//		map.put(789, "Arya");
//		map.put(33, "Krishna");
//		map.put(121, "Shubham");
//		map.put("PQR", "Pravin");
//		map.put("LMN", "Ajay");
//		System.out.println("=====");
//		Set s = map.entrySet();
//		Iterator i = s.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//			
//		}		System.out.println("=====");
//
//
//	}
//
//}

package com;
 
import java.util.*;
 
public class Demo4 {
	public static void main(String[] args) {
		// list
//		ArrayList al = new ArrayList(); // best to serach operation
//		LinkedList al = new LinkedList(); // best for insert and delete
//		Vector al = new Vector();
//		Stack al = new Stack();
		TreeSet al = new TreeSet();
		al.add(100);
		al.add(345);
		al.add(234);
		al.add(5656);
//		al.add("Abc");
		al.add(76);
		Iterator i =	al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
//		Collections.sort(al);
//		System.out.println(al);
//		Collections.reverse(al);
//		System.out.println(al);
//		
//		Set s= new Set();
//		HashSet al = new HashSet();// no dup + no order
//		LinkedHashSet al = new LinkedHashSet(); // no dup + user entered order
//		TreeSet al = new TreeSet(); //no dup + sorted order
 
		HashMap map = new HashMap();// no dup + randorm order
//		LinkedHashMap map = new LinkedHashMap();
		//TreeMap map = new TreeMap();  // home genius
		map.put(111, "Abi");	
		map.put(456, "Harsih");
		map.put(453, "Manish");
		map.put(789, "Ganesh");
		map.put(111, "Thanesh");
		map.put("ABC", "ISHA");
		map.put("XYZ", "ISHA");
		map.put("ATOZ", "ISHA");
		map.put("AAA", "ISHA");
		map.put("BBB", "ISHA");
		Set s = map.entrySet();
		Iterator i1 =	s.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}		
}