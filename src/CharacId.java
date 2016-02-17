import java.util.Scanner;
import java.io.BufferedReader;

public class CharacId
{
	public char Scanner(){
	Scanner sca =new Scanner(System.in);
	System.out.println("enter a character");
	char ch =sca.next().charAt(0);
	return ch;
	}
	
	public void print(char ch) {
		String hexStringMajor = Integer.toHexString(ch);
 		String hexEntity = "&#x00" + hexStringMajor;
 		System.out.println("Hex Entity:"+hexEntity);
 		String javaEntity = "u00" + hexStringMajor;
		System.out.println("Java Code:"+javaEntity);
		String UTF8 = hexStringMajor;
		System.out.println("UTF-8 value: " +UTF8);
	}
	
	public String[] convertToHex(char ch) 
	{
		
		
		String hexStringMajor = Integer.toHexString(ch);  // hex value

		String hexStringAddition="0x";
		String hexString1 = "0x" + Integer.toHexString(ch | 0x10000).substring(1);
		String hexString2 = hexStringAddition + hexStringMajor;
		String[] hexString = {hexString1, hexString2};
		return hexString;
		
	}
	
	
		//public void 
		
		/*
			ch.setFont(new Font("TimesRoman", Font.PLAIN, 30)); 
			System.out.println(ch); // need to put into JFrame
		 */
		/*
	
		// decimal entity &#233
		//String decimalEntity= "&#" + decimal;
		//System.out.println(decimalEntity);


		*/

	}






