package com.collection_operation;

import java.util.ArrayList;
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		System.out.println(list);
		System.out.println("The element present in the 3rd index of ArrayList is "+list.get(3));
		System.out.println("The element present in the 1st index of ArrayList is "+list.get(1));
	}
}
