package Exam2022a89;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exam2022a89 {
    public int PicNum=0;
    public String JumpPicNum;

    @FXML
    private Button JumpButt;

    @FXML
    private Label Label;

    @FXML
    private Button NextButt;

    @FXML
    private TextField display1;

    @FXML
    private ImageView myImageView;

    @FXML
    void JumpPic(ActionEvent event) {
        JumpPicNum=display1.getText();//get text from textbox
        PicNum=Integer.parseInt(JumpPicNum);// insret the number of textbox to PicNum
        ArrayListImage(PicNum);//show PicNum picture
    }

    @FXML
    void NextPic(ActionEvent event) {
        ArrayListImage(PicNum);//show PicNum picture
        PicNum++;//each press increments PicNum counter
        if(PicNum==8)// rest the counter
            PicNum=0;


    }

    public void ArrayListImage(int PicNum){
        // array list of images
        ArrayList<Image> arr=new ArrayList<Image>();
        // create objects of the images
        Image myImage0=new Image(getClass().getResourceAsStream("pic_nature0.jpg"));
        Image myImage1=new Image(getClass().getResourceAsStream("pic_nature1.jpg"));
        Image myImage2=new Image(getClass().getResourceAsStream("pic_nature2.jpg"));
        Image myImage3=new Image(getClass().getResourceAsStream("pic_nature3.jpg"));
        Image myImage4=new Image(getClass().getResourceAsStream("pic_nature4.jpg"));
        Image myImage5=new Image(getClass().getResourceAsStream("pic_nature5.jpg"));
        Image myImage6=new Image(getClass().getResourceAsStream("pic_nature6.jpg"));
        Image myImage7=new Image(getClass().getResourceAsStream("pic_nature7.jpg"));

        // add objects of the images to the arraylist 
        arr.add(myImage0);
        arr.add(myImage1);
        arr.add(myImage2);
        arr.add(myImage3);
        arr.add(myImage4);       
        arr.add(myImage5);       
        arr.add(myImage6);       
        arr.add(myImage7);       

        //show the image on the window
        myImageView.setImage(arr.get(PicNum));//set image on the window
        Label.setText(Integer.toString(PicNum));//set text on label above the picture


    }

}
