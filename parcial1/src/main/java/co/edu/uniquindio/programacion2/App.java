package co.edu.uniquindio.programacion2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    
    String template = "main.fxml";
    
    @Override
    public void start(Stage stage) {
      FXMLLoader fxmlLoader = new FXMLLoader(ClienteApplication.class.getResource(template));
      Scene scene = new Scene(fxmlLoader.load());
      stage.setTitle("App Cliente");
      stage.setScene(scene);
      stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
