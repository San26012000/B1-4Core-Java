package com.multiThreading;

class Test2 extends Thread

{

      public void run()

      	{

    	  	System.out.println("Process Error");
    	  	
    	  	System.out.println("Thread name:"+Thread.currentThread().getName());
    	  	

      	}

}

public class Example3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test2 create=new Test2();
		create.start();
		create.run();
		create.run();

	}

}
