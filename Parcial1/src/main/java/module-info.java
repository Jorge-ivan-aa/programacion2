module co.edu.uniquindio.Parcial1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.Parcial1 to javafx.fxml;
    exports co.edu.uniquindio.Parcial1;
}