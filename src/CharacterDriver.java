import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;

import javax.swing.JTextField;

import javax.swing.JTextPane;



import java.awt.BorderLayout;

import java.awt.Dimension;

import java.awt.FlowLayout;

import java.awt.Font;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;



import javax.swing.JPanel;

import javax.swing.SpringLayout;



public class CharacterDriver extends JFrame implements ActionListener { // Driver and JFrame class

				

	        public static void main(String[] args)

	        {

		        	new CharacterDriver().setVisible(true); //displays CharacterDriver1 method in JFrame 

                          	   

	    	}

	        public CharacterDriver() { //Creates JFrame window

	        	super("Character Identifier");

	        	setSize (600,600);

	        	setResizable(false);

	        	setDefaultCloseOperation(EXIT_ON_CLOSE);

	        

	        	initialize(); //Method that specifies necessary elements of JFrame window.

	        	

	        }//Below is an array of messages that will be displayed as JLabels in window.

	        String[] messages = {"In Words:","Hex Unicode:","Decimal Unicode:","Alpha Entity:","Hex Entity:","Decimal Entity:","Java Code:","UTF-8:"};

	    	private JLabel[] labels = new JLabel[messages.length];

	    	private JTextArea[] textArea = new JTextArea[messages.length];

	    	private JLabel label;

	    	private JTextPane textPane;

	    	private JTextArea text;

	    	private JTextField inWords;

	    	private JTextField enlarged;

	    	private JTextField hexUnicode;

	    	private JTextField decimalUnicode;

	    	private JTextField alphaEntity;

	    	private JTextField hexEntity;

	    	private JTextField decimalEntity;

	    	private JTextField javaCode;

	    	private JTextField UTF8;

	    	

