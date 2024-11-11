package pv211.multithreading;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("приложение");
        Label helloWorldLabel = new Label("приложение запущено успешно");
        Scene primaryScene = new Scene(helloWorldLabel);
        helloWorldLabel.setAlignment(Pos.CENTER);
        stage.setScene(primaryScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}