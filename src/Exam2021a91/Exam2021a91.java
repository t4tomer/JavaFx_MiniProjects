package Exam2021a91;


import java.util.ArrayList;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Exam2021a91 {
	
	private int score=0;
	private String word="aba";
	char[] char_array = new char[7];
	String str="";
	private ArrayList<String> Dictionary;
	
    public Exam2021a91(){// this is the constructor of Dictionary
    	
    	Dictionary=new ArrayList<String>();
    	Dictionary.add("test");
    	Dictionary.add("aaa");
    	Dictionary.add("bbb");
    	Dictionary.add("kcb");
    	Dictionary.add("kua");
    	Dictionary.add("oop");
    	
    	System.out.println(Dictionary);
    }
    

    @FXML
    private TextField ScoreField;
	
    @FXML
    private TextField TextField;
    
    @FXML
    private Button END_butt;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button but3;

    @FXML
    private Button but4;

    @FXML
    private Button but5;

    @FXML
    private Button but6;

    @FXML
    private Button but7;



    @FXML
    void but1Pressed(ActionEvent event) {
    	
    	
    	str=update_textfield(str,char_array[0]);
    	TextField.setText(str);
    }

    @FXML
    void but2Pressed(ActionEvent event) {
    	
    	str=update_textfield(str,char_array[1]);
    	TextField.setText(str);

    }

    @FXML
    void but3Pressed(ActionEvent event) {
    	str=update_textfield(str,char_array[2]);
    	TextField.setText(str);
    }

    @FXML
    void but4Pressed(ActionEvent event) {
    	str=update_textfield(str,char_array[3]);
    	TextField.setText(str);

    }

    @FXML
    void but5Pressed(ActionEvent event) {
    	str=update_textfield(str,char_array[4]);
    	TextField.setText(str);

    }

    @FXML
    void but6Pressed(ActionEvent event) {
    	str=update_textfield(str,char_array[5]);
    	TextField.setText(str);
    }

    @FXML
    void but7Pressed(ActionEvent event) {
    	str=update_textfield(str,char_array[6]);
    	TextField.setText(str);
    	

    }
    
    @FXML
    void EndPressed(ActionEvent event) {
    	    	if(isLegal(str))
    	{
    		score++;
    		System.out.println("true");
    	}
    	else
    	{		score--;
    			System.out.println("false");
    	}
    	ScoreField.setText(Integer.toString(score));//set the score on the score field

    	initialize();// randomize once again new letters for each button
    	str="";// reset the str
    	TextField.setText(str);//set the score on the score field

    }
    
    @FXML
    public void initialize() // Randomize letter for each button
    {
    	set_letters();// set random letter for each button 
    	
    }
    
    public String getRandomLetter() {  // get random letter from the abc
    	Random r = new Random();
    	char c = (char)(r.nextInt(26) + 'a');		
    	String letter=Character.toString(c);
    	return letter;
    }
    public void set_letters() // set the letters on each of the buttens
    {
    	for(int i=0;i<char_array.length;i++)
    	{
    		String letter=getRandomLetter();
    		char_array[i]=letter.charAt(0);
    	}
    	
    	 but1.setText("" +char_array[0]);
    	 but2.setText("" +char_array[1]);
    	 but3.setText("" +char_array[2]);
    	 but4.setText("" +char_array[3]);
    	 but5.setText("" +char_array[4]);
    	 but6.setText("" +char_array[5]);
    	 but7.setText("" +char_array[6]);
    }
    public String  update_textfield(String str,char letter) //update the str that is showing on textfield
    {
    	str=letter+str;
    	return str;
    }
    
    private void freeze_buttons( ) { //frreez buttons after pressing the end button
    	but1.setDisable(true);
    	but2.setDisable(true);
    	but3.setDisable(true);
    	but4.setDisable(true);
    	but5.setDisable(true);
    	but6.setDisable(true);
    	but7.setDisable(true);
    }


    public boolean isLegal(String word) {
    
    	if(Dictionary.contains(str))
    		return true;
    	return false;
    }
    
    
}

