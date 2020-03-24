/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author lenovo
 */
public class User extends BaseModel{
    public String username = "admin";
    public char[] password;
    
    public void getTest(){
        System.out.print("user: "+this.username);
    }
}
