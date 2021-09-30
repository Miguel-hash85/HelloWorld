/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

/**
 *
 * @author Matteo Fernández
 */
public class TextViewImplementation implements View{

    /**
     *
     * @param greeting
     * this method shows greeting into cosole
     */
    /**
 * 
 * This is the class used to view the message in Text implementation
 */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