	        private void initialize(){

	        	JPanel panel = new JPanel();

	        	

	        	JScrollPane scroll = new JScrollPane();

	        	

	        	enlarged = new JTextField(); // TextField that will display character in bigger font

	        	

	        	enlarged.setFont(new Font("Times", Font.PLAIN, 30));  //Sets font for anything typed in this field to be larger.

	        	enlarged.setPreferredSize(new Dimension(50,50));

	        	

	        	inWords=new JTextField();

	        	inWords.setPreferredSize(new Dimension(400,43));

	        	

	        	

	    		SpringLayout sl_panel = new SpringLayout(); //Using SpringLayout to set locations of JTextFields. 

	    		//Used WindowBuilder to move textfields and other elements around. 

	    		sl_panel.putConstraint(SpringLayout.NORTH, inWords, 6, SpringLayout.SOUTH, enlarged);

	    		sl_panel.putConstraint(SpringLayout.WEST, inWords, 0, SpringLayout.WEST, enlarged);

	    		sl_panel.putConstraint(SpringLayout.SOUTH, inWords, -376, SpringLayout.SOUTH, panel);

	    		sl_panel.putConstraint(SpringLayout.EAST, inWords, 0, SpringLayout.EAST, enlarged);

	    		sl_panel.putConstraint(SpringLayout.WEST, enlarged, 133, SpringLayout.WEST, panel);

	    		sl_panel.putConstraint(SpringLayout.SOUTH, enlarged, -425, SpringLayout.SOUTH, panel);

	    		sl_panel.putConstraint(SpringLayout.EAST, enlarged, -67, SpringLayout.EAST, panel);

	    	

	    		

	    		panel.setLayout(sl_panel);

	        	

	    	// Below three lines add scroll, inWords textfield, and enlarged textField.

	    		panel.add(scroll);

	    		panel.add(inWords);

	    		panel.add(enlarged); 

	    	

	    	

	    		//Below: Creates a series of labels and puts them in a certain location based upon number of messages inputted

	    		for(int i = 0; i < labels.length; i++){ 

	    			labels[i] = new JLabel(messages[i]);

	    			labels[i].setBounds(6, 150 + i * 48, 800, 16);

	    			getContentPane().add(labels[i]);

	    			

	    			

	    			

	    		}

	    		



	        	//Below: code to create a menu bar.

	        	JMenuBar bar=new JMenuBar();

	        	JMenu file= new JMenu("File");

	        	JMenuItem open = new JMenuItem("Open Recent");

	        	JMenuItem save = new JMenuItem("Save");

	        	JMenuItem calculate= new JMenuItem("Calculate");

	        	JMenuItem exit = new JMenuItem("Exit");

	        	

	        	JMenuItem[] items ={open, save, calculate, exit}; //Creates tabs within menu that can be clicked.

	        	for(JMenuItem item: items){

	        		item.addActionListener(this);

	        	}//Below: these five lines add items to menu

	        	file.add(open);

	        	file.add(save);

	        	file.add(calculate);

	        	file.addSeparator();

	        	file.add(exit);

	        	

	        	panel.add(scroll);

	        	getContentPane().add(panel);

	        	

	        	text= new JTextArea(); //TextArea to input character

	        	sl_panel.putConstraint(SpringLayout.NORTH, enlarged, 22, SpringLayout.SOUTH, text);

	        	sl_panel.putConstraint(SpringLayout.NORTH, text, 21, SpringLayout.NORTH, panel);

	        	sl_panel.putConstraint(SpringLayout.WEST, text, 135, SpringLayout.WEST, panel);

	        	panel.add(text);

	        	text.setPreferredSize(new Dimension(100, 50));

	        	

	        	JLabel lblEnterCharacter = new JLabel("Enter Character :"); 

	        	sl_panel.putConstraint(SpringLayout.NORTH, lblEnterCharacter, 38, SpringLayout.NORTH, panel);

	        	sl_panel.putConstraint(SpringLayout.WEST, lblEnterCharacter, 10, SpringLayout.WEST, panel);

	        	panel.add(lblEnterCharacter);

	        	

	        	JLabel lblEnlarged = new JLabel("Enlarged:");

	        	sl_panel.putConstraint(SpringLayout.NORTH, lblEnlarged, 48, SpringLayout.SOUTH, lblEnterCharacter);

	        	sl_panel.putConstraint(SpringLayout.WEST, lblEnlarged, 0, SpringLayout.WEST, lblEnterCharacter);

	        	panel.add(lblEnlarged);

	        	

	        	//Below are created TextFields for each of the entities for which they are labeled as.

	        	hexUnicode = new JTextField();

	        	sl_panel.putConstraint(SpringLayout.NORTH, hexUnicode, 6, SpringLayout.SOUTH, inWords);

	        	sl_panel.putConstraint(SpringLayout.WEST, hexUnicode, 0, SpringLayout.WEST, inWords);

	        	//sl_panel.putConstraint(SpringLayout.EAST, hexUnicode, 0, SpringLayout.EAST, hexUnicode);

	        	hexUnicode.setPreferredSize(new Dimension(400, 43));

	        	panel.add(hexUnicode);

	        	

	        	decimalUnicode = new JTextField();

	        	sl_panel.putConstraint(SpringLayout.NORTH, decimalUnicode, 235, SpringLayout.NORTH, panel);

	        	sl_panel.putConstraint(SpringLayout.WEST,decimalUnicode, 0, SpringLayout.WEST, inWords);

	        	decimalUnicode.setPreferredSize(new Dimension(400, 43));

	        	panel.add(decimalUnicode);

	        	

	        	alphaEntity = new JTextField();

	        	sl_panel.putConstraint(SpringLayout.NORTH, alphaEntity, 6, SpringLayout.SOUTH, decimalUnicode);

	        	sl_panel.putConstraint(SpringLayout.EAST, alphaEntity, 0, SpringLayout.EAST, inWords);

	        	alphaEntity.setPreferredSize(new Dimension(400, 43));

	        	panel.add(alphaEntity);

	        	

	        	hexEntity = new JTextField();

	        	sl_panel.putConstraint(SpringLayout.NORTH, hexEntity, 6, SpringLayout.SOUTH, alphaEntity);

	        	sl_panel.putConstraint(SpringLayout.EAST, hexEntity, 0, SpringLayout.EAST, inWords);

	        	hexEntity.setPreferredSize(new Dimension(400, 43));

	        	panel.add(hexEntity);

	        	

	        	decimalEntity = new JTextField();

	        	sl_panel.putConstraint(SpringLayout.NORTH, decimalEntity, 6, SpringLayout.SOUTH, hexEntity);

	        	sl_panel.putConstraint(SpringLayout.WEST, decimalEntity, 0, SpringLayout.WEST, inWords);

	        	decimalEntity.setPreferredSize(new Dimension(400, 43));

	        	panel.add(decimalEntity);

	        	

	        	javaCode = new JTextField();

	        	sl_panel.putConstraint(SpringLayout.NORTH, javaCode, 6, SpringLayout.SOUTH, decimalEntity);

	        	sl_panel.putConstraint(SpringLayout.WEST, javaCode, 0, SpringLayout.WEST, inWords);

	        	javaCode.setPreferredSize(new Dimension(400, 43));

	        	panel.add(javaCode);

	        	

	        	UTF8 = new JTextField();

	        	sl_panel.putConstraint(SpringLayout.NORTH, UTF8, 6, SpringLayout.SOUTH, javaCode);

	        	sl_panel.putConstraint(SpringLayout.WEST, UTF8, 0, SpringLayout.WEST, inWords);

	        	UTF8.setPreferredSize(new Dimension(400, 43));

	        	panel.add(UTF8);	

	        	

	        	

	        	bar.add(file);

	        	setJMenuBar(bar);



	        }

