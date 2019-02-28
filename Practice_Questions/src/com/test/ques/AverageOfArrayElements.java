package com.test.ques;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		int k=0;
		int[] arr=new int[6];
	    System.out.println("Enter Array Elements");
		Scanner in= new Scanner(System.in);
		for(int i=0; i <arr.length; i++){
			arr[i]= in.nextInt();
		}
		in.close();
		System.out.println("Elements of Array");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		for(int i=0; i<arr.length; i++)
			k= k+arr[i];
		System.out.println("Average of array elements");
		int average=k/arr.length;
		System.out.print(average);	
	}	
	

}
