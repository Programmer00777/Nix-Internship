/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.nix.chernikov.hw1.tasks;

import java.util.Scanner;

/**
 *
 * @author sergeychernikov
 */
public class Task3 implements Task {
    
    private int lessonNumber;
    
    String[] tableOfTenses = {"09:45", "10:35", "11:35", "12:25", "13:25",
                                "14:15", "15:15", "16:05", "17:05", "17:55"};
    Scanner scanner = new Scanner(System.in);
    
    public Task3(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }
        
    
    @Override
    public String executeTask() {
//        System.out.println("Please, enter the lesson number > ");
//        int lessonNumber = scanner.nextInt();
        
        if (lessonNumber < 1 || lessonNumber > 10) {
            System.out.println("You have entered an incorrect lesson number");
            throw new IllegalStateException("Incorrect lesson number. The lesson number must be"
                    + "between 1 and 10");
        } else {
            return tableOfTenses[lessonNumber-1];
        }
    }
    
}
