/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 2dam
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        String select="Select id from account where type=1";
        System.out.println(select);
    }
    
}
