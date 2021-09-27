/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

/**
 * This is the graphic mode implementation of the view tier
 *
 * @author Matteo Fernández
 */
public class TextViewImplementation implements View {

    /**
     * This method gets the greeting in a string way and prints it
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
