/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristopherhuaz.controller;
import javafx.stage.Stage;
/**
 *
 * @author almap
 */
public class SceneManagerController {
    //atributos
    private static SceneManagerController instanciaSceneManagerController;
    private Stage escenarioPrincipal;
    //constructores
    public SceneManagerController(){}
    //metodos
    public SceneManagerController(Stage escenarioRaiz){
       this.escenarioPrincipal = escenarioRaiz;
    }

    // get de la instanciaScene

    public static SceneManagerController getInstanciaSceneManagerController() {
        if(instanciaSceneManagerController == null)
            instanciaSceneManagerController = new SceneManagerController();
        return instanciaSceneManagerController;
    }
    //getters y settes

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    
    //VistaPrincipal
    public void vistaPrincipal(){
    
    }
}
