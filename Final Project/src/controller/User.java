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
public class User {
    private String firstName;
    private String lastName;
    private int UID;
    private int accessLevel;
    private int lastFour;

    public User(String firstName, String lastName, int UID, int accessLevel, int lastFour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.UID = UID;
        this.accessLevel = accessLevel;
        this.lastFour = lastFour;
    }
    @Override
    public String toString()
    {
        String result = "";
        result += (int)UID + ": " + firstName + " " + lastName;
        return result;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    /**
     * @return the accessLevel
     */
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * @return the lastFour
     */
    public int getLastFour() {
        return lastFour;
    }

    /**
     * @param lastFour the lastFour to set
     */
    public void setLastFour(int lastFour) {
        this.lastFour = lastFour;
    }
    
    
}
