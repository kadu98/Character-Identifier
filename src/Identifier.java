import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Identifier
{

public String[] id (String[] hexString)   { //Method utilizes csv file to create Array of Strings
 
ArrayList<String> list = null;

{
    File file =new File("entityfacts.csv");
    Scanner in = null;
    try {
        in = new Scanner(file);
        
        while(in.hasNext())
        {
            String line=in.nextLine();
            
           
          //hexString is called from CharacID.java method convertToHex
          //hexString[0] is the String hexString1. Below method checks for hexString1 in csv file.
       if(line.contains(hexString[0]))  { 
            list = new ArrayList<String>(Arrays.asList(line.split("\\s*,\\s*"))); //Splits csv file info by commas and by brackets (arrays).
            String x = list.get(3); // Gets 3rd element of array in csv file which is Alpha Entity
            String y = list.get(4); // Gets 4th element of array in csv file which is english form
            String hex = list.get(1);
            System.out.println(list); //Prints list/array so user can verify if JFrame info is correct.
            System.out.println("Alpha Entity: "+x); //String x is the Alpha Entity 
            System.out.println("English form: "+y); //String y is the written English form of character
          
          
   
            
            System.out.println("The hex unicode number is:" + hex);
            return new String[]{x,y,hex};
    //System.out.println("The Hex Entity is: "+hexEntity);
       }
      
       if(line.contains(hexString[1])) { //Checks for hexString2 in csv file.
       list = new ArrayList<String>(Arrays.asList(line.split("\\s*,\\s*")));
           String x = list.get(3);
           String y = list.get(4);
           String hex = list.get(1);
           System.out.println(list);
           System.out.println("Alpha Entity: "+x);
           System.out.println("English form: "+y);
           System.out.println("The hex unicode number is:" + hex);
           return new String[]{x,y,hex};
        }     
        }      
        
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return new String[]{"Not found","Not found","Not found"}; // To allow the program to return values, each aspect of program must return some values. 
}   // if the program cannot find hexString1 or hexString2 in the csv file, it will return the above array.
}

}​

