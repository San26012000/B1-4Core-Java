package com.exception;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		try 
		{
		int res=a/0;
		System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		s.close();

	}

}
