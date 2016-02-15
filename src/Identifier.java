import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Identifier
{
public void id ()   {
	
ArrayList<String> list = null;

{
    File file =new File("entityfacts.csv");
    Scanner in = null;
    try {
        in = new Scanner(file);
        
        while(in.hasNext())
        {
            String line=in.nextLine();
            
           
            
       if(line.contains("0x294a")) {
            list = new ArrayList<String>(Arrays.asList(line.split("\\s*,\\s*")));
            //System.out.println(list);
            System.out.println(list.get(4));
       }
         
            	
        }
        
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}
}
}
