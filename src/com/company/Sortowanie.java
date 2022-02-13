package com.company;

import java.util.Arrays;

/*******************************************************
 * nazwa klasy: Sortowanie
 * opis: Klasa pozwalająca na sortowanie  10-cio
 *       elmentowej tablicy liczb w porządku rosnącym i malejącym
 * autor: 00000000000
 *******************************************************/
public class Sortowanie {
    static final int LICZBA_ELEMENTOW = 10;
    private int[] tablica = new int[LICZBA_ELEMENTOW];

    /*******************************************************
     * nazwa funkcji: Sortowanie
     * parametry wejściowe: tablica - sortowana tablica
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 00000000000
     *******************************************************/

    public Sortowanie(int[] tablica) {
        this.tablica = tablica;
    }

    /*******************************************************
     * nazwa funkcji: sortuj
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sortuje poprzez wstawianie tablicę w porządku rosnącym
     * autor: 00000000000
     *******************************************************/
    public void sorutj() {
        for (int i = 0; i < LICZBA_ELEMENTOW - 1; i++) {
            int indeksNajmniejszej = najmniejsza(i);
            zamien(i, indeksNajmniejszej);
        }
    }

    /*******************************************************
     * nazwa funkcji: sortujMalejąco
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sortuje poprzez wstawianie tablicę w porządku malejącym
     * autor: 00000000000
     *******************************************************/
    public void sorutjMalejaco() {
        for (int i = 0; i < LICZBA_ELEMENTOW - 1; i++) {
            int indeksNajwiekszej = najwieksza(i);
            zamien(i, indeksNajwiekszej);
        }
    }

    /*******************************************************
     * nazwa funkcji: najmniejsza
     * parametry wejściowe: odElementu - indeks elementu, od którego
     *                                    wyszukujemy najmniejszy element tablicy
     * wartość zwracana: indeks najmniejszego elementu
     * opis: wyszukuje indeks najmniejszego elementu tablicy począwszy od indeksu
     *       wskazanego w parametrze odElementu
     * autor: 00000000000
     *******************************************************/

    public int najmniejsza(int odElementu) {
        int indeksNajmniejszego = odElementu;
        for (int i = odElementu + 1; i < LICZBA_ELEMENTOW; i++) {
            if (tablica[indeksNajmniejszego] > tablica[i]) {
                indeksNajmniejszego = i;
            }
        }
        return indeksNajmniejszego;
    }

    /*******************************************************
     * nazwa funkcji: najwieksza
     * parametry wejściowe: odElementu - indeks elementu, od którego
     *                                    wyszukujemy największy element tablicy
     * wartość zwracana: indeks najwiekszego elementu
     * opis: wyszukuje indeks najwiekszego elementu tablicy począwszy od indeksu
     *       wskazanego w parametrze odElementu
     * autor: 00000000000
     *******************************************************/
    public int najwieksza(int odElementu) {
        int indeksNajwiekszego = odElementu;
        for (int i = odElementu + 1; i < LICZBA_ELEMENTOW; i++) {
            if (tablica[indeksNajwiekszego] < tablica[i]) {
                indeksNajwiekszego = i;
            }
        }
        return indeksNajwiekszego;
    }

    /*******************************************************
     * nazwa funkcji: zamień
     * parametry wejściowe: indexEl1 - indeks pierwszego zamienianego elementu
     *                      indexEl2 -indeks drugiego zamienianego elementu
     * wartość zwracana: brak
     * opis: zamienia ze sobą elenty tblicy o indeksach indexEl1 i indexEl2
     * autor: 00000000000
     *******************************************************/
    public void zamien(int indexEl1, int indexEl2) {
        int pomocniczy = tablica[indexEl1];
        tablica[indexEl1] = tablica[indexEl2];
        tablica[indexEl2] = pomocniczy;
    }

    /*******************************************************
     * nazwa funkcji: toString
     * parametry wejściowe: brak
     * wartość zwracana: napis zawierający elementy tablicy oddzielone przecinkami
     * opis: zwraca napis pokazujący zawartość tablicy w formacie [el1, el2, ....elN]
     * autor: 00000000000
     *******************************************************/
    @Override
    public String toString() {
        return Arrays.toString(tablica);
    }
}
