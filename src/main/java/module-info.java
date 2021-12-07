module com.example.assignment10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires junit;


    opens com.example.assignment10 to javafx.fxml;
    exports com.example.assignment10;
}