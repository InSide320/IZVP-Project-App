module com.example.izvp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.izvp to javafx.fxml;
    exports com.example.izvp;
}