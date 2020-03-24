/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lenovo
 */
public class BaseModel{
    public Connection con;
    private String dbURL = "urlrl??";
    private String username = "root";
    private String password = "";
    
    public BaseModel(){
        try {
            this.con = DriverManager.getConnection(this.dbURL, this.username, this.password);
        } catch (SQLException ex) {
            System.out.print("Failed to connect database!");
        }  
    }
    
    public void create(){
        
    }
    
    public void find(){
        
    }
    
    public void get(){
        
    }
}
