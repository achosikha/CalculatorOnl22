package com.example.calculatoronl22;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField expression;

    public void showMsg(ActionEvent actionEvent) {
        expression.setText("Welcome to my JavaFx Application...");
    }
}