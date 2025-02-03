package com;

import java.util.*;

class Clerk
{
	Clerk()
	{
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add("Akash");
		a1.add(17.9);
		a1.add(true);
		a1.add('A');
		a1.add(77);
		a1.add(new Date());
//		a1.add(new Clerk());
		System.out.println(a1);
		System.out.println("==========");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("=====Iterator=====");
		Iterator i = a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

public class Demo2 {

	public static void main(String[] args) 
	{
		
		Clerk c=new Clerk();
	}

}
