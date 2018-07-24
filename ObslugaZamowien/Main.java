package Obiekty.ObslugaZamowien;

public class Main {
    public static void main(String[] args) {
        Pozycja p1 = new Pozycja("Chleb",10,3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier",5,2.5);
        System.out.println(p2);

        Zamowienie z1 = new Zamowienie(20);
        Zamowienie z2 = new Zamowienie(20);
        z1.dodajPozycje(p1);
        z2.dodajPozycje(p2);
        System.out.println(z1);
        System.out.println(z1);

    }
}
