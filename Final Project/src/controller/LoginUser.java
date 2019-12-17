/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author kelsey
 */
public class LoginUser {
    private String username;
    private String password;
    private int UID;

    public LoginUser(String username, String password, int UID) {
        this.username = username;
        this.password = password;
        this.UID = UID;
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the UID
     */
    public int getUID() {
        return UID;
    }

    /**
     * @param UID the UID to set
     */
    public void setUID(int UID) {
        this.UID = UID;
    }
    
    
}
