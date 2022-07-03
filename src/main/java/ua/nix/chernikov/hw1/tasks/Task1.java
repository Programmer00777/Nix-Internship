/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.nix.chernikov.hw1.tasks;

/**
 *
 * @author sergeychernikov
 */
public class Task1 implements Task {
    
    private final String someString;
    private int result = 0;
    
    public Task1(String someString) {
        this.someString = someString;
    }
    
    @Override
    public String executeTask() {
        char[] arrayOfSymbols = someString.toCharArray();
        
        for (char character : arrayOfSymbols) {
            if (Character.isDigit(character)) {
                result += Character.getNumericValue(character);
            }
        }
        
        return ""+result;
    }
    
}
