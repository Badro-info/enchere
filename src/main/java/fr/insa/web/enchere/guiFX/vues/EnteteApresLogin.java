/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.guiFX.vues;

import fr.insa.badreddine.enchere.guifx.VuePrincipale;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author badro
 */
public class EnteteApresLogin extends HBox{
    
    private VuePrincipale main;
    
    public EnteteApresLogin(VuePrincipale main){
        this.main=main;
        Button bLogout = new Button("Logout");
        this.getChildren().add(bLogout);
        bLogout.setOnAction((t) -> {
            this.main.setTop(new entetelogin(this.main));
        });
        
    }
            
    
    
}
