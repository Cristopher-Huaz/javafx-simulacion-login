/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ch.controller;

import com.ch.model.Usuario;
import com.ch.view.LoginView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class LoginController {

    private final LoginView LOGIN_VIEW;
    private double ejeX = 0;
    private double ejeY = 0;
    private Stage escenario = SceneManager.getInstanciaSceneManager().getEscenarioPrincipal();
    
    public LoginController(LoginView LOGIN_VIEW) {
        this.LOGIN_VIEW = LOGIN_VIEW;
        construirAcciones();
    }

    public void construirAcciones() {
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (e) -> {
                    System.exit(0);
                }
        );
        this.LOGIN_VIEW.setOnMouseClicked(
                (e) -> {
                    ejeX = e.getSceneX();
                    ejeY = e.getSceneY();
                    
                    System.out.println("X: " + ejeX);
                    System.out.println("Y: " + ejeY);
                }
        );
        this.LOGIN_VIEW.setOnMouseDragged(
                (e) -> {
                    double ejeXVentanaDezplazamiento = e.getScreenX();
                    double ejeYVentanaDezplazamiento = e.getScreenY();
                    
                    System.out.println("Desplazamiento X: "+ (ejeXVentanaDezplazamiento - ejeX));
                    System.out.println("Desplazamiento Y: "+ (ejeYVentanaDezplazamiento - ejeY));
                    escenario.setX(ejeXVentanaDezplazamiento - ejeX);
                    escenario.setY(ejeYVentanaDezplazamiento - ejeY);
                }
        );
        this.LOGIN_VIEW.getBtnIniciarSesion().setOnMouseClicked(
        (e)->{
            iniciarSesion();
        }
        );
        
    }
    private AuthSystem authSystem = new AuthSystem();
    public void iniciarSesion(){
        String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String passUsuario = this.LOGIN_VIEW.getPwClave().getText().trim();
        
        if(nombreUsuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "No deje el campo nombre Usuario Vacio");
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");}
        else if(passUsuario.isEmpty()){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().remove("empty");
            this.LOGIN_VIEW.getPwClave().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "No deje el campo contraseña vacio");}
        else{
            this.LOGIN_VIEW.getPwClave().getStyleClass().remove("empty");
            Usuario usuario = authSystem.login(nombreUsuario, passUsuario);
            if( usuario == null)
                JOptionPane.showMessageDialog(null, "VALIDE SUS CREDENCIALES");
            else 
                JOptionPane.showMessageDialog(null, "Hola");
        }
    }
}
