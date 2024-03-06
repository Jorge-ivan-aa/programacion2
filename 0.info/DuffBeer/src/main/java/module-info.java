module co.edu.uniquindio.programacion2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    exports co.edu.uniquindio.programacion2.controladores;
    exports co.edu.uniquindio.programacion2;
    opens co.edu.uniquindio.programacion2.controladores to javafx.fxml;

}
