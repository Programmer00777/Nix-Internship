/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.nix.chernikov.hw1.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sergeychernikov
 */
public class Task2 implements Task {
    
    private final String someString;
    private StringBuffer result = new StringBuffer();
    
    public Task2(String someString) {
        this.someString = someString;
    }
    
    @Override
    public String executeTask() {
        Map<Character, Integer> map = new HashMap<>();
        char[] arrayOfSymbols = someString.toCharArray();
        for (char character : arrayOfSymbols) {
            if (Character.isLetter(character)) {
                if (map.containsKey(character)) {
                   map.replace(character, map.get(character), map.get(character)+1);
                } else {
                    map.put(character, 1);
                }
            }
        }

        map.forEach((k, v) -> {
            result.append(k + " -> " + v + "\n");
        });

        return result.toString();
    }
    
}
