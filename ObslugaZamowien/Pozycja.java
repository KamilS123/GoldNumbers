package Obiekty.ObslugaZamowien;

public class Pozycja extends Zamowienie{
    String nazwaTowaru;
    public int ileSztuk;
    public double cena;

    Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    Pozycja() {

    }
    @Override
    public double obliczWartosc(int ileSztuk, double cena) {
        return ileSztuk*cena;
    }
    @Override
    public String toString() {
        return nazwaTowaru + " " + cena + "zł " + ileSztuk + "szt  " + obliczWartosc(ileSztuk,cena) + "zł";
    }

    public int getIleSztuk() {
        return ileSztuk;
    }
}
