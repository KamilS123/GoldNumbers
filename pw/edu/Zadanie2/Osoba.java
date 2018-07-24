package Obiekty.pw.edu.Zadanie2;

public class Osoba {
    public static void main(String[] args) {
        Osoba1 o1 = new Osoba1(78,"Kaisa");
        Osoba1 o3 = new Osoba1(78,"Kaisa");
        Osoba2 o2 = new Osoba2(32,"Konr",5);

        o1.pokaz();
        o2.pokaz();

        o1.porwonaj(o1, (Osoba2) o3);
    }
}
