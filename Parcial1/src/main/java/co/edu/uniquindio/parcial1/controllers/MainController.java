package co.edu.uniquindio.parcial1.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;

public class MainController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
 
    
    /* Operaciones */
    @FXML
    private Button buttonConsultarPropietarios;
    @FXML
    private Button buttonConsultarUsuario;
    @FXML
    private Button buttonConsultarVehiculo;
    @FXML
    private TextArea txtResultado;
    

    /* Usuario */
    @FXML
    private TextField txtEdad;
    @FXML
    private SplitMenuButton splitMenuTransporte;
    @FXML
    private Button buttonCrearUsuario;


    /* Vehiculo */
    @FXML
    private SplitMenuButton menuPropietario;
    @FXML
    private TextField txtPlaca;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtColor;
    @FXML
    private RadioButton rbuttonVehiculoCarga;
    @FXML
    private TextField txtNumeroejes;
    @FXML
    private TextField txtCapacidadCarga;
    @FXML
    private RadioButton rbuttonVehiculoPasajero;
    @FXML
    private TextField txtNumeroPasajeros;
    @FXML
    private Button buttonCrearVehiculo;


    /* Propietario */
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtcedula;
    @FXML
    private TextField txtemail;
    @FXML
    private TextField txtcelular;
    @FXML
    private Button btnAgregarPropietario;

    @FXML
    void onAgregarPropietario(ActionEvent event) {
        agregarPropietario();
    }

    @FXML
    void initialize() {

    }

    private void agregarPropietario() {

    }
}
