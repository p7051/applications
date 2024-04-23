/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applications;

/**
 *
 * @author Pedro
 */
public class InverterString {
     public static String inverterString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        
        while (left < right) {
            // Troca os caracteres da posição left com os da posição right
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            
            // Move os índices para o próximo par de caracteres
            left++;
            right--;
        }
        
        return new String(characters);
    }
}
