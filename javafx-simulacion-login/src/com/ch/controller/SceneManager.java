/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ch.controller;

import com.ch.view.BienvenidaView;
import com.ch.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

public class SceneManager {
    private static SceneManager instanciaSceneManager;
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;

    
    private SceneManager(){
    
    }
    
    //Metodos
    public void cambiarEscena(Pane panel, int ancho, int alto){
        try{
            escenaPrincipal = new Scene(panel, ancho, alto);
            escenarioPrincipal.setScene(escenaPrincipal);
            escenarioPrincipal.sizeToScene();
            escenarioPrincipal.show();
        }catch(NullPointerException objetoNulo){
            JOptionPane.showMessageDialog(null, "Error de Objeto Nulo: Cambiar Escena Principal");
            objetoNulo.printStackTrace();
        }catch(Exception errorPadre){
            JOptionPane.showConfirmDialog(null, "Error Padre: Cambiar Escena Principal");
            errorPadre.printStackTrace();
        }
    }
    
    public void ventanaLogin(){
    try{
         //metodo que oculta las opciones de ventana por defecto
         this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
         LoginView vistaLogin = LoginView.getInstanciaLoginView();
         cambiarEscena(vistaLogin, 400, 450); //ancho alto;
         this.escenaPrincipal.setFill(Color.TRANSPARENT);
         new LoginController(vistaLogin);
        }catch(NullPointerException objetoNulo){
            JOptionPane.showMessageDialog(null, "Error de Objeto Nulo: Ventana Login");
            objetoNulo.printStackTrace();
        }catch(Exception errorPadre){
            JOptionPane.showConfirmDialog(null, "Error Padre: Ventana Login");
            errorPadre.printStackTrace();
        }
    }
      public void ventanaBienvenida(){
    try{
        escenarioSecundario = new Stage();
        this.escenarioSecundario.initStyle(StageStyle.TRANSPARENT);
        this.escenarioSecundario.initModality(Modality.APPLICATION_MODAL);
        
        BienvenidaView bienvenida = new BienvenidaView();
        escenaPrincipal = new Scene(bienvenida, 200, 300);
        
        this.escenarioSecundario.setScene(escenaPrincipal);
        this.escenarioSecundario.sizeToScene();
        this.escenarioSecundario.showAndWait();
        
        }catch(NullPointerException objetoNulo){
            JOptionPane.showMessageDialog(null, "Error de Objeto Nulo: Ventana Bienvenida");
            objetoNulo.printStackTrace();
        }catch(Exception errorPadre){
            JOptionPane.showConfirmDialog(null, "Error Padre: Ventana Bienvenida");
            errorPadre.printStackTrace();
        }
    }
    //getters y setters
    
    public static SceneManager getInstanciaSceneManager() {
        if(instanciaSceneManager == null)
            instanciaSceneManager = new SceneManager();
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }

    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }
    
    
}
