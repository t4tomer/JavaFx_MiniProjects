package MemoryQuize;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controller1 {

    @FXML
    private Button Button1;

    @FXML
    private Label Label1;

    @FXML
    private TextField TextField1;

    @FXML
    public void initialize() {
        // Add an event handler to the button
        Button1.setOnAction(event -> {
            // Get the text from the TextField
            String text = TextField1.getText();

            // Set the text of the Label to the text from the TextField
            Label1.setText(text);
        });
    }
}
