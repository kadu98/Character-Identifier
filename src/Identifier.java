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