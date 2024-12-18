package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Escriu el pes (kg): ");
        Double pes = scanner.nextDouble();

        System.out.print("Escriu l'alçada (cm): ");
        Double altura = scanner.nextDouble();

        double metros = altura / 100;
        double imc = pes / (metros * metros);
        
        System.out.printf(localeUS,"imc = %.2f%n", imc);


        scanner.close();
    }
}
