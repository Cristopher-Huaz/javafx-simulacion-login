/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ch.controller;

import com.ch.view.LoginView;

/**
 *
 * @author informatica
 */
public class LoginController {

    private final LoginView LOGIN_VIEW;

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
    }
}
