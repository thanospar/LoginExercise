/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Objects;

/**
 *
 * @author thanosparaskevas
 */
public class User {
    
    private int id;
    private String username;
    private String password;
    private String lastLoginDateTime;
    private String  loginIp; 

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password, String lastLoginDateTime, String loginIp) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.lastLoginDateTime = lastLoginDateTime;
        this.loginIp = loginIp;
    }

    public User(String username, String password, String lastLoginDateTime, String loginIp) {
        this.username = username;
        this.password = password;
        this.lastLoginDateTime = lastLoginDateTime;
        this.loginIp = loginIp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(String lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", username=" + username + ", password=" + password + ", lastLoginDateTime=" + lastLoginDateTime + ", loginIp=" + loginIp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        hash = 31 * hash + Objects.hashCode(this.username);
        hash = 31 * hash + Objects.hashCode(this.password);
        hash = 31 * hash + Objects.hashCode(this.lastLoginDateTime);
        hash = 31 * hash + Objects.hashCode(this.loginIp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.lastLoginDateTime, other.lastLoginDateTime)) {
            return false;
        }
        if (!Objects.equals(this.loginIp, other.loginIp)) {
            return false;
        }
        return true;
    }
    
    
    
}
