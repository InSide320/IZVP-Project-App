package com.example.izvp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.util.Scanner;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("sample.fxml"));
        FXMLLoader fxmlLoaderApp = new FXMLLoader(Application.class.getResource("app.fxml"));
        stage.setTitle("My First App");
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        Scene scaneHome = new Scene(fxmlLoaderApp.load(),700,400);
        stage.setScene(scene);
        stage.setScene(scaneHome);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
