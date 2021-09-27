/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

/**
 * This interface declares the method showGreeting
 *
 * @author Matteo Fernández
 */
public interface View {

    /**
     * This method is going to be used by the controller
     *
     * @param greeting
     */
    public void showGreeting(String greeting);
}
