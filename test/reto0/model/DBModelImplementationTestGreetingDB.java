/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Sanchez
 */
public class DBModelImplementationTestGreetingDB {
    
    /**
     *
     */
    @Test
    public void testDBModelImplementationMessage() {
        
        
        
        try {
            Model model = new DBModelImplementation();
            assertEquals(model.getGreeting(), "Hello world!!!");
        } catch (Exception ex) {
            Logger.getLogger(DBModelImplementationTestGreetingDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
