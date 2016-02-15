import java.util.Scanner;
import java.io.BufferedReader;

public class CharacId
{

	public static void main(String[] args)
	{
		Scanner sca =new Scanner(System.in);
		System.out.println("enter a character");
		char ch =sca.next().charAt(0);
		
		String hexStringMajor = Integer.toHexString(ch); 
		
		String hexStringAddition="0x";
		String hexString= hexStringAddition +hexStringMajor;
		System.out.println(hexString);
		System.out.println(hexStringMajor);
		
		

	  }
	/*
    	public static int hex2decimal(String hexStringMajor) {
            String digits = "0123456789ABCDEF";
            s = s.toUpperCase();
            int val = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int d = digits.indexOf(c);
                val = 16*val + d;
            }
            return val;
        }​
*/
}

	  
