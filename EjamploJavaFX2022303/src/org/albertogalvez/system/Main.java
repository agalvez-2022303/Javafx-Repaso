package org.albertogalvez.system;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
   private final String PAQUETE_VISTA = "";
    private Stage escenarioPrincipal;
    private Scene escena; 
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
       this.escenarioPrincipal = escenarioPrincipal;
       this.escenarioPrincipal.setTitle("CineFlix - Alberto Gálvez");
       Parent root = FXMLLoader.load(getClass() .getResource("/org/albertogalvez/view/MenuPrincipalView.FXML")); 
       Scene escena = new Scene(root);
       escenarioPrincipal.setScene(escena);
       escenarioPrincipal.show();
    }
}
