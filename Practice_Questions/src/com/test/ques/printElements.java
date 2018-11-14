package com.test.ques;

import java.util.Scanner;

public class printElements {
	public static void main(String args[]) {
		int k=0;
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Elements");
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			k=k+arr[i];
			
			
		}
		System.out.println("Addition of element "+k);
		
	}

}
