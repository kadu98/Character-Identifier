/* We plan to have separate parallel list for each thing we want to display. I have demonstrated with
 * two example list: hex and english. Method searches hex list for what would be user input then gets
 * the index of that element. Then it outputs the english translation at that index fro the english 
 * list.
 */
import java.util.Arrays;

public class Identifier
{
public static void main(String argsp[]) {
String[] english = {"Cyrillic small letter el"};
String[] hex = {"0x43b"};
String translation = null;
for(String item : hex) {
	if(Arrays.asList(hex).contains("0x43b"))
		translation = english[Arrays.asList(hex).indexOf("0x43b")];
	
}
System.out.println(translation);
}
}