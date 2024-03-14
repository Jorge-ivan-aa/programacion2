module co.edu.uniquindio.parcial1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens co.edu.uniquindio.parcial1 to javafx.fxml;
    exports co.edu.uniquindio.parcial1;
}
