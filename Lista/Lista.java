package Obiekty.Lista;

import java.util.Scanner;

public class Lista {
    int rozmiar;
    int pojemnosc;
    int[]lista = new int[pojemnosc];

    public Lista(int rozmiar, int pojemnosc) {
        this.rozmiar = rozmiar;
        this.pojemnosc = pojemnosc;
        this.lista = new int[pojemnosc];
    }

    public static void pokaż(int pojemnosc) {
        Scanner scanner = new Scanner(System.in);
        Lista l = new Lista(20,20);

        for(int i = 0; i<l.lista.length; i++) {
            l.lista[i] = scanner.nextInt();
            System.out.println(l.lista[i]);

        }
    }


    public static void main(String[] args) {
       //dodajElement(10,10);
       pokaż(10);
    }

    public static void dodajElement(int rozmiar, int pojemnosc) {
        Scanner scanner = new Scanner(System.in);
        Lista l1 = new Lista(50,20);

       int [] lista = new int [l1.pojemnosc];

        while(lista.length<10) {
            System.out.print("Podaj numer do listy: ");

            for(int i = 0; i<lista.length; i++) {
                lista[i] = scanner.nextInt();
                if(lista.length>l1.pojemnosc) {
                    System.out.println("Zbyt długa lista");
                }
        }


        }
    }
}
