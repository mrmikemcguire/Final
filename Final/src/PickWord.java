
public class PickWord 
	{
	static String theWord[] = new String [8];
	//static String  theWord[] = {"_ ","_ ","_ ","_ ","_ ","_ ","_ ","_ "};
	static String pickedWord;
	public static void word()
		{
		pickingWord();
		}
	public static void pickingWord()
		{
		for(int i =0; i < theWord.length; i++)
		{
			theWord[i] = "_ ";
		}
		String word[] = {"aardvark ", "football", "earthily", "feminist ", "firebird" ,"scorpion"};
		int randomWord = (int)(Math.random()*6);
		pickedWord = word[randomWord];
		
			//[]theWord= {"_ ","_ ","_ ","_ ","_ ","_ ","_ ","_ "};
//	
			//for (String s : theWord)
				//System.out.println(s);
			for(int i =0; i < pickedWord.length(); i++)
				{
				System.out.print(theWord[i]);
				}
		
	 
			}
	}
	
