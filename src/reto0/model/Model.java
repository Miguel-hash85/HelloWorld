/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

/**
 *
 * @author Matteo Fernández
 */
public interface Model {
    
    /**
     *
     * @return This method receives greeting from database or configuration file
     * @throws Exception
     */
    public String getGreeting () throws Exception;
    
}
