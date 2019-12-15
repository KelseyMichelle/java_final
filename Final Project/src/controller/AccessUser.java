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
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author kelsey
 */
public class AccessUser {
    private String employeeFileTxt;
    private String userFileTxt;

    public AccessUser(String employeeFile, String userFile) {
        this.employeeFileTxt = employeeFile;
        this.userFileTxt = userFile;
    }
    
    ArrayList<User> getEmployees() throws IOException
    {
        File employeeFile;
        Path employeePath = Paths.get(employeeFileTxt);
        if (Files.exists(employeePath))
        {
            employeeFile = employeePath.toFile();
            try (BufferedReader in = new BufferedReader(
                                     new FileReader(employeeFile))) {
                String line = in.readLine();
                ArrayList<String> lineArray = new ArrayList<>();
                while(line != null) 
                {
                    
                    lineArray.toArray(line.split(";"));
                    System.out.println(lineArray.get(0));
                    
                } 
            } catch (IOException e)
            {
                System.out.println(e);     
            }
        }
        else
        {
            System.out.println("No such file exists! Creating file.");
            Files.createFile(employeePath);
        }
        ArrayList<User> users = new ArrayList<>();
        
        return users;
        
    }
    
}
