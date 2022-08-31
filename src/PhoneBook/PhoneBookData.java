package PhoneBook;

import java.io.IOException;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PhoneBookData {

    String name;
    String phone_number;
    int counter = 0; // used to count people in the list
    AssociationTable A1 = new AssociationTable();

    @FXML
    private TextField ShowNameField; // used to show name of person while searching phone number

    @FXML
    private TextField AddNameField; // Textfield that is used to enter the name of person

    @FXML
    private TextField AddPhoneField; // Textfield that is used to enter the phone number of person

    @FXML
    private Button Button1; // Submit for Add Name & Add Phone

    @FXML
    private Button Button2; // Submit for UpdateName & UpdatePhone

    @FXML
    private Button Button3; // Submit for Delete Name

    @FXML
    private Button Button5; // Sumbit for searching number by name

    @FXML
    private Button Button4; // used delet the list

    @FXML
    private Button Button6; // Sumbit for showing the list of people in the text field

    @FXML
    private TextField DeleteNameField;

    @FXML
    private TextField DeletePhoneField;

    @FXML
    private TextField DeleteList;

    @FXML
    private TextArea ShowPeopleField;

    @FXML
    private Label LabelTest;

    @FXML
    private TextField SearchNameByNumber;

    @FXML
    private TextField UpdateNameField;

    @FXML
    private TextField UpdatePhoneField;

    @FXML
    private Label Warning1;

    @FXML
    private Label Warning2;

    @FXML
    private Label Warning3;

    @FXML
    private Label Warning4;

    @FXML
    private Label Warning5;

    @FXML
    private Label Warning6;

    @FXML
    private Label Warning7;

    @FXML
    private AnchorPane rootPane;

    @FXML
    void Button1_pressed(ActionEvent event) { // Button1 is used to Add Name and or Add Phone
        DeleteList.setText("");
        name = AddNameField.getText();
        phone_number = AddPhoneField.getText();

        System.out.println("the name is :" + name);
        System.out.println(A1.check_NameIsEmpty(name));
        System.out.println("the phone number is :" + phone_number);
        System.out.println(A1.check_NameIsEmpty(phone_number));
        Warning1.setText(A1.check_NameIsEmpty(name));// check if name field is empty
        Warning2.setText(A1.check_PhoneNumber(phone_number)); // check if phone field is empty & if phone number
                                                              // contains letters
        if (A1.check_NameIsEmpty(name) == "" && A1.check_PhoneNumber(phone_number) == "") {
            A1.addPerson(name, phone_number);
            counter++;
        }

        A1.returnMap();
        System.out.println(A1.returnMap());
    }

    @FXML
    void Button2_pressed(ActionEvent event) { // Button2 is used to Update Name or/and Update Phone
        DeleteList.setText("");
        name = UpdateNameField.getText();
        phone_number = UpdatePhoneField.getText();

        Warning3.setText(A1.check_NameIsEmpty(name));// check if name field is empty
        Warning3.setText(A1.check_IfNameExist(name)); // check if name exists in the list
        Warning4.setText(A1.check_PhoneNumber(phone_number)); // check if phone field is empty & if phone number
                                                              // contains letters

        if (A1.check_NameIsEmpty(name) == "" && A1.check_PhoneNumber(phone_number) == ""
                && A1.check_IfNameExist(name) == "") {
            System.out.println("name:" + name + ",updated \n");
            System.out.println("phone_number:" + phone_number + ",updated \n");
            A1.addPerson(name, phone_number);
        }

    }

    @FXML
    void Button3_pressed(ActionEvent event) { // used to delete people from list
        DeleteList.setText("");
        name = DeleteNameField.getText();
        Warning5.setText(A1.check_IfNameExist(name));
        if (A1.check_NameIsEmpty(name) == "" && A1.check_IfNameExist(name) == "") {
            counter--;
            Warning5.setText("" + name + "deleted from list");
            A1.removeName(name);

        }

    }

    @FXML
    void Button4_pressed(ActionEvent event) { // used to delete the whole list
        A1.deleteList();
        DeleteList.setText("The list cleared");
        counter = 0;
    }

    @FXML
    void Button5_pressed(ActionEvent event) {
        DeleteList.setText("");
        name = SearchNameByNumber.getText();
        if (A1.check_NameIsEmpty(name) == "" && A1.check_IfNameExist(name) == "") {
            System.out.println("the phone number of" + name + "is" + A1.get_PhoneNumber_ByName(name));
            ShowNameField.setText(A1.get_PhoneNumber_ByName(name));
        } else
            ShowNameField.setText("Error");

    }

    @FXML
    void loadSecond(ActionEvent event) throws IOException {

        ShowPeopleField.setText(A1.convertWithIteration(A1.returnMap(), counter)); // used to print the people on the
                                                                                   // lowest text field
        System.out.println(A1.convertWithIteration(A1.returnMap(), counter)); // used to print the people in console

    }

}
