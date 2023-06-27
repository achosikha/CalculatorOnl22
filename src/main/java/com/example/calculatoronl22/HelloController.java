package com.example.calculatoronl22;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField expression;
    private StringBuilder outPutExpression;
    private String expressionSymbol;

    public void sum(ActionEvent actionEvent) {
        // sum variables
    }

    public void insertNum(ActionEvent actionEvent) {
        // getSource() -> выделяет кнопку, которая нажата
        Button btn = (Button) actionEvent.getSource();

        outPutExpression = new StringBuilder(expression.getText());

        outPutExpression.append(btn.getText());
        //expression.setText(String.valueOf(outPutExpression));
        expression.setText(outPutExpression.toString());
    }

    public void mathExpression(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();

        outPutExpression.append(btn.getText());
        expression.setText(outPutExpression.toString());
        expressionSymbol = btn.getText();
    }

    public void clear(ActionEvent actionEvent) {
        if (outPutExpression.length() > 0)
        {
            outPutExpression.delete(0, outPutExpression.length());
            expression.setText("");
        }
    }

    public void backspace(ActionEvent actionEvent) {
        if (outPutExpression.length() > 0)
        {
            outPutExpression.delete(outPutExpression.length() - 1, outPutExpression.length());
            expression.setText(outPutExpression.toString());
        }
    }

    public void mathExpressionResult()
    {
        // +, * -> \\*, \\+

        // Задача 1: добавить возможность деления строки на * и +
        String[] statement = expression.getText().split(expressionSymbol); // *
        double expressionResult = 0;

        switch (expressionSymbol)
        {
            case "-":
                expressionResult = Double.parseDouble(statement[0]) - Double.parseDouble(statement[1]);
                break;
            case "*":
                expressionResult = Double.parseDouble(statement[0]) * Double.parseDouble(statement[1]);
                break;
            case "/":
                expressionResult = Double.parseDouble(statement[0]) / Double.parseDouble(statement[1]);
                break;
            case "+":
                expressionResult = Double.parseDouble(statement[0]) + Double.parseDouble(statement[1]);
                break;
        }
        expression.setText(String.valueOf(expressionResult));
    }
}

// Задача 2: добавить возможность операций над дробными числами
// с учетом 0 и количества точек в строчке

// Задача 3: возможность обработки сложной строки: 45 + 34 - 9 * 10