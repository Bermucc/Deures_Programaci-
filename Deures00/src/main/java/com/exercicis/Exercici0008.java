package com.exercicis;

import java.util.ArrayList;
import java.util.Scanner;

// Albert, he probat diferents formas d'executar el text, (a més he copiat el resolt per fer probes i dona el mateix problema).
public class Exercici0008 {

    public static ArrayList<Integer> generaImparells(int numero) {
        ArrayList<Integer> imparells = new ArrayList<>();
        
        for (int i = 3; i <= numero; i += 2){
            imparells.add(i);
        }
        
        return imparells;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introdueix un número: ");
        int numero = scanner.nextInt();

        if (numero <= 2){
            System.out.println("No hi ha nombres imparells entre 2 i " + numero);
        } else {
           ArrayList<Integer> imparells = generaImparells(numero);
           System.out.println("Nombre imparells entre 2 i " + numero + ":" + imparells); 
        }

        scanner.close();
    }
}
