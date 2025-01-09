// PRACTICANDO EN CASA [08/01/2025]
package com.exercici0900;

import java.util.Scanner;

public class Main {
    
    public boolean isAnagrama(String palabra1 , String palabra2) {
        // Revisa que los inputs se ingrese algo.
        if (palabra1 == null || palabra2 == null) {
            return false;
        }

        // Pasamos las palabras, en minus y sin espacios.
        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        // Revisamos las longitudes de ambas palabras
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Separa las palabras en caracteres
        char[] char1 = palabra1.toCharArray();
        char[] char2 = palabra2.toCharArray();

        // Ordenamos los caracteres
        java.util.Arrays.sort(char1);
        java.util.Arrays.sort(char2);

        // Comprueba si son iguales y devuelve "True" o "False"
        return java.util.Arrays.equals(char1, char2);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.println("Escribe la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        System.out.println("¿Son las palabras " + palabra1 + " i " + palabra2 + " anagramas?: ");

        
    }
}
