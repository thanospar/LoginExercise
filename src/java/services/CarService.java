/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.CarDAO;
import entities.Car;
import java.util.List;

/**
 *
 * @author thanosparaskevas
 */
public class CarService {

    public CarService() {
    }
    
    
     public String getCars() {
       CarDAO stuDao = new CarDAO();
       List<Car> cars = stuDao.getCar();
       StringBuilder str = new StringBuilder(); 
       str.append("<!DOCTYPE html>")
                .append("<html>")
                .append("<head>")
                .append("<title>My First Servlet</title>")
               .append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" "
                       + "integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" "
                       + "crossorigin=\"anonymous\">")
                .append("</head>")
                .append("<body>");
        for (Car s : cars) {
            
            str.append("<p>").append(s).append("</p>");
        }
        str.append("</body>")
                .append("</html>");
        return str.toString();
    }
    
}
