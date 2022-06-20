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
public class Task1Test 
{
    
    public Task1Test() 
    {
        System.out.print("\n\tTaskID\tTaskName\tTaskDuration\tTaskStatus\tDeveloper\n");
    }

    @Test
    public void testSomeMethod() 
    {
         System.out.print("\n\nTasks saved so far....\n");
        int NoOfTask = 0;
       
        for(int a = 0; a < NoOfTask; a++)
        {
                System.out.print("\n\nTask "  + (a+1) + "'s Details : \n");
             String TaskStatus = null;
                /*System.out.println("Developer : " + Developer);*/
                /*System.out.println("TaskName : " + TaskName);*/
                /*System.out.println("TaskDuration : " + TaskDuration);*/
                System.out.println("TaskStatus : " + TaskStatus);        
        
        }   
    }
    
}
