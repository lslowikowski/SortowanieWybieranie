package com.company;

import java.util.Scanner;

/*******************************************************
 * nazwa klasy: KonsolowaE0
 * opis: Główna klasa uruchamiająca program
 * autor: 00000000000
 *******************************************************/
public class KonsolowaE0 {
    static final int LICZBA_ELEMENTOW = 10;
    static int[] tablica = new int[LICZBA_ELEMENTOW];

    /*******************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - parametry uruchomieniowe
     * wartość zwracana: brak
     * opis: główna metoda uruchomieniowa
     * autor: 00000000000
     *******************************************************/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < LICZBA_ELEMENTOW; i++) {
            System.out.print("Podaj " + (i + 1) + " element tablicy: ");
            tablica[i] = scanner.nextInt();
        }
        Sortowanie sortowanieWstawianie = new Sortowanie(tablica);
        sortowanieWstawianie.sorutj();
        System.out.println("Tablica po posortowaniu:");
        System.out.println(sortowanieWstawianie.toString());

        sortowanieWstawianie.sorutjMalejaco();
        System.out.println("Tablica po posortowaniu malejąco:");
        System.out.println(sortowanieWstawianie.toString());
    }
}
