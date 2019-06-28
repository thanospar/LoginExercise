/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Car;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**

/**
 *
 * @author thanosparaskevas
 */
public class CarDAO extends Database {
    
     String server = "localhost:3306";
    String database = "cars";
    String username = "root";
    String password = "";
    
    
     public List<Car> getCar() {
        Car st;
        String query = "SELECT * FROM `cars`.`car`";
        List<Car> cars = new ArrayList<>();
        
        setOptions("?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Athens&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false");
        ResultSet rs = Database(server, database, username, password, query);
        if(rs == null) { System.out.println("Error to the database");} 
        try {
            while(rs.next()) {
                st = new Car(rs.getInt("carid"), rs.getString("brand"), 
                                         rs.getString("model"), rs.getInt("horsepower")); 
                cars.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cars;
    }

    
}
