import java.util.Scanner;
public class HangMan 
	{
	public static void main(String[] args)
		{
		Welcome.greet();
		Hanger.hanger();
		PickWord.pickingWord();
		System.out.print(PickWord.theWord);
		PersonsPick.personsPick();
		HangingMan.stepsToHang();
			
		}
	}

