/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;


import java.util.ResourceBundle;

/**
 *
 * @author Matteo Fernández
 */
public class FileModelImplementation implements Model{
    
    ResourceBundle archivoConfiguracion=ResourceBundle.getBundle("configuration.data");

    /**
     *
     * @return This method return the string "Get greeting" from the configuration file
     * @throws Exception
     */
    @Override
    public String getGreeting() throws Exception {
        String saludo=archivoConfiguracion.getString("greeting");
        return saludo;   
    }
    
}
