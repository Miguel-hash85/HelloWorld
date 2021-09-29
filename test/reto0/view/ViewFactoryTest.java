/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

import java.util.ResourceBundle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Sanchez
 */
public class ViewFactoryTest {
    
    /**
     *
     */
    @Test
    public void testText() {
        
        ResourceBundle archivoConfiguracion=ResourceBundle.getBundle("configuration.data");
        View view=ViewFactory.getView(archivoConfiguracion.getString("viewImplementation"));
        assertNotNull(view);
        assertTrue(view instanceof TextViewImplementation);
        
    }
    
    /**
     *
     */
    @Test
    public void testSwing() {
        
        ResourceBundle archivoConfiguracion=ResourceBundle.getBundle("configuration.data");
        View view=ViewFactory.getView(archivoConfiguracion.getString("viewImplementation"));
        assertNotNull(view);
        assertTrue(view instanceof SwingImplementation);
        
    }
    
    /**
     *
     */
    @Test
    public void testFX() {
        
        ResourceBundle archivoConfiguracion=ResourceBundle.getBundle("configuration.data");
        View view=ViewFactory.getView(archivoConfiguracion.getString("viewImplementation"));
        assertNotNull(view);
        assertTrue(view instanceof JavaFXImplementation);
        
    }
    
}
