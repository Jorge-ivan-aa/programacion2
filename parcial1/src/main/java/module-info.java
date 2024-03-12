module co.edu.uniquindio.programacion2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    
    opens co.edu.uniquindio.programacion2 to javafx.fxml;
    exports co.edu.uniquindio.programacion2;

    opens co.edu.uniquindio.programacion2.controllers;
    exports co.edu.uniquindio.programacion2.controllers;
}
