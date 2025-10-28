module co.edu.uniquindio.poo.universidad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens co.edu.uniquindio.poo.universidad to javafx.fxml;
    opens co.edu.uniquindio.poo.universidad.viewcontrollers to javafx.fxml;
    exports co.edu.uniquindio.poo.universidad;
}