package com.decision;

import java.util.Scanner;

public class Example4 {

	public static void main(String[]args)
	{
			try (Scanner s = new Scanner(System.in)) {
				int a=s.nextInt();
				switch(a) {
				case 1:
					System.out.println("sanjay");
					break;
				case 2:
					System.out.println("Hi");
					break;
				default :
					System.out.println("Input invalid");
					
				}
			}

		}

}
		


