import java.util.Scanner;
public class Welcome
	{
	public static void greet()
		{
		askName();
		complements();
		}
	
	public static void askName()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name + "! Let's play hang man.");
		}
	public static void complements()
		{
		String[] complements = {"You rock! ", "I love your hair!", "You look awsome!", "You look great in that mullen polo!", "Your mom loves you!"};
		int randomNumber = (int)(Math.random()*4)+1;
		System.out.println(complements[randomNumber]);
		}
	}
