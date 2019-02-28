package com.test.ques;

import java.util.Arrays;

public class SortNumericArray {
	public static void main(String[] args) {
		int[] num = { 15, 25, 35, 65, 55, 45 };
		String[] str = { "Java", "PHP", "C++", "C", "VB Script", "Pearl" };
		System.out.println("Orignal Integer array" + Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("Sorted Integer array"+Arrays.toString(num));
		System.out.println("Orignal String array" + Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("Sorted String array" + Arrays.toString(str));
		
	}
}