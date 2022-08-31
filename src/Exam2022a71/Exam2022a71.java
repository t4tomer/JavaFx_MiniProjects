package Exam2022a71;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exam2022a71  extends Thread {

    int i=0;
    ArrayList<Image> arr=new ArrayList<Image>();
    // create objects of the images
    Image myImage1=new Image(getClass().getResourceAsStream("pic1.jpg"));
    Image myImage2=new Image(getClass().getResourceAsStream("pic2.jpg"));
    Image myImage3=new Image(getClass().getResourceAsStream("pic3.jpg"));
    Image myImage4=new Image(getClass().getResourceAsStream("pic4.jpg"));
    boolean flag=true;
    // add objects of the images to the arraylist 
       
    @FXML
    private Button CheckButt;

    @FXML
    private Button StartButt;

    @FXML
    private Button StopButt;

    @FXML
    private TextField TextField1;

    @FXML
    private ImageView myImageView;

    @FXML
    void CheckPressed(ActionEvent event) {

    }

    @FXML
    void  StartPressed(ActionEvent event) throws InterruptedException {
        arr.add(myImage1);
        arr.add(myImage2);
        arr.add(myImage3);
        arr.add(myImage4);
        // for (int i=0; i<arr.size(); i++) {
        //     myImageView.setImage(arr.get(3));

        // }
    while(flag){
        

    
        for (int i=0;i<4;i++)
        {
            Thread.sleep(1000);
            ArrayListImage(i);
            // Thread.sleep(1000);
            TextField1.setText(Integer.toString(i));

            // ArrayListImage(i);
            // System.out.println("i value: " + i);
            // try{
            //     Thread.sleep(1000);
            //     myImageView.setImage(arr.get(i));
            //     ArrayListImage(i);

            // }
            // catch (InterruptedException e){
            //     System.out.println("Interrupted");
            // }
            if(i==3)
                flag=false;
            
        
        }
    }


    
    }

    @FXML
    void StopPressed(ActionEvent event) {

    }
    public synchronized void ArrayListImage(int PicNum){
        // array list of images
        ArrayList<Image> arr=new ArrayList<Image>();
        // create objects of the images
        Image myImage1=new Image(getClass().getResourceAsStream("pic1.jpg"));
        Image myImage2=new Image(getClass().getResourceAsStream("pic2.jpg"));
        Image myImage3=new Image(getClass().getResourceAsStream("pic3.jpg"));
        Image myImage4=new Image(getClass().getResourceAsStream("pic4.jpg"));

        // add objects of the images to the arraylist 
        arr.add(myImage1);
        arr.add(myImage2);
        arr.add(myImage3);
        arr.add(myImage4);       
        //show the image on the window
        System.out.println(" PicNum: " + PicNum);

        myImageView.setImage(arr.get(PicNum));//set image on the window


    }

}
