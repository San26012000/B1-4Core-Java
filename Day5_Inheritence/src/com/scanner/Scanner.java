package com.scanner;

public class Scanner {

	public static void main(String[] args)
	{
		Scanner s=new Scanner();
	    int age=s.nextInt();
	    int weight = s.nextInt();
	    if(age>18 && weight>50)
	    {
		System.out.println("Elegible to donate a blood");
		
	    }
	else
	{
		System.out.println("Not elegible to donate a blood");
	}
	s.close();
	}

	private void close() {
		
	}

	private int nextInt() {

		return 0;
	}

}
