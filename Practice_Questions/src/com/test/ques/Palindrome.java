package com.test.ques;

import java.util.Scanner;









public class Palindrome {
	public static void main(String args[]) {
		String a, b="";
		StringBuilder sb = new StringBuilder();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		a = s.nextLine();
		System.out.println("Entered String " + a);
	
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			//b = b + a.charAt(i);
			sb.append(a.charAt(i));
		}
//System.out.println(b);
		if (a.equalsIgnoreCase(sb.toString())) {
			System.out.println("String is palindrome ");
		} else {
			System.out.println("String is not palindrome");
		}

	}
}
