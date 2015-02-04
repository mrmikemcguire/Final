
public class PickWord 
	{
	static String pickedWord;
	static String [] theWord;
	public static void word()
		{
		pickingWord();
		}
	public static String[] pickingWord()
		{

		String[] word = {"blueberry ","muffins", "America", "mullen", "football", "cinderela" };
		int randomWord = (int)(Math.random()*6);
		pickedWord = word[randomWord];
		if(randomWord == 0)
			{
			String theWord[]= {"_ ","_ ","_ ","_ ","_ ","_ ","_ ","_ ","_ "};
			for(int i =0; i < theWord.length; i++)
				{
				System.out.print(theWord[i]);
				}
			return theWord;
			
			}
		if(randomWord == 1)
			{
			String theWord[]= {"_ ","_ ","_ ","_ ","_ ","_ ","_ "};
			for(int i =0; i < theWord.length; i++)
				{
				System.out.print(theWord[i]);
				}
			return theWord;
			}
		if(randomWord == 2)
			{
			String theWord[]= {"_ ","_ ","_ ","_ ","_ ","_ ","_ "};
			for(int i =0; i < theWord.length; i++)
				{
				System.out.print(theWord[i]);
				}
			return theWord;
			}
		if(randomWord == 3)
			{
			String theWord[]= {"_ ","_ ","_ ","_ ","_ ","_ "};
			for(int i =0; i < theWord.length; i++)
				{
				System.out.print(theWord[i]);
				}
			return theWord;
			}
		if(randomWord == 4)
			{
			String theWord[]= {"_ ","_ ","_ ","_ ","_ ","_ ","_ ","_ "};
			for(int i =0; i < theWord.length; i++)
				{
				System.out.print(theWord[i]);
				}
			return theWord;
			}
		if(randomWord == 5)
			{
			String theWord[]= {"_ ","_ ","_ ","_ ","_ ","_ ","_ ","_ ","_ "};
			for(int i =0; i < theWord.length; i++)
				{
				System.out.print(theWord[i]);
				}
			return theWord;
			}
		return theWord;
		}
	}
