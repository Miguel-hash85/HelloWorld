/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

import java.util.ResourceBundle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Sanchez
 */
public class ModelFactoryTest {
    
    /**
     *
     */
    @Test
    public void testModelImplementationTypeFile() {
        
        Model model;
        ResourceBundle archivoConfiguracion=ResourceBundle.getBundle("configuration.data");
        model=ModelFactory.getModel(archivoConfiguracion.getString("modelImplementation"));
        assertNotNull(model);
        assertTrue(model instanceof FileModelImplementation);
        
    }
    
    /**
     *
     */
    @Test
    public void testModelImplementationTypeDB() {
        
        Model model;
        ResourceBundle archivoConfiguracion=ResourceBundle.getBundle("configuration.data");
        model=ModelFactory.getModel(archivoConfiguracion.getString("modelImplementation"));
        assertNotNull(model);
        assertTrue(model instanceof DBModelImplementation);
        
    }
    
}
