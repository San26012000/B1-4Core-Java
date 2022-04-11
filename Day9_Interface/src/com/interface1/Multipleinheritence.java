package com.interface1;

interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myOtherMethod();
}
class DemoClass implements FirstInterface,SecondInterface{
	public void  myMethod() {
		System.out.println("First Interface");
	}
	public void myOtherMethod() {
		System.out.println("Second Interface");
	}
}

public class Multipleinheritence 
{
	public static void main(String[] args)
	{
		DemoClass myObj=new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
