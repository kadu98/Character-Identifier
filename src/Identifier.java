/* We plan to have separate parallel list for each thing we want to display. I have demonstrated with
 * two example list: hex and english. Method searches hex list for what would be user input then gets
 * the index of that element. Then it outputs the english translation at that index from the english 
 * list.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Identifier
{
public static void main(String argsp[])   {
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
