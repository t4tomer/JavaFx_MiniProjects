package Exam2022a61;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Exam2022a61 {

    @FXML
    private Canvas Canvas1;

    @FXML
    private Button StartButt;

    @FXML
    void StartPressed(ActionEvent event) {
        Rectangle rect1 = new Rectangle(100, 100, 200, 200);
        rect1.setFill(Color.BLUE);
    }

}
