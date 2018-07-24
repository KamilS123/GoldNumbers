package Obiekty.ObslugaZamowien;

public class Zamowienie  extends Main{
    Pozycja[]pozycje;
    int ileDodanych;
    int maksRozmiar = 10;

    Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }
    Zamowienie() {

    }

    public void dodajPozycje(Pozycja p) {
        p = new Pozycja();

    }


    public double obliczWartosc(int ileSztuk, double cena) {
        return  ileSztuk*cena;
    }




}
