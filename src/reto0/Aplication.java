/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0;

import java.util.ResourceBundle;
import reto0.controller.Controller;
import reto0.model.Model;
import reto0.model.ModelFactory;
import reto0.view.View;
import reto0.view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Aplication {

    /**
     * @param args
     * This aplication show the message Hello world in diferent ways deppending on the configuration settings selected
     */
    public static void main(String[] args) {
        ResourceBundle archivoConfiguracion=ResourceBundle.getBundle("configuration.data");
        Model model=ModelFactory.getModel(archivoConfiguracion.getString("modelImplementation"));
        View view=ViewFactory.getView(archivoConfiguracion.getString("viewImplementation"));
        Controller controller = new Controller();
        controller.run(model, view);
        
    }

}
