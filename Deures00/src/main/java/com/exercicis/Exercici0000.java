package com.exercicis;

import java.util.Scanner;

public class Exercici0000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriu el primer número: ");
        Integer X = scanner.nextInt();
        
        System.out.print("Escriu el segon número: ");
        Integer Y = scanner.nextInt();

        Integer Z = X - Y;

        System.out.println("El resultat de calcular "+X+" - "+Y+" és "+Z);

        scanner.close();
    }
}