			@Override

			public void actionPerformed(ActionEvent e) { //Each menu option has a corresponding method called when clicked

				if(e.getActionCommand().equals("Open Recent")){

					open();

				}else if (e.getActionCommand().equals("Save")){

					save();

				}else if(e.getActionCommand().equals("Calculate")){

					

					String characterInput = text.getText();

					char ch = characterInput.charAt(0);

					CharacId myFile = new CharacId();

		            String[] hex = myFile.convertToHex(ch);

		            Identifier myFile2 = new Identifier();

		            

		            myFile2.id(hex); //Calls hex value from Identifier class.

		            

		            

		            myFile.hexEntity(ch); //Calls hex entity from CharacID class

		            myFile.javaEntity(ch); // This group of 5 lines calls values to be printed in Eclipse Console

		            myFile.UTF8(ch);

		            myFile.decimalString(ch);

		            myFile.decimalEntity(ch);

		            

		            //The 6 lines below correspond methods that return Strings with corresponding JTextFields to output in window.

		            hexEntity.setText(myFile.hexEntity(ch));

		            javaCode.setText(myFile.javaEntity(ch));

		            UTF8.setText(myFile.UTF8(ch));

		            decimalUnicode.setText(myFile.decimalString(ch));

		            decimalEntity.setText(myFile.decimalEntity(ch));

		            enlarged.setText(fontChange(ch));

		            

		            // Below: creates Array data to store the array returned by id method in identifier class 

		            String[] data = myFile2.id(myFile.convertToHex(ch));

		            

		            

		            //Below 3 lines: use data Array (above) to get elements of array

		            alphaEntity.setText(data[0]);

		            inWords.setText(data[1]);

		            hexUnicode.setText(data[2]);

		            

		            

         

				}else if (e.getActionCommand().equals("Exit")){ // If exit option clicked, window will close

					System.exit(0);

				}

				

				

			}

			private String fontChange(char ch){ // Converts inputted character (ch) to String

				String ch1 = "" + ch;

				return(ch1);

				

				

			}

			private void open(){ //Open method option in menu bar allows user to open previous character search if previous search was saved.

				try{

					BufferedReader br = new BufferedReader(new FileReader("file.txt"));

					String line;

					while((line = br.readLine()) !=null){

						text.append(line + "\n"+ "\n");

					}

					

					br.close();

				}catch (FileNotFoundException e){

					e.printStackTrace();

				}catch (IOException e){

					e.printStackTrace();

				}

					

			}

			private void save(){ //Allows user to save current search. Next time user opens program, user can reopen last character search.

				try{

					BufferedWriter bw=new BufferedWriter(new FileWriter("file.txt"));

					bw.write(text.getText());

					bw.close();

				}catch (IOException e){

					e.printStackTrace();

				}

			}

			

			

	}

