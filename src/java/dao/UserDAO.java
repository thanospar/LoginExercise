/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entities.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author thanosparaskevas
 */
public class UserDAO extends Database {
    
     String server = "localhost:3306";
    String database = "cars";
    String username = "root";
    String password = "";

    public UserDAO() {
    super();
    }
    
    
    
    public List<User> getUsers() {
        User st;
        String query = "SELECT * FROM cars.user";
        List<User> users= new ArrayList<>();
        
        setOptions("?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Athens&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false");
        ResultSet rs = Database(server, database, username, password, query);
        if(rs == null) { System.out.println("Error to the database");} 
        try {
            while(rs.next()) {
                st = new User( rs.getString("username"),rs.getString("password") ); 
                users.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
    }

  

    
public  boolean updateUser(User u,String ip){
        LocalDateTime now = LocalDateTime.now();
        String updateUser="UPDATE user SET lastLoginDateTime ='"+now+"', loginIp = '"+ip+"'where user.username = '"+u.getUsername()+"'";
        
        setOptions("?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Athens&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false");
        int i = Database(server, database, username, password, updateUser,(byte) 1);
        if(i>=1){
            
        return true;
        }else{
            return false;
        }
    }


  
    
    
}
