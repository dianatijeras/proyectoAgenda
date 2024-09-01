module co.edu.uniquindio.poo.agenda {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.agenda to javafx.fxml;
    exports co.edu.uniquindio.poo.agenda;
}