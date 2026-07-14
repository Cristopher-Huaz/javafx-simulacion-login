/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ch.controller;

import javafx.scene.image.Image;

/**
 *metodo que usa el patron factory, para crear diferentes imagenes y retornarlas
 * @author informatica
 */
public class ImageController {
    private final String RUTA_IMAGENES="/com/ch/resources/";
    /**
 *metodo que usa el patron factory, para crear diferentes imagenes y retornarlas
 * @param nombreImagen El nombre de la imagen a crear
 * @return la imagen a mostrar
 */
    public Image getImageLogin(String nombreImagen){
        Image imagenMostrar;
        switch(nombreImagen){
            case "logo":
                imagenMostrar = new Image(RUTA_IMAGENES + "Pibble.jpg");
                break;
            default:
                imagenMostrar = new Image(RUTA_IMAGENES + "Pibble.jpg");
        }   
        return imagenMostrar;
    } 
}
