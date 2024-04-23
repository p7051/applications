 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.applications;

import static com.mycompany.applications.InverterString.inverterString;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Applications {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
      /*  // Solicita um número ao usuário
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        // Chama o método verificarFibonacci da classe Fibonacci
        if (Fibonacci.verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }*/
    
        
        // Solicita uma string ao usuário
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();
        
        // Inverte a string
        String invertedString = inverterString(input);
        
        // Imprime a string invertida
        System.out.println("String invertida: " + invertedString);
        
        scanner.close();
    }
}

