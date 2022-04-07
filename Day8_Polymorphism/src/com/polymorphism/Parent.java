package com.polymorphism;
class Base
{
	void method1() {
		System.out.println("Base method1");
	}

	
}
class child extends Base{
	void method1() {
		System.out.println("child method1");
	}

	
}

public class Parent {
	void method1() {
		System.out.println("Parent method1");
	}

	public static void main(String[] args) 
	{
		Base b=new child();
		b.method1();
		child c=new child();
		c.method1();

	}

}

