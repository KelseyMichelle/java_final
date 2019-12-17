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


/**
 *
 * @author kelsey
 */
public class LoadFile {
    static ArrayList<String> getList(String filePath) throws IOException
    {
        File file;
        Path path = Paths.get(filePath);

        if (Files.exists(path))
        {
            file = path.toFile();
            try (BufferedReader in = new BufferedReader(
                                     new FileReader(file))) {

                String line = in.readLine();
                
                ArrayList<String> lines = new ArrayList<>();
                while(line != null) 
                {
                    lines.add(line);  
                    line = in.readLine();
                } 
                return lines;
            } catch (IOException e)
            {
                System.out.println(e);     
            }
        }
        else
        {
            
            System.out.println("No such file exists! Creating file.");
            Files.createFile(path);
        }
        return null;
    }
}
