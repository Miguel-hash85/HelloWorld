/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

/**
 * This interface declares the method getGreeting
 *
 * @author Matteo Fernández
 */
public interface Model {

    /**
     * This method is going to be used by the controller
     *
     * @return String the greeting
     * @throws Exception
     */
    public String getGreeting() throws Exception;
}
