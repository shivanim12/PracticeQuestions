package com.test.ques;

public class PhraseOMatic {
	public static void main (String args[])
	{
		
		String[] wordListone = {"one", "hi"};
		String[] wordListTwo= {"Two", "Hello",};
		String[] wordListThree= {"Three", "See", "you"};
		
		int one=wordListone.length;
		int two=wordListTwo.length;
		int three=wordListThree.length;
		
		System.out.println(one+" "+two+" "+three);
		
		int rand1= (int) (Math.random() * wordListone.length);
		int rand2= (int) (Math.random() * wordListTwo.length);
		int rand3= (int) (Math.random() * wordListThree.length);
		
		
		System.out.println("Rand1 "+rand1+" " 
		+"Rand2 "+rand2+" "+"Rand3 "+rand2);
		
		
		String phrase= wordListone[rand1]+" "+
		wordListTwo[rand2] + " " + wordListThree[rand3] ;
		
		System.out.println("What we need is a " + phrase);
		
	}
	
}


