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
		String hexStringMajor = Integer.toHexString(ch);
 		String hexEntity = "&#x00" + hexStringMajor;
 		System.out.println("Hex Entity:"+hexEntity);
 		String javaEntity = "u00" + hexStringMajor;
		System.out.println("Java Code:"+javaEntity);
		String UTF8 = hexStringMajor;
		System.out.println("UTF-8 value: " +UTF8);

	}

}
