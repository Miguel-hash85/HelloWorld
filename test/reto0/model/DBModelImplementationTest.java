/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * This class is a test 
 * @author Matteo Fernández
 */
public class DBModelImplementationTest {

    /**
     * This test proofs that we can connect to the database and see the greeting
     * @throws Exception
     */
    @Test
    public void testDBModel() throws Exception {
        DBModelImplementation dbmodel = new DBModelImplementation();
        String greeting = dbmodel.getGreeting();
        assertEquals(greeting, "Hello world!!!");
    }
}
