/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.nix.chernikov.hw1;

import java.util.Random;
import ua.nix.chernikov.hw1.tasks.Task;
import ua.nix.chernikov.hw1.tasks.Task1;
import ua.nix.chernikov.hw1.tasks.Task2;
import ua.nix.chernikov.hw1.tasks.Task3;
import ua.nix.chernikov.hw1.utils.Util;

/**
 *
 * @author sergeychernikov
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Initialization of task instances
        Task task1 = new Task1(Util.SOME_STRING);
        Task task2 = new Task2(Util.SOME_STRING);
        Task task3 = new Task3(new Random().nextInt((Util.MAX_LESSON_NUMBER -
                Util.MIN_LESSON_NUMBER) + 1) + Util.MIN_LESSON_NUMBER);
        
        System.out.println("Task1 execution result");
        System.out.println(task1.executeTask() + "\n");
        System.out.println("Task2 execution result");
        System.out.println(task2.executeTask() + "\n");
        System.out.println("Task3 execution result");
        System.out.println(task3.executeTask());
    }
}
