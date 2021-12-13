module com.example.izvp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
//    requires mysql.connector.java;


    opens com.example.izvp to javafx.fxml;
    exports com.example.izvp;
    exports com.example.izvp.Controllers;
    opens com.example.izvp.Controllers to javafx.fxml;
}