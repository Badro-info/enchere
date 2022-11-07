/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.web.enchere.guiFX.vues;

import fr.insa.badreddine.enchere.guifx.VuePrincipale;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author badro
 */
public class entetelogin extends HBox {

    private VuePrincipale main;
    private TextField tfNom;
    private PasswordField pfPass;

    public entetelogin(VuePrincipale main) {
        this.main = main;
        this.getChildren().add(new Label("nom :"));
        this.tfNom = new TextField();
        this.getChildren().add(this.tfNom);
        this.getChildren().add(new Label("pass :"));
        this.pfPass = new PasswordField();
        this.getChildren().add(this.pfPass);
        Button bLogin = new Button("Login");
        bLogin.setOnAction((t) -> {
            String nom = this.tfNom.getText();
            String pass = this.pfPass.getText();
            System.out.println("je tente le login de " + nom + "(" + pass + ")");
            if (nom.equals("toto")) {
                this.main.setTop(new EnteteApresLogin(this.main));

            } else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("bad user");
                a.showAndWait();
            }
        });
        this.getChildren().add(bLogin);

    }

}
