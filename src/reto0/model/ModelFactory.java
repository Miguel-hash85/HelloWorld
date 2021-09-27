/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

/**
 * The Model Factory is used to create a model
 *
 * @author Matteo Fernández
 */
public class ModelFactory {

    /**
     * Gets a type and depending the type, one implementation is oppened
     *
     * @param type is a String
     * @return the model
     */
    public static Model getModel(String type) {
        Model model = null;
        if (type.equalsIgnoreCase("File")) {
            model = new FileModelImplementation();
        }
        if (type.equalsIgnoreCase("DataBase")) {
            model = new DBModelImplementation();
        }
        return model;
    }

}
