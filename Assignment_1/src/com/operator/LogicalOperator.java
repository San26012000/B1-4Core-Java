package com.operator;

public class LogicalOperator {

	public static void main(String[] arg)
	{
		int a=3,b=4;
		boolean res=(a<b && b<8);
		boolean res1=(a<b || b<9);
		boolean res2=!(a<b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}
