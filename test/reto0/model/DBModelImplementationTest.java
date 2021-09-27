/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Matteo Fernández
 */
public class DBModelImplementationTest {

    @Test
    public void testDBModel() throws Exception {
        DBModelImplementation dbmodel = new DBModelImplementation();
        String greeting = dbmodel.getGreeting();
        assertEquals(greeting, "Hello world!!!");
    }

}
