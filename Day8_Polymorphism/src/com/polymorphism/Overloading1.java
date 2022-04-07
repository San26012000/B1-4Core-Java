package com.polymorphism;

public class Overloading1
{
	void assign(float a,float b) {
		System.out.println("Area of rectange  "+(float)(a*b));
	}
	void assign(int a,int b) {
		System.out.println("Area of rectangle  "+(a*b));
	}

	public static void main(String[] args) 
	{
		Overloading1 o=new Overloading1();
		o.assign(10f,11f);
		o.assign(10,20);
		

	}

}
