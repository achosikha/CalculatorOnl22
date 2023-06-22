module com.example.calculatoronl22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatoronl22 to javafx.fxml;
    exports com.example.calculatoronl22;
}