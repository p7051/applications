/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.applications;

/**
 *
 * @author Pedro
 */
public class Fibonacci {
   // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean verificarFibonacci(int numero) {
        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0;
        int b = 1;
        
        // Verifica se o número é um dos dois primeiros números da sequência de Fibonacci
        if (numero == a || numero == b) {
            return true;
        }
        
        // Calcula os números da sequência de Fibonacci até ultrapassar o número informado
        int c;
        while (b < numero) {
            c = a + b;
            a = b;
            b = c;
            
            // Verifica se o número pertence à sequência de Fibonacci
            if (b == numero) {
                return true;
            }
        }
        
        // Caso o número não pertença à sequência de Fibonacci
        return false;
    }
}