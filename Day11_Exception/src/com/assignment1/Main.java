package com.assignment1;
import java.util.*;

class NamenotFoundException extends Exception
{
NamenotFoundException(String message)
{
super(message);
}

}
public class Main 
{
	public static void main(String args[]) 
	{
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       try
       {
    	   customername(name);
	   }
       catch(Exception e)

       {
    	   System.out.print(e);

		}
         sc.close();
		}
	static void customername(String name)throws
	NamenotFoundException

	{

	if(name.isEmpty())

	{

	throw new NamenotFoundException("Name idEmpty");

	}

	else

	{

	System.out.print("Hi "+ name + ", Welcome to our store");

	}
     
	}

}

