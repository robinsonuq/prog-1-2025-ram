package co.edu.uniquindio.poo.empresa.app;

import co.edu.uniquindio.poo.empresa.model.Empresa;
import co.edu.uniquindio.poo.empresa.viewcontroller.InicioSesionViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Aplicacion extends Application {
    public Empresa empresa = new Empresa();
    private Stage primaryStage;


        @Override
        public void start(Stage primaryStage) throws IOException {
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Gestion de Empleados");
            openViewinicioSesion();
        }

        private void openViewinicioSesion() {

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Aplicacion.class.getResource("primary.fxml"));
                javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();

                InicioSesionViewController inicioSesionViewController = loader.getController();
                inicioSesionViewController.setAplicacion(this);

                Scene scene = new Scene(rootLayout);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            launch();
        }



    }







