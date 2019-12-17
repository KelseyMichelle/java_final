/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kelsey
 */
public class AccessUser {
   
    public static ArrayList<User> getEmployees(String employeeFile) throws IOException
    {
        ArrayList<String> employees = LoadFile.getList(employeeFile);
        ArrayList<User> users = new ArrayList<>();
        for (String e : employees)
        {
            String[] employ = e.split(";");
            users.add(new User(employ[0], employ[1], Integer.parseInt(employ[2]), Integer.parseInt(employ[3]), Integer.parseInt(employ[4])));
        }
        return users;
    }
    
}
