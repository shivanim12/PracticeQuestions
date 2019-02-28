package com.test.ques;

public class IntPalindrome {
	public static void main (String args[]) {
		int num=121,  reversedinteger=0, remainder, orignalnumber;
		 orignalnumber=num;
		while(num != 0) {
			remainder=num%10;
			reversedinteger=reversedinteger*10+remainder;
			num/=10;
		}
		if(orignalnumber == reversedinteger)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
				

			
}
