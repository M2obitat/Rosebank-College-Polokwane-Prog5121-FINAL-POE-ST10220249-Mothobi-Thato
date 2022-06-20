/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author st10220249
 */
public class RegistrationTest 
{
    
    public RegistrationTest() 
    {
        String UserName ;
        String PassWord;
        String FirstName;
        String LastName;
        System.out.println("please enter the following :Username + Password + Firstname + LastName");
        System.out.println("You have successfully registered"); 
    }

    @Test
    public void testMain() 
    {
        System.out.println("You have successfully registered");
    }
    
}
