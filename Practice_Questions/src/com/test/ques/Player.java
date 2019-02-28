package com.test.ques;

public class Player
{
	
     int number=0;
	
	 public void guessGame() {
		 number=(int) (Math.random()* 10);
		 System.out.println("I am guessing "+number);
		 
	 }
}
