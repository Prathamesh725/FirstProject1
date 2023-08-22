package Project1;
import java.util.Random;
import java.util.Scanner;


public class NumberGame {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("             Pick any number           ");
		System.out.println("---------------------------------------");
		System.out.println();
		
		//generate random number
		Random rand = new Random();
		int random_number= rand.nextInt(99) + 1; 
		
		//Reading user input
		Scanner scn=new Scanner(System.in);
		System.out.print("Pick a number between 0 & 100(you have 5 guess):");
		int guess;
		int numberofTries=1; //Initial count of number guesses
		boolean win=false;
		
		while(win==false)
		{
			guess=scn.nextInt();  // Read Input of the user to see if it matches he random no.
			
			if(numberofTries<5)
			{
				if(guess==random_number)
				{
					//if number is guessed , while loop is terminated
					System.out.println();
					System.out.println("You Got it! It is Indeed:"+random_number);
					System.out.println("It only too you"+numberofTries+"Guesses no. to get it right");
					scn.close();
					win=true;
					
				}
				else if(guess<random_number)
				{
					//if guess is too low,program should tell us
					System.out.println("you are too low!");
					System.out.println();
					System.out.println("Guess again :");
				}
				else if(guess>random_number)
				{
					System.out.println("You are too high!");
					System.out.println();
					System.out.println("guess again :");
				}
			}
			//output of closing message & information to user depending on if they guessed right on their final guess.
			else if(numberofTries==5)
			{
				if (guess==random_number)
				{
					//if the number is guessed while loop is terminated
					System.out.println();
					System.out.println("You got it! It is indeed :"+random_number);
					System.out.println("It only took you" +numberofTries+"guess to get it right !");
					scn.close();
					win=true;
				}
				if(guess!=random_number)
				{
					//Then user didn't guess the correct number
					System.out.println();
					System.out.println("sorry you ran out of attempts the correct number is : "+random_number+"Better luck next time");
					scn.close();
					break;
				}
			}
			numberofTries=numberofTries+1; //Increament the count of no. of guess by 1	
		}
		
	}

}
