/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kelsey
 */
public class LoginEvaluation {
    
    
    public static LoginUser tryLogin(String filePath, String username, String password) throws IOException
    {
         ArrayList<String> logInfo = new ArrayList<>();
        logInfo = LoadFile.getList("src/data/logInfo.txt");
        for (String user : logInfo)
        {
            String[] userTest = user.split(";");
            
            if (userTest[0].equalsIgnoreCase(username))
            {
                if (userTest[1].equals(password))
                {
                    return new LoginUser(userTest[0], userTest[1], Integer.parseInt(userTest[2]));
                }
            }
        }
        return null;
    }
}
