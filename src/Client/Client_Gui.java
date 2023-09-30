package Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Client_Gui {

    String msg;

    @FXML
    private Button Btn;

    @FXML
    private Label Label;

    @FXML
    private TextField TxtField1;

    @FXML
    private TextField TxtField2;

    @FXML
    void Btn_Pressed(ActionEvent event) {
        msg = TxtField1.getText();
        TxtField2.setText(msg);

    }

}
