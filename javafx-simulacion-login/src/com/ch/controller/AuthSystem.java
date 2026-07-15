/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ch.controller;

import com.ch.model.Rol;
import com.ch.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSystem {

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public AuthSystem() {
        cargarUsuarios();
    }

    private void cargarUsuarios() {

        usuarios.add(new Usuario("Ganolz",
                "2023230",
                "Saul Martinez",
                Rol.USER));

        usuarios.add(new Usuario("Fel",
                "2023206",
                "Eduardo Marroquin",
                Rol.ADMIN));

        usuarios.add(new Usuario("PepitoGaymer",
                "2025499",
                "Luis Castro",
                Rol.USER));

        usuarios.add(new Usuario("Juanpro300",
                "2023184",
                "Javier Hernandez",
                Rol.USER));
    }

    public Usuario login(String user, String pass) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(user) && usuario.getPassword().equals(pass)) {
                return null;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
