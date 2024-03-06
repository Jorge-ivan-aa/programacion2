package co.edu.uniquindio.programacion2.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("lOS cHAMOS!");
    }
}
