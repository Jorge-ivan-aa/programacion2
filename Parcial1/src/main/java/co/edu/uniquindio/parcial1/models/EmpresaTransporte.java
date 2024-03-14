package co.edu.uniquindio.parcial1.models;

import co.edu.uniquindio.parcial1.models.build.PropietarioBuilder;
import java.util.ArrayList;

public class EmpresaTransporte {
    private static EmpresaTransporte instance;
    private ArrayList<VehiculoPasajero> listaVehiculosPasajeros;
    private ArrayList<VehiculoCarga> listaVehiculosCarga;
    private ArrayList<Usuario> listaPasajeros;
    private ArrayList<Propietario> listaPropietarios;

    private EmpresaTransporte(){
      listaVehiculosPasajeros = new ArrayList<>();
      listaVehiculosCarga = new ArrayList<>();
      listaPasajeros = new ArrayList<>();
      listaPropietarios = new ArrayList<>();
    }

    public static EmpresaTransporte getInstance(){

        if(instance == null) {
          return instance = new EmpresaTransporte();
        } else {
          return instance;
        }
    }

    public ArrayList<Usuario> getListaPasajeros() {
        return listaPasajeros;
    }

    public void addListaPasajeros(Usuario pasajero) {
        this.listaPasajeros.add(pasajero);
    }

    public void addListaVehiculosPasajeros(VehiculoPasajero transporte) {
        this.listaVehiculosPasajeros.add(transporte);
    }

    public void addListaVehiculosCarga(VehiculoCarga carga) {
        this.listaVehiculosCarga.add(carga);
    }

    public void addListaPropietarios(Propietario propietario) {
        this.listaPropietarios.add(propietario);
    }

    public void inicializarDatos() {
        Propietario propietario1 = new PropietarioBuilder()
                                    .nombre("carlos")
                                    .identificacion("12323537")
                                    .email("carlos@gmail.com")
                                    .numeroCelular("31234545")
                                    .build();

        Propietario propietario2 = new PropietarioBuilder()
                                    .nombre("carlos")
                                    .identificacion("12323537")
                                    .email("carlos@gmail.com")
                                    .numeroCelular("31234545")
                                    .build();
      
     // Crear vehículos de pasajeros
        VehiculoPasajero taxi = new VehiculoPasajero("ABC123", "Sedan", "Toyota", "Azul", propietario1, 5);
        VehiculoPasajero bus = new VehiculoPasajero("XYZ789", "Camión", "Ford", "Blanco", propietario2, 3);

        // Crear usuarios
        Usuario usuario1 = new Usuario(30, taxi);
        Usuario usuario2 = new Usuario(30, bus);
        Usuario usuario3 = new Usuario(30, bus);
        Usuario usuario4 = new Usuario(30, bus);
        Usuario usuario5 = new Usuario(30, bus);
        Usuario usuario6 = new Usuario(30, bus);
        Usuario usuario7 = new Usuario(30, taxi);
        Usuario usuario8 = new Usuario(30, taxi);

        // Crear vehículos de carga
        VehiculoCarga camionCarga = new VehiculoCarga("DEF456", "Camión", "Ford", "Rojo", propietario1, 4, 2000);

    }
}
