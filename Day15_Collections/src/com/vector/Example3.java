package com.vector;

//Add ArrayList to vector by using addAll() method 
import java.util.ArrayList;
import java.util.Vector;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Comparable> arr = new ArrayList<Comparable>();
		arr.add(3);
		arr.add("Methods");
		arr.add("Java");
		arr.add(4);
		Vector<Comparable> v = new Vector<Comparable>();
		v.addAll(arr);
		System.out.println(v);

	}

}
