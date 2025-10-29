module co.edu.uniquindio.poo.empresas {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.empresas to javafx.fxml;

    exports co.edu.uniquindio.poo.empresas.app;
    exports co.edu.uniquindio.poo.empresas.model;
    exports co.edu.uniquindio.poo.empresas.viewcontroller;

    opens co.edu.uniquindio.poo.empresas.viewcontroller to javafx.fxml;
}