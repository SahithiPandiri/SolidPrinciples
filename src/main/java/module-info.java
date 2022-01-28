module com.example.violation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.violation to javafx.fxml;
    exports com.example.violation;
}