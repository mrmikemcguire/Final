import java.util.Scanner;
public class PersonsPick 
	{
	static int guessesLeft;
	static int counter = 0;
	static int wrongCounter = 0;
	static String guess;
	static String[] theWord= PickWord.pickingWord();
	public static void personsPick()
		{
		askForGuess();
		checkGuess();
		}
	public static void askForGuess()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Guess your first letter.");
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
				System.out.print(theWord[i].replace("_", guess));
				}
			else
				{
				System.out.print("_ ");
					wrongCounter = 10-counter;	
				
				}
				
			}
		
		
		System.out.println("You have " + wrongCounter + " guesses left, to save his life!" );
		}
	
	}
	

