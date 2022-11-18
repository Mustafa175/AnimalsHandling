package com.example.Animalshandling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class AnimalshandlingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AnimalshandlingApplication.class.getResource("Animals.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Animalshandling!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();






    }
}