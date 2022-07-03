/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.nix.chernikov.hw1.test;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.nix.chernikov.hw1.tasks.Task;
import ua.nix.chernikov.hw1.tasks.Task1;
import ua.nix.chernikov.hw1.tasks.Task2;
import ua.nix.chernikov.hw1.tasks.Task3;

/**
 * Class for testing @link(Main.class)
 * 
 * @author sergeychernikov
 */
public class MainTest {
    
   @Test
   public void task1Test() {
       String someString = "1w4tt!7";
       Task task1 = new Task1(someString);
       String result = task1.executeTask();
       
       assertTrue(result.equals("12"));
   }
   
   @Test
   public void task2Test1() {
       String someString = "1w4tt!7";
       String assertion = "w -> 1\nt -> 2\n";
       Task task2 = new Task2(someString);
       String result = task2.executeTask();
       
       assertTrue(result.charAt(result.length() - 1) == assertion.charAt(assertion.length() - 1));
       assertTrue(result.charAt(result.length() - 6) == assertion.charAt(assertion.length() - 6));
   }
   
   @Test
   public void task3Test() {
       Task task3 = new Task3(3);
       String result = task3.executeTask();
       
       assertTrue(result.equals("11:35"));
   }
}
