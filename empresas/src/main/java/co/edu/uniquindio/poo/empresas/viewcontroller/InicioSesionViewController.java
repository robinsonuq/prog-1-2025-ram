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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
            System.out.println("Los datos no son validos");
        }

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
