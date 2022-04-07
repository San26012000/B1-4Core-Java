package com.abst;

 class Example {

	final void display() {
		System.out.println("Hello");
		
	}
}

public class Example2 extends Example{
	final int a=100;//we can't change the value of the final variable
	void print() {
		
		System.out.println(a);
		
		
		
	}

	public static void main(String[] args) {
		Example2 c=new Example2();
		c.display();//final method is inherited
		

	}
}
