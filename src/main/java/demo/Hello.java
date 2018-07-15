package demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        VBox root = new VBox() {{
            getChildren().add(new TextField("have focus on default, but ..."));
            getChildren().add(new TextField("requesting focus !") {{
                Platform.runLater(this::requestFocus);
            }});
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}