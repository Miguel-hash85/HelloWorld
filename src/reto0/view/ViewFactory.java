/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

/**
 * Create diferent views
 *
 * @author Matteo Fernández
 */
public class ViewFactory {

    /**
     * Gets differents types to create a new view
     *
     * @param type
     * @return the new expecified view
     */
    public static View getView(String type) {
        View view = null;
        if (type.equalsIgnoreCase("Text")) {
            view = new TextViewImplementation();
        }
        if (type.equalsIgnoreCase("Swing")) {
            view = new SwingImplementation();
        }
        if (type.equalsIgnoreCase("FX")) {
            view = new JavaFXImplementation();
        }
        return view;
    }

}
