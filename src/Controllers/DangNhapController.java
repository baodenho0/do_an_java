/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.User;
/**
 *
 * @author lenovo
 */
public class DangNhapController {
    private User user;
    
    public DangNhapController(){
        this.user = new User();
    }
    
    public int Login(String username, char[] password){       
        if(this.user.username.equals(username)){           
            return 1;
        } 
        
        if("user".equals(username)){
            return 2;
        }
        return 0;
    }
}
