/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Matteo Fernández
 */
public class DBModelImplementation implements Model{
    
    private final ResourceBundle configFile=ResourceBundle.getBundle("configuration.conexion");
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs=null;
    private final String selectGreeting="Select * from helloWorld";
    private String saludo=null;
    
    private void openConnection() throws SQLException{
        con = DriverManager.getConnection(configFile.getString("URL"), 
                                            configFile.getString("USER"),
                                            configFile.getString("PASSWORD"));
		 
	}
    
    private void closeConnection() throws SQLException{
	if (stmt != null)
		stmt.close();
	if (con != null)
		con.close();
	}
    
    /**
     *
     * @return This method return the string "Get greeting" from the Data Base
     * @throws Exception
     */
    @Override
    public String getGreeting() throws Exception {
        
        this.openConnection();
        stmt = con.prepareStatement(selectGreeting);
        rs = stmt.executeQuery();
        if (rs.next())
            saludo=rs.getString("saludo");
        this.closeConnection();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return saludo;
        
    }
    
}
