module com.example.trololo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trololo to javafx.fxml;
    exports com.example.trololo;
}