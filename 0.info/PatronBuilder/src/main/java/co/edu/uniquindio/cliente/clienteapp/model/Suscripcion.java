package co.edu.uniquindio.cliente.clienteapp.model;

public class Suscripcion {
  
  private Cliente basic;
  private Cliente premium;
  private Cliente vip;

    public Suscripcion() {
    }

    public Cliente clienteBasic(String nombre, String apellido, int edad, String cedula) {
        this.basic = new ClienteBuilder()
                .nombre(nombre)
                .apellido(apellido)
                .edad(edad)
                .cedula(cedula)
                .build();

        return this.basic;
    }

    public Cliente clientePremium (String nombre, String apellido,int edad, String cedula, String telefonoFijo){
        this.premium = new ClienteBuilder()
                    .nombre(nombre)
                    .apellido(apellido)
                    .edad(edad)
                    .cedula(cedula)
                    .telefonoFijo(telefonoFijo)
                    .build();
        return this.premium;
        }

    public Cliente clienteVip (String nombre, String apellido,int edad, String cedula, String telefonoFijo, String telefonoCelular){
        this.vip = new ClienteBuilder()
                    .nombre(nombre)
                    .apellido(apellido)
                    .edad(edad)
                    .cedula(cedula)
                    .telefonoFijo(telefonoFijo)
                    .telefonoCelular(telefonoCelular)
                    .build();
        return this.vip;
        }
}
