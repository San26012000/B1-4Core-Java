package com.polymorphism;

public class OverLoading 
{
	void assign(int a)
	{
		System.out.println("Area of square: "+(a*a));
	}
	void assign(int a,int b)
	{
		System.out.println("Area of rectangle: "+(a*b));
	}
	void assign(float a,float b)
	{
		System.out.println("Area of rectangle: "+(a*b));
	}

	public static void main(String[] args)
	{
	OverLoading o=new OverLoading();
	o.assign(34);
	o.assign(34,45);
    o.assign(34f,45f);
	}

}
