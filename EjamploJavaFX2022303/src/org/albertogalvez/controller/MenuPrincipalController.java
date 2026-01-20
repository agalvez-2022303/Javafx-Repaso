package org.albertogalvez.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;
import javafx.fxml.Initializable;


public class MenuPrincipalController implements Initializable {
    private Principal escenarioPrincipal; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
     
    
}
