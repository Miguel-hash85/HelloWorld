/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

/**
 *
 * @author Matteo Fernández
 */
/**
 * 
 * This class returns the diferent models
 */
public class ModelFactory {
    
    /**
     *
     * @param type
     * @return This method returns the type of model depending on the string received
     */
    public static Model getModel(String type){
        Model model = null;
        if(type.equalsIgnoreCase("File")){
            model=new FileModelImplementation();
        }
        if(type.equalsIgnoreCase("DataBase")){
            model=new DBModelImplementation();
        }
        return model;
    }
    
}
