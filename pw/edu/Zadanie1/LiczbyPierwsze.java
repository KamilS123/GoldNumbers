package Obiekty.pw.edu.Zadanie1;

import java.math.BigInteger;

public class LiczbyPierwsze {
    public static void main(String[] args) {
        wyswietl(50,100);


    }
    public static void wyswietl(int a, int b) {
        int c = (b-a);
        int licznik = 0;                            //nie są liczbami pierwszymi
        for (int i = 2; i<c; i++) {
            for(int k=1; (k<i); k++) {
                if(i%k==0) {
                    licznik++;
                }
                if(licznik>2) {
                    System.out.println("Liczba " + i + " Nie jest pierwszą");
                    licznik =0;
                    break;
                }
            }
        }


///////////////////////////////
    }
///////////////////////////////
}
