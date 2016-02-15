
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CharacId
{

	public static void main(String[] args)
	{
		CharacId obj = new CharacId();
		obj.run();

	  }

	  public void run() {

		String csvFile = "entityfacts.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader("entityfacts.csv"));
			while ((line = br.readLine()) != null) {

			        // use comma as separator
				
				System.out.println(line);
				
	char c = 'a';
	String a = Integer.toHexString(c); 
	System.out.println(a);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	  }

	

	}


