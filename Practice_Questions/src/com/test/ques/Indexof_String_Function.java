package com.test.ques;

public class Indexof_String_Function {
	public static void main(String args[]) {
		String sample_str = "I am Shivani Dangra";
		System.out.println("Index of S: " + sample_str.indexOf('S'));
		// Character at position after given index value
		System.out.println("Index of i after its first occurence: " + sample_str.indexOf('i', 8));
		// Give index position for the given substring
		System.out.println("Index of Dangra: " + sample_str.indexOf("Dangra"));
		// Give index position for the given substring and start index
		System.out.println("Index of vani: " + sample_str.indexOf("am", 6));

	}

}
