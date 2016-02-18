import java.util.Scanner;
import java.io.BufferedReader;

public class CharacId 
{
        public char Scanner(){ //Allows for user input of a character.
        Scanner sca =new Scanner(System.in);
        System.out.println("enter a character");
        char ch =sca.next().charAt(0);
        return ch; // returns character as ch.
        }
        public String[] convertToHex(char ch)  // converts ch to hex unicode
        {       
                String hexStringMajor = Integer.toHexString(ch);  // hex value
                String hexStringAddition="0x";
                String hexString1 = "0x" + Integer.toHexString(ch | 0x10000).substring(1); //creates Hex String of form "0x00" + hexStringMajor
                String hexString2 = hexStringAddition + hexStringMajor; //creates Hex String as "0x" + hexStringMajor
                
                String[] hexString = {hexString1, hexString2}; //creates array of two types of hex strings to search csv file for.
                return hexString; 
        
        }
        
        public void print(char ch){ //prints below information within the Java application (not JFrame)
        	String hexStringMajor = Integer.toHexString(ch);
            String hexEntity = "&#x00" + hexStringMajor; //gets Hex Entity
            System.out.println("Hex Entity: "+hexEntity);
            String javaEntity = "\\u00" + hexStringMajor; //Gets Java Entity
            System.out.println("Java Code: "+javaEntity);
            String UTF8 = hexStringMajor; //Gets UTF-8 Entity
            System.out.println("UTF-8 value: " +UTF8);
            int decimal1=Integer.parseInt(hexStringMajor,16); //Gets decimal unicode value of character inputted using hexStringMajor
            System.out.println("Decimal Unicode: "+decimal1);
            String decimalEntity = "&#" + decimal1; // Gets decimal Entity
            System.out.println("Decimal Entity: "+decimalEntity);
        }
        public String hexEntity(char ch){ //Method that returns hex Entity for purposes of displaying in JFrame window in a JTextField
	        	String hexStringMajor = Integer.toHexString(ch);
	            String hexEntity = "&#x00" + hexStringMajor;
	            System.out.println("Hex Entity: "+hexEntity);
	            return(hexEntity);
        }
        public String javaEntity(char ch){//Method that returns Java Code for purposes of displaying in JFrame window in a JTextField
        		String hexStringMajor = Integer.toHexString(ch);
	            String javaEntity = "\\u00" + hexStringMajor;
	            System.out.println("Java Code: "+javaEntity);
	            return(javaEntity);
        }
        public String UTF8(char ch){//Method that returns UTF-8 for purposes of displaying in JFrame window in a JTextField
        		String hexStringMajor = Integer.toHexString(ch);
	            String UTF8 = hexStringMajor;
	            System.out.println("UTF-8 value: " +UTF8);
	            return(UTF8);
        }
        
        public String decimalString(char ch){//Method that returns decimal unicode for purposes of displaying in JFrame window in a JTextField
        		String hexStringMajor = Integer.toHexString(ch);
	            int decimal=Integer.parseInt(hexStringMajor,16);
	            String decimalString=""+decimal;
	            System.out.println("Decimal Unicode: "+decimalString);
	            return (decimalString);
        }
        public String decimalEntity(char ch){//Method that returns decimal Entity for purposes of displaying in JFrame window in a JTextField
	        	String hexStringMajor = Integer.toHexString(ch);
	            int decimal=Integer.parseInt(hexStringMajor,16);
	            System.out.println("Decimal Unicode: "+decimal);
	            String decimalEntity = "&#" + decimal;
	            System.out.println("Decimal Entity: "+decimalEntity);
	        	return(decimalEntity);
        	
        }
        
       

        }​
