/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author kelsey
 */
public class SaveFile {
    static public void saveUsers(ArrayList<User> u, String fileName) throws IOException
    {
        PrintWriter out = new PrintWriter(
                          new BufferedWriter(
                          new FileWriter("src/data/" + fileName)));
        String output = "";
        for (User user : u)
        {
            output += user.getFirstName() + ";";
            output += user.getLastName() + ";";
            output += user.getUID() + ";";
            output += user.getAccessLevel() + ";";
            output += user.getLastFour() + "\n";
        };
        out.print(output);
        out.close();
    }
    static public void newUser(String username, String password, int userID, String fileName) throws IOException
    {
        PrintWriter out = new PrintWriter(
                          new BufferedWriter(
                          new FileWriter("src/data/" + fileName, true)));
        
        out.println(username + ";" + password + ";" + String.valueOf(userID));
        out.close();
    }
}
