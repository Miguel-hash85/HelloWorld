/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

import java.util.ResourceBundle;

/**
 * This method is used for getting a string that contains the greeting from a
 * File
 *
 * @author Matteo Fernández
 */
public class FileModelImplementation implements Model {

    ResourceBundle archivoConfiguracion = ResourceBundle.getBundle("configuration.data");

    @Override
    public String getGreeting() throws Exception {
        String saludo = archivoConfiguracion.getString("greeting");
        return saludo;
    }

}
