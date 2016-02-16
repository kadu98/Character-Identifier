import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Identifier
{
public void id (String[] hexString)   {
	
ArrayList<String> list = null;

{
    File file =new File("entityfacts.csv");
    Scanner in = null;
    try {
        in = new Scanner(file);
        
        while(in.hasNext())
        {
            String line=in.nextLine();
            
           
            
       if(line.contains(hexString[0]))  {
            list = new ArrayList<String>(Arrays.asList(line.split("\\s*,\\s*")));
            String x = list.get(3);
            String y = list.get(4);
            String hex = list.get(1);
            System.out.println(list);
            System.out.println("Alpha Entity: "+x);
            System.out.println("English form: "+y);
            //String hex = z;
            System.out.println("The hex unicode number is:" + hex);
           
    		//System.out.println("The Hex Entity is: "+hexEntity);
       }
      
       if(line.contains(hexString[1])) {
    	   list = new ArrayList<String>(Arrays.asList(line.split("\\s*,\\s*")));
           String x = list.get(3);
           String y = list.get(4);
           String hex = list.get(1);
           System.out.println(list);
           System.out.println("Alpha Entity: "+x);
           System.out.println("English form: "+y);
           //String hex = z;
           System.out.println("The hex unicode number is:" + hex);
           
        }
      
         
            	
        }
        
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}
}
}
