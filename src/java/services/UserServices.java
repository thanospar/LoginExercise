/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import dao.UserDAO;
import java.util.List;
/**
 *
 * @author thanosparaskevas
 */
public class UserServices {

    public UserServices() {
    }
    
    public Boolean checkUser(User us,String ip) {
        UserDAO uDao = new UserDAO();
        List<User> Users = uDao.getUsers();

        for (User u : Users) {

            if (u.getUsername().equals(us.getUsername()) && u.getPassword().equals(us.getPassword())) {
                    
                  
                    if(uDao.updateUser(us,ip)){ 
                         return true;
                    }

                }

            }
    
        

       return false;

    }

}
