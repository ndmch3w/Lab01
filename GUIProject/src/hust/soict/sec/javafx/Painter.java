package hust.soict.sec.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Painter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Painter.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Painter");
        stage.setScene(scene);
        stage.show();
    }
}
