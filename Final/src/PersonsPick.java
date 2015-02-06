import java.util.Scanner;
public class PersonsPick 
	{
	static int guessesLeft;
	static int counter = 0;
	static int guessesCounter = 0;
	static String guess;
	//static String[] theWord= PickWord.pickingWord();
	static String [] newTheWord;
	
	public static void personsPick()
		{
		System.out.println(PickWord.pickedWord);
		for(int i =0; i < PickWord.pickedWord.length(); i++)
			{
			if(counter != 10)
				{
				askForGuess();
				System.out.println(PickWord.pickedWord);
				checkGuess();
				System.out.println(PickWord.theWord + ("this is the picked array"));
				}
			}
		}
	
	public static void askForGuess()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Guess a letter.");
		}
	public static void checkGuess()
		{

		Scanner userInput = new Scanner(System.in);
		guess = userInput.nextLine();
		counter++;
		for(int i =0; i < PickWord.pickedWord.length(); i++)
			{
			if(guess.equals(PickWord.pickedWord.substring(i,i+1)))
				{
				System.out.println(PickWord.theWord);
				PickWord.theWord[i].replace("_ ", guess);
				System.out.print(PickWord.theWord[i]);
	
				}
			else
				{
				System.out.print("_ ");
					guessesCounter = 10-counter;	
				}
				
			}
		
		
		System.out.println("You have " + guessesCounter + " guesses left, to save his life!" );
		}
	
	}
	

