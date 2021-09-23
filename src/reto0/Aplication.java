/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        String select="Select id from account where type=1";
        System.out.println(select);
        //new
        Properties propiedades = new Properties();
        try {
            InputStream typeFile= new FileInputStream("data.properties");
            propiedades.load(typeFile);
            Model model=ModelFactory.getModel(propiedades.getProperty("modelImplementation"));
            View view=ViewFactory.getView(propiedades.getProperty("viewImplementation"));
            Controller controller = new Controller();
            controller.run(model, view);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        
    }

}
