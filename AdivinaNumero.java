package com.mycompany.calcularpromedio;
import java.util.Scanner;

import java.util.Scanner;

public class AdivinaNumero {
    
    public static void main(String[] args) {
        int numeroAdivinar = 42;
        int intentos = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Adivina el número (entre 1 y 100): ");
            int numeroUsuario = scanner.nextInt();
            intentos++;
            
            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }
        
        scanner.close();
    }
}