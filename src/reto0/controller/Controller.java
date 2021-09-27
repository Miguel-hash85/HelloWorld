/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import reto0.model.Model;
import reto0.view.View;

/**
 * This class is the controller 
 * @author Matteo Fernández
 */
public class Controller {

    /**
     *
     * @param model this is the model that the app uses
     * @param view this is the view that the app uses
     */
    public void run(Model model, View view) {
        
        try {
            view.showGreeting(model.getGreeting());
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

}
