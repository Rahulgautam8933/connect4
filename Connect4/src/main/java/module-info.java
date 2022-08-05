module com.example.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.connect4 to javafx.fxml;
    exports com.example.connect4;
}