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
 * @author 2dam
 */
public class FileModelImplementationTest {
    
    

    @Test
    public void testGetGreeting() {
        
        Model modelo=new FileModelImplementation();
        try {
            String saludo = modelo.getGreeting();
            assertEquals("Hello world!!!",saludo);
        } catch (Exception ex) {
            Logger.getLogger(FileModelImplementationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /*@Test public void testSameOrEquals(){
        long long1=new Long(99l);
        long long2=new Long(99l);
        //long1=long2;
        assertEquals("The two bojects are not equal.",long1,long2);
        assertSame("The two object are not the same",long1,long2);
        
    }*/
    
}
