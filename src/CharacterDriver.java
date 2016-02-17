public class CharacterDriver
{

	public static void main(String[] args)
	{
		//CharacId myFile2 = new CharacId();
		
		CharacId myFile = new CharacId();
		char ch = myFile.Scanner();
		String[] hex = myFile.convertToHex(ch);
		
		Identifier myFile2 = new Identifier();
		myFile2.id(hex);
		myFile.print(ch);
	
		
		
	}

}
