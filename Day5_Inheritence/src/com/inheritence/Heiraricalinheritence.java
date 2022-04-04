package com.inheritence;
class CellPhones
{
	void message()
	{
		System.out.println("Hi, sanjay");
	}
	void call()
	{
		System.out.println("I am calling Suhas");
	}
}
class SamsungGalaxyM31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("PUB-G");
	}
}
public class Heiraricalinheritence {

	public static void main(String[] args)
	{
		OnePlus o=new OnePlus();
		o.games();
		o.message();
		o.call();
		SamsungGalaxyM31 m=new SamsungGalaxyM31();
		m.facelock();


	}

}
