import java.util.Scanner;
public class HangMan 
	{
	public static void main(String[] args)
		{
		Welcome.greet();
		Hanger.hanger();
		PickWord.fillArray();
		PersonsPick.personsPick();
		HangingMan.stepsToHang();	
		}
	}

