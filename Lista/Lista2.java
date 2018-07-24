package Obiekty.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista2 {
    int pojemnosc;
    private int[]liczby = new int[pojemnosc];
    int rozmiar;

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int[] getLiczby() {
        return liczby;
    }

    public void setLiczby(int[] liczby) {
        this.liczby = liczby;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    Scanner scanner = new Scanner(System.in);

    Lista2(int pojemnosc, int rozmiar) {
        this.pojemnosc = pojemnosc;
        this.rozmiar = rozmiar;
        this.liczby = new int[pojemnosc];
    }



    public void dodajElement() {


        Lista2 l2 = new Lista2(10,10);
        System.out.print("Podaj liczbe: ");
        for(int i= 0; i<l2.liczby.length; i++) {
            l2.liczby[i] = scanner.nextInt();
        }

        List<Lista2>newLista2 = new ArrayList<>();
        newLista2.add(new Lista2(10,10));
        newLista2.add(new Lista2(4,23));
        newLista2.add(new Lista2(1,34));
        newLista2.add(new Lista2(11,23));

        for(Lista2 p : newLista2) {
            System.out.println(p.toString());
        }


    }


    public static void main(String[] args) {
        Lista2 lista2 = new Lista2(10,10);
        lista2.dodajElement();

    }
}
