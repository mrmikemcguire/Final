
public class HangingMan 
{
	public static void stepsToHang()
		{
		System.out.println(PersonsPick.wrongCounter);
		if (PersonsPick.wrongCounter == 9)
			{
			firstHang();
			}
		if (PersonsPick.wrongCounter ==8)
			{
			secondHang();
			}
		if (PersonsPick.wrongCounter ==7)
			{
			thirdHang();
			}
		if (PersonsPick.wrongCounter ==6)
			{
			forthHang();
			}
		if (PersonsPick.wrongCounter ==5)
			{
			fithHang();
			}
		if (PersonsPick.wrongCounter ==4)
			{
			sixthHang();
			}
		if (PersonsPick.wrongCounter ==3)
			{
			seventhHang();
			}
		if (PersonsPick.wrongCounter ==2)
			{
			eighthHang();
			}
		if (PersonsPick.wrongCounter ==1)
			{
			ninethHang();
			}
		if (PersonsPick.wrongCounter ==0)
			{
			tenthHang();
			}
		}
	public static void firstHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void secondHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |    |");
		System.out.println("  |     ");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void thirdHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |    |-");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void forthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |   -|-");
		System.out.println("  |");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void fithHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |   -|-<");
		System.out.println("  |    ");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void sixthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |    ");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void seventhHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |     \\");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void eighthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |   / \\");
		System.out.println("  |");
		System.out.println(" ---");
		}
	public static void ninethHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |   / \\");
		System.out.println("  |  * "  );
		System.out.println(" ---");
		}
	public static void tenthHang()
		{
		System.out.println("  ______");
		System.out.println("  |    |");
		System.out.println("  |    O");
		System.out.println("  |  >-|-<");
		System.out.println("  |   / \\");
		System.out.println("  |  *   *"  );
		System.out.println(" ---");
		}
}
