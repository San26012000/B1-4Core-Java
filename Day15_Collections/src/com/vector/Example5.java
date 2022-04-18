package com.vector;

import java.util.Vector;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Comparable> v = new Vector<Comparable>();
		v.add(1);
		v.add(2);
		v.add("Animal");
		v.add("Flower");
		v.add(3);
		v.setElementAt(4, 1);//fist argument is value and second argument is index of the vector
		System.out.println(v);
		}
}
