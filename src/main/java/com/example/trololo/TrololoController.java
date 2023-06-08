package com.example.trololo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class TrololoController {
    @FXML
    private Button yes;
    @FXML
    private Button no;
    @FXML
    private Label label;

    @FXML
     void Yes() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Информация для идиота");
        alert.setHeaderText("Поздравляю!");
        alert.setContentText("Теперь вы полноправный идиот!");
        Button button = (Button) alert.getDialogPane().lookupButton(ButtonType.OK);
        button.setText("ОК");
        button.setStyle("-fx-background-color: #ff0000; -fx-text-fill: #ffffff;");
        alert.show();
    }
    @FXML
    void Nooo() {
    no.setOnMouseEntered(event -> {
        double x = Math.random() * (no.getParent().getLayoutBounds().getWidth() - no.getWidth());
        double y = Math.random() * (no.getParent().getLayoutBounds().getHeight() - no.getHeight());
        if (x == no.getLayoutX() && y == no.getLayoutY()) {
            x = Math.random() * (no.getParent().getLayoutBounds().getWidth() - no.getWidth());
            y = Math.random() * (no.getParent().getLayoutBounds().getHeight() - no.getHeight());
        } else if (x == yes.getLayoutX() && y == yes.getLayoutY()) {
            x = Math.random() * (no.getParent().getLayoutBounds().getWidth() - no.getWidth());
            y = Math.random() * (no.getParent().getLayoutBounds().getHeight() - no.getHeight());
        } else if (x == label.getLayoutX() && y == label.getLayoutY()) {
            x = Math.random() * (no.getParent().getLayoutBounds().getWidth() - no.getWidth());
            y = Math.random() * (no.getParent().getLayoutBounds().getHeight() - no.getHeight());
        }
        no.setLayoutX(x);
        no.setLayoutY(y);

    });
    }
}