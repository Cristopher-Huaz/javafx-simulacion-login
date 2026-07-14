/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristopherhuaz.model;

/**
 *
 * @author almap
 */
public class Usuario {
//Atributos 
    private String userName;
    private String password;
    private String nombreCompleto;
    private String rol; 
    //Constructores
    public Usuario() { }

    public Usuario(String userName, String password, String nombreCompleto, String rol) {
        this.userName = userName;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.rol = rol;
    }
    
    
    //metodos
    //Getters y setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
