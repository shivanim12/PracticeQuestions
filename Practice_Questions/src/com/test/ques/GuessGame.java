package com.test.ques;

public class GuessGame{
	
	Player p1;
	Player p2;
	Player p3;
	public void startGame() {
		 p1=new Player();
		 p2= new Player();
		 p3=new Player();
		 
		 int guessp1=0;
		 int guessp2=0;
		 int guessp3=0;
		 
		 boolean p1isright=false;
		 boolean p2isright=false;
		 boolean p3isright=false;
		 
		 int target_number=(int) (Math.random() * 10);
		 System.out.println("I am thinking of a no. between 0-9");
		 
		 while(true) {
	     System.out.println("Number to guess is "+ target_number);
		 
		 p1.guessGame();
		 p2.guessGame();
		 p3.guessGame();
		 
		 guessp1=p1.number;
		 guessp2=p2.number;
		 guessp3=p3.number;
		 
		 System.out.println("Number p1 guessed "+ guessp1);
		 System.out.println("Number p2 guessed "+ guessp2);
		 System.out.println("Number p3 guessed "+guessp3);
		 
		 if(guessp1==target_number) {
			 p1isright=true; 
		 }
		 if(guessp2==target_number) {
			 p2isright=true; 
		 }
		 if(guessp3==target_number) {
			 p3isright=true; 
		 }
		 
		 if (p1isright || p2isright || p3isright) {
			 
			 System.out.println("We have a winner!");
			 System.out.println("Player1 got it right?"+p1isright);
			 System.out.println("Player2 got it right?"+p2isright);
			 System.out.println("Player3 got it right?"+p3isright);
			 System.out.println("Game is over");
			 ;
			 
			 break;
			 

		 }
		 else 
			 System.out.println("Player will have to try again");
		 }
	
}
}
