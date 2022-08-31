package SimpleSumCalc;

import java.io.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;

public class SimpleSumCalc{

    String number1;
	String number2;
	boolean error_flag;
	int number3;

	@FXML
    private ComboBox ComboBox1;

    @FXML
    private Button button1;

    @FXML
    private TextField display1;

    @FXML
    private TextField display2;

    @FXML
    private TextField display3;

    @FXML
    public void initialize() {
    	ObservableList<String> list=FXCollections.observableArrayList("Plus +","Minus -","Divide :","Mult X");
    	
    	ComboBox1.setItems(list);
    	ComboBox1.setValue("choose operation!!!");
//    	display3.setText("FUCK ME");
    }   
    

    @FXML 

    void button1_Pressed(ActionEvent event) {
    	error_flag=false;
    	if(event.getSource()==button1 && ComboBox1.getValue().equals("Plus +"))
    	{
    		System.out.println("a+b");
        	number1=display1.getText();
        	number2=display2.getText();
        	number3=Integer.parseInt(number1)+Integer.parseInt(number2);
        	display3.setText(Integer.toString(number3));
    	}
    	
    	if(event.getSource()==button1 && ComboBox1.getValue().equals("Minus -"))
    	{
    		System.out.println("a-b");
        	number1=display1.getText();
        	number2=display2.getText();
        	number3=Integer.parseInt(number1)-Integer.parseInt(number2);
        	display3.setText(Integer.toString(number3));
    	}
    	
    	if(event.getSource()==button1 && ComboBox1.getValue().equals("Divide :"))
    	{
    		System.out.println("a:b");
        	number1=display1.getText();
        	number2=display2.getText();

        	
        		
        	try{number3=Integer.parseInt(number1)/Integer.parseInt(number2);}
        	catch(ArithmeticException e) 
        	{
        		System.out.println("Divided by zero operation cannot possible");
        		error_flag=true;

        	}
        	if(error_flag==true)
        		display3.setText("Error cant divide by zero");
        	else
        	display3.setText(Integer.toString(number3));
    	}
    	
    	if(event.getSource()==button1 && ComboBox1.getValue().equals("Mult X"))
    	{
    		System.out.println("a*b");
        	number1=display1.getText();
        	number2=display2.getText();
        	number3=Integer.parseInt(number1)*Integer.parseInt(number2);
        	display3.setText(Integer.toString(number3));
    	}
    	
    }
    
   


    

}
