import java.util.Scanner;
public class PersonsPick 
	{
	static int guessesCounter = 10;
	static String guess;

	public static void personsPick()
		{
		for(int i =0; i < PickWord.pickedWord.length(); i++)
			{
			if(guessesCounter > 0)
				{
				askForGuess();
				System.out.println(PickWord.pickedWord);
				checkGuess();
				}
			}
		}
	
	public static void askForGuess()
		{
		System.out.println("Guess a letter.");
		}
	
	public static void checkGuess()
		{
		Scanner userInput = new Scanner(System.in);
		guess = userInput.nextLine();

		for(int i =0; i < PickWord.pickedWord.length() - 1; i++)
			{
			if(guess.equals(PickWord.pickedWord.substring(i,i+1)))
				{
				PickWord.theWord.set(i, guess);
				}
			}
		guessesCounter--;
		displayGrid();
		System.out.println("You have " + guessesCounter + " guesses left, to save his life!" );
		}
	
		public static void displayGrid()
			{
			for(String s : PickWord.theWord)
				{
				System.out.print(s + " ");
				}
			}
		}
	
	
	

