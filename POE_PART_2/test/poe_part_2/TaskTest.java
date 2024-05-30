/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe_part_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static poe_part_2.Task.taskDurationArray;

/**
 *
 * @author Simphiwe Khumalo
 */
public class TaskTest {
 
    public TaskTest() {
    } 
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Task.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Task.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginRequired method, of class Task.
     */
    @Test
    public void testLoginRequired() {
        System.out.println("loginRequired");
        Task.loginRequired();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of initializeArrays method, of class Task.
     */
    @Test
    public void testInitializeArrays() {
        System.out.println("initializeArrays");
        Task.initializeArrays();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class Task.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Task.addTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskName method, of class Task.
     */
    @Test
    public void testTaskName() {
        System.out.println("taskName");
        String expResult = "We wanna make bank!!!!!";
        String result = Task.taskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of takeTaskDescription method, of class Task.
     */
    @Test
    public void testTakeTaskDescription() {
        System.out.println("takeTaskDescription");
       // the test will ask for input for you
        String expResult = "Please enter a task description that is less than 50 characters long";
        String result = Task.takeTaskDescription();
        assertEquals(expResult, result);
        
      //case for false
        System.out.println("takeTaskDescription");
       // the test will ask for input for you
        String expResult2 = "Please enter a task description that is less than 50 characters long";
        String result2 = Task.takeTaskDescription();
        assertEquals(expResult2, result2);
      
      
      
      
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescriptionStore = "Login Feature";
        boolean expResult = true;
        boolean result = Task.checkTaskDescription(taskDescriptionStore);
        assertEquals(expResult, result);
       if(result){
           System.out.println("Task successfully captured");}
       else{System.out.println("Please enter a task description that is less than 50 letters");}
          
        
        //please look at the method above for TaskDescription assert Equals
        
        //case 2
        
        System.out.println("checkTaskDescription");
        String taskDescriptionStore2 = "eybgeruiberuibgeriubgeruibgierubgeugberibgueirbgeirubgierubgeruibgiberuibguier";
        boolean expResult2 = false;
        boolean result2 = Task.checkTaskDescription(taskDescriptionStore2);
        assertEquals(expResult2, result2);
         if(result2){
           System.out.println("Task successfully captured");}
       else{System.out.println("Please enter a task description that is less than 50 letters");}
          
    }

    /**
     * Test of developerDetails method, of class Task.
     */
    @Test
    public void testDeveloperDetails() {
        System.out.println("developerDetails");
        String expResult = "";
        String result = Task.developerDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskDuration method, of class Task.
     */
    @Test
    public void testTaskDuration() {
        System.out.println("taskDuration");
        int expResult[] = {8,10};
        int result = Task.taskDuration();
        assertEquals(expResult[1], result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        
        
        
        
        
        
        
        
        
        
        
        // remaining task ID loop(Since we were not provided with the data for these i went ahead and made my own as you said)
        Task.numberOfTasks = 0;
        String nameOfTask[] = {"Add Login Feature","Design a System","Design USSR"};
        String devDetails[] = {"Harrison Robyn","Khumalo Simphiwe","Stalin Joseph"};
        String expResult[] = {"AD:0:BYN","DE:1:IWE","DE:2:EPH"};
        String result[] = new String[expResult.length];

        
        for(int i = 0;i<nameOfTask.length;i++){
        System.out.println("createTaskID");
        result[i] = Task.createTaskID(nameOfTask[i], devDetails[i]);
        System.out.println(result[i]);
      
        assertEquals(expResult[i], result[i]);
           Task.numberOfTasks ++;
        }
       
       
     
        
    }

    /**
     * Test of status method, of class Task.
     */
    @Test
    public void testStatus() {
        System.out.println("status");
        String expResult = "To Do";
        String result = Task.status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String expResult = "";
        String result = Task.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public  void testReturnTotalHours() {
        //Task 1 and Task2  data
        System.out.println("returnTotalHours");
        Task.howManyTasks = 2;
        Task.taskDurationArray = new int[2];
        Task.taskDurationArray[0] = 10;
        Task.taskDurationArray[1] = 8;
        int sum = 0;
        for(int i = 0;i<taskDurationArray.length;i++){
        sum = sum + taskDurationArray[i];
        
        }
       
        
        int expResult  = sum;
        int result = Task.returnTotalHours();
        System.out.print(result);
        assertEquals(expResult, result);
        
        
        //The 5 test datas
       System.out.println("returnTotalHours");
       int sum2 = 0;
        Task.howManyTasks = 5;
        Task.taskDurationArray = new int[5];
        Task.taskDurationArray[0] = 10;
        Task.taskDurationArray[1] = 12;
        Task.taskDurationArray[2] = 55;
        Task.taskDurationArray[3] = 11;
        Task.taskDurationArray[4] = 1;
        for(int i = 0;i<taskDurationArray.length;i++){
        sum2 = sum2 + taskDurationArray[i];
        
        }
       
        int expResult2  = sum2;
        int result2 = Task.returnTotalHours();
        System.out.print(result2);
        assertEquals(expResult2, result2);
        
    }
    
}
