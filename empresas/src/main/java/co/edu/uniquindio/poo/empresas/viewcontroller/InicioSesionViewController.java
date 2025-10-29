package co.edu.uniquindio.poo.empresas.viewcontroller;

/**
 * Sample Skeleton for 'inicio-sesion.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.empresas.app.Aplicacion;
import co.edu.uniquindio.poo.empresas.model.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InicioSesionViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnIniciarSesion"
    private Button btnIniciarSesion; // Value injected by FXMLLoader

    @FXML // fx:id="txtUsuario"
    private TextField txtUsuario; // Value injected by FXMLLoader

    @FXML // fx:id="txtContrasenia"
    private TextField txtContrasenia; // Value injected by FXMLLoader

    Empresa empresa;
    Aplicacion aplicacion;

    @FXML
    void iniciarSesionAction(ActionEvent event) {
            iniciarSesion();
    }

    private void iniciarSesion() {
        String usuario= txtUsuario.getText();
        String contrasenia=txtContrasenia.getText();

        boolean validado = validarDatos(usuario,contrasenia);

        if (validado) {
             empresa.validarUsuario(usuario,contrasenia);
        }else{
            mostrarAlerta("Inicio de sesion","Inicio de Sesion","Datos Invalidos", Alert.AlertType.WARNING);
        }

    }

    public void mostrarMensaje(){
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Mi diálogo");
        dialog.setHeaderText("Mensaje personalizado");
        dialog.setContentText("Contenido dentro del diálogo");

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.showAndWait();
    }
    public void mostrarAlerta(String titulo, String header, String contenido, Alert.AlertType alertType) {

        Alert alert = new Alert(alertType);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }


    private boolean validarDatos(String usuario, String contrasenia) {

        if(usuario.isBlank() || contrasenia.isBlank()){
            return false;
        }
        return true;
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnIniciarSesion != null : "fx:id=\"btnIniciarSesion\" was not injected: check your FXML file 'inicio-sesion.fxml'.";
        assert txtUsuario != null : "fx:id=\"txtUsuario\" was not injected: check your FXML file 'inicio-sesion.fxml'.";
        assert txtContrasenia != null : "fx:id=\"txtContrasenia\" was not injected: check your FXML file 'inicio-sesion.fxml'.";

    }
    public InicioSesionViewController() {


    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
        empresa = aplicacion.empresa;
    }
}
