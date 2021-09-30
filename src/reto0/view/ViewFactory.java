/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

/**
 *
 * @author Matteo Fernández
 */
/**
 * 
 * This class return the diferent views
 */
public class ViewFactory {
    
    /**
     *
     * @param type
     * @return this method return a View, depends on the sent type.
     */
    public static View getView(String type){
        View view=null;
        if(type.equalsIgnoreCase("Text")){
            view=new TextViewImplementation();
        }
        if(type.equalsIgnoreCase("Swing")){
            view=new SwingImplementation();
        }
        if(type.equalsIgnoreCase("FX")){
            view=new JavaFXImplementation();
        }
        return view;
    }
    
}
