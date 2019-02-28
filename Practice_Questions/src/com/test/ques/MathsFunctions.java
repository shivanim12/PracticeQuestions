package com.test.ques;

public class MathsFunctions {
	public static void main(String args[])
	{
		System.out.println(Math.max(5, 15));
		System.out.println(Math.min(5, 15));
		System.out.println(Math.abs(-4.5));
		System.out.println(Math.random());
		try {
		int[] myNumber= {1,2,3};
		System.out.println(myNumber[10]);
		}catch(Exception e) {
			System.out.println("Array out of bound exception");
		}
		finally {
			System.out.println("It should execute in any case");
		}
		
	}

}
