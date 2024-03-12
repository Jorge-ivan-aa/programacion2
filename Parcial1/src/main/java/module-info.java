module co.edu.uniquindio.programacion2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.programacion2 to javafx.fxml;
    exports co.edu.uniquindio.programacion2;
}