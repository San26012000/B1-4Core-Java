package com.looping;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int i=1;
			do {
				System.out.print(i+" ");
				i++;
			}while(i<=n);
		}

	}

}
