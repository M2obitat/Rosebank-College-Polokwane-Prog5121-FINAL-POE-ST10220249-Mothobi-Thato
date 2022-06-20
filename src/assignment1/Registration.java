
    

package assignment1;

import java.util.Scanner;

public class Registration 
{

  
    public static void main(String[] args) 
    {
        String UserName ;
        String PassWord;
        String FirstName;
        String LastName;
        boolean LoginStatus = false;
        
        
        Login ll = new Login();
        System.out.print(ll.RegisterUser());
        
        LoginStatus = ll.LoginUser();
        ll.ReturnLoginStatus(LoginStatus);
        
    {
        Scanner scan = new Scanner(System.in);
        int numberOfTasks;
        
        System.out.print("Welcome to EasyKanban");
        System.out.print("\n\nHow many tasks do you wish to enter : ");
        numberOfTasks = scan.nextInt();
        if(numberOfTasks > 0)
        {
            Task task1 = new Task(numberOfTasks);
        
            System.out.print("\n\nThank you, You may now start capturing the tasks,\n should you wish to Quit just press 3..");
            for(int a = 0; a < numberOfTasks; a++)
            {
                System.out.print("\n\n1). Add tasks");
                System.out.print("\n2). Show report");
                System.out.print("\n3). Quit\n\nPick and option : ");
            
                int option = scan.nextInt();
                if(option == 1)
                {                  
                    task1.taskNum = a;
                    System.out.print("Enter this task's name : ");
                    task1.tName[a] = scan.next();
                    System.out.print("Enter this task's description : ");
                    task1.taskDescript[a] = scan.next();
                    while(!task1.checkTaskDescription(task1.taskDescript[a]))
                    {
                        System.out.print("Description shouldn't be more than 50 characters, Please try again : ");
                        task1.taskDescript[a] = scan.next();                    
                    }                 
                    
                    System.out.print("Enter this task's developer details : ");
                    task1.developDetails[a] = scan.next();
                    System.out.print("Enter this task's duration (in hours) : ");
                    task1.taskDuration[a] = scan.nextInt();
                    System.out.print("Enter this task status, Choose one from the below \n");
                    System.out.print("\n1. To Do");
                    System.out.print("\n2. Done");
                    System.out.print("\n3. Doing");
                    System.out.print("\nenter number before the option of your choice : ");
                    int choice = scan.nextInt();
                    
                    while(choice < 1 || choice > 3)
                    {
                        System.out.print("\nRange is between 1 and 3, please try again : ");
                        choice = scan.nextInt();                    
                    }
                    if(choice == 1)
                        task1.tStatus[a] = "To Do";
                    if(choice == 2)
                        task1.tStatus[a] = "Done";
                    if(choice == 3)
                        task1.tStatus[a] = "Doing";
                    
                    task1.creareTaskID(a);                        
                }
                if(option == 2)
                {
                    task1.printTaskDeatils(a);
                    a--;
                }
                if(option == 3)
                {
                    a = numberOfTasks;
                }  
          
                
                
                
                
                
                
                
                
                
                
                {  
                 
             
               int NoOfTask;
             System.out.print("How many Task do want to store : ");
             NoOfTask = scan.nextInt();
        
             System.out.print("\n\nThank you, You may now start capturing the tasks,\n should you wish to Quit just press 3..");
         
            Task1[] aa;
            aa = new Task1[NoOfTask]; 
            String[] TaskName = new String[NoOfTask];
            
            int [] TaskDuration = new int [NoOfTask];
            
            
            {
                
                System.out.print("\n\n1). Add tasks");
                System.out.print("\n2). Show report");
                System.out.print("\n3). Quit\n\nPick and option : ");
                
                if(option == 1)
                {
         
         
         aa= new Task1[NoOfTask];
        
        {
            
            
            aa[a] = new Task1();
            System.out.print("Enter name of " + (a+1) + " Developer : " );
            aa[a].Developer = scan.next();
            
            
            
            System.out.print("Enter Task " + (a+1) + "Name  : " );
            aa[a].TaskName = scan.next();
            TaskName[a] = aa[a].TaskName;
            
            
            
            System.out.print("Enter Task " + (a+1) + " ID : " );
            aa[a].TaskID= scan.nextLong();
            
            
            
            System.out.print("Enter Task " + (a+1) + "Duration : " );
            aa[a].TaskDuration = scan.nextInt();
            TaskDuration[a] = aa[a].TaskDuration;
            
            
            System.out.print("Enter this task status, Choose one from the below \n");
            System.out.print("\n1. To Do");
            System.out.print("\n2. Done");
            System.out.print("\n3. Doing");
            System.out.print("\nenter number before the option of your choice : ");
            
            
            
            int choice = scan.nextInt();
            while(choice < 1 || choice > 3)
            {
              System.out.print("\nRange is between 1 and 3, please try again : ");
              choice = scan.nextInt();                    
            }
            if(choice == 1)
                        Task1.TaskStatus = "To Do";
                    if(choice == 2)
                        Task1.TaskStatus = "Done";
                    if(choice == 3)
                        Task1.TaskStatus = "Doing";
                    
                      Task1.createTaskID();
                    
                   }
                    if(option == 2)
                   {
                    Task1.printTaskDeveloper(NoOfTask);
                    
                }
                if(option == 3)
                {
                    a = NoOfTask;
                } 
                
                
                
                String deleteTaskName;
                boolean TaskNameFound = false;
                  if(!TaskNameFound)
                System.out.print("\n\nNow enter the TaskName you want to delete");
                deleteTaskName= scan.next();
                
                
            while(!TaskNameFound)
        {
            
            {
                if(deleteTaskName == TaskName[a])
                {
                    aa[a].Developer = null;
                    aa[a].TaskName = null;
                    aa[a].TaskDuration = -1;
                    aa[a].TaskStatus = null;
                    TaskNameFound = true;              
                }
            }
            if(!TaskNameFound)
            {
                System.out.print("The TaskName you entered doesn't exist, Please try again : ");
                deleteTaskName = scan.next();
            }
            
            
            
            
            
             int[] Duration = null;
             int max=Duration[0];
             int position=0;
       
             if( max < Duration[a])
             {
                max=Duration[a];
                position=a;
            
            }
            
               String details="";
              for(int i=0; a<TaskName.length;a++)
              {
              if(TaskName.equals(TaskName[a]))
              {
                  String[] Developer = null;
                  String[] TaskStatus = null;
                details+=TaskName[a]+"   "+Developer[a]+"   "+TaskStatus[a]+"\n";
            }
        }
             String[] Developer = null;
                    
        for(int i=0;a < Developer.length;a++)
        {
            if(Developer.equals(Developer[a]))
            {
                String[] TaskStatus = null;
                details+=Developer[a]+"   "+TaskName[a]+"   "+TaskStatus[a]+"\n";
            }
        }
             for(int i= 0;a < Developer.length;a++){
                String[] TaskID = null;
                String[] TaskStatus = null;
           
                 details+="Task Name "+TaskName[a]+"\n"+"Developer Name "+Developer[a]+"\n"+"Task ID "+TaskID[a]+"\n"+"Task Duration "+TaskDuration[a]+"\n"+"Task Status "+TaskStatus[a]+"\n"; 
            
            
             
        System.out.print("\n\n\nHere are the details of all the people you captured\n");
       
        {
            System.out.print("\n\nTask "  + (a+1) + "'s Details : \n");
            System.out.println("Developer : " + aa[a].Developer);
            System.out.println("TaskName : " + aa[a].TaskName);
            System.out.println("TaskDuration : " + aa[a].TaskDuration);
            System.out.println("TaskStatus : " + aa[a].TaskStatus);             
        } 
            
            }
          
           
        }
            
}
    
}
             
                
                
            }    
        }
        
    }

       
    }
} 
} 

class Task1
{   
     static void printTaskDeveloper(int NoOfTask)  
     {
         System.out.print("\n\nTasks saved so far....\n");
       
        for(int a = 0; a < NoOfTask; a++)
        {
                System.out.print("\n\nTask "  + (a+1) + "'s Details : \n");
                /*System.out.println("Developer : " + Developer);*/
                /*System.out.println("TaskName : " + TaskName);*/
                /*System.out.println("TaskDuration : " + TaskDuration);*/
                System.out.println("TaskStatus : " + TaskStatus);        
        
        }    
     }
    static void createTaskID() 
    {
        
      System.out.print("\n\tTaskID\tTaskName\tTaskDuration\tTaskStatus\tDeveloper\n");  
   
    }

    
   String TaskName;
   String Developer;
   Long TaskID;
   int TaskDuration;
   static String TaskStatus;
   public Task1() 
   {
       TaskName = new String();
       String TaskStatus = new String();
       Developer = new String();
   } 
}