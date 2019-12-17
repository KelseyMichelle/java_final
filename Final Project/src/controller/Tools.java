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
public class Tools {
   public static boolean isInteger(String i)
    {
        try
        {
            Integer.parseInt(i);
            return true;
        } catch (Exception e)
        {
            return false;
        }
        
    }
}
