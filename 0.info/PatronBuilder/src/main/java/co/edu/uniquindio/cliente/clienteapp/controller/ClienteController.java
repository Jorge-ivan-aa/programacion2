package co.edu.uniquindio.cliente.clienteapp.controller;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.clienteapp.model.Cliente;
import co.edu.uniquindio.cliente.clienteapp.model.Suscripcion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClienteController {

    private Cliente resultado;
    private String msj;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtTelefonoFijo;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextArea txtResultado;

    @FXML
    private ToggleGroup grupo1;

    @FXML
    private RadioButton rButtonClienteBasico;

    @FXML
    private RadioButton rButtonClientePremium;

    @FXML
    private RadioButton rButtonClienteVip;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    void onAgregarCliente(ActionEvent event) {
        txtResultado.setText("");
        agregarCliente();
    }

    @FXML
    void initialize() {

    }

   private void agregarCliente() {
      
      Suscripcion tiposCliente = new Suscripcion();

      String nombre = txtNombre.getText();
      String edad = txtEdad.getText();
      String apellido = txtApellido.getText();
      String numeroCelular = txtCelular.getText();
      String cedula = txtCedula.getText();
      String numeroTelefono = txtTelefonoFijo.getText();
      

      if (rButtonClienteBasico.isSelected()) {
          if (nombre != "" && edad != "" && apellido != "" && cedula != "") {
            int edadInt = Integer.parseInt(edad);
            resultado = tiposCliente.clienteBasic(nombre, apellido, edadInt, cedula);
          } else {
            this.msj = "Cliente basic requiere rellenar los campos nombre, apellido, edad, cedula";
          }
          
      } else if(rButtonClientePremium.isSelected()) {
          if (nombre != "" && edad != "" && apellido != "" && cedula != "" && numeroTelefono != "") {
             int edadInt = Integer.parseInt(edad);
             resultado = tiposCliente.clientePremium(nombre, apellido, edadInt, cedula, numeroTelefono);
          } else {
            this.msj = "Cliente premium requiere rellenarlos campos del cliente basico mas el numero de telefono";
          }

      } else if(rButtonClienteVip.isSelected()) {
          if (nombre != "" && edad != "" && apellido != "" && cedula != "" && numeroCelular != "") {
            int edadInt = Integer.parseInt(edad);
            resultado = tiposCliente.clienteVip(nombre, apellido, edadInt, cedula, numeroTelefono, numeroCelular);
          } else {
            this.msj = "Cliente vip requiere rellenar todos los campos";
          }
      } else {
          this.msj = "No se ha seleccionado ningun cliente";
      }
      
      if (resultado != null){
          txtResultado.setText("Se ha generado un nuevo" + resultado.toString());
          resultado = null;
      } else {
        txtResultado.setText(this.msj);
       } 
   }
}
