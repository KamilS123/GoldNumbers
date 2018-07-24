package Obiekty.AbstrakcjeInterfejsy;

public class Pojazdy implements Interface1, Interface2{
    private String marka;
    String kolor;
    int liczba_drzwi;
    int pojemnosc;
    private String imie_wlasciciela;


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getLiczba_drzwi() {
        return liczba_drzwi;
    }

    public void setLiczba_drzwi(int liczba_drzwi) {
        this.liczba_drzwi = liczba_drzwi;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    Pojazdy(String marka, String kolor, int liczba_drzwi, int pojemnosc) {
        this.marka = marka;
        this.kolor = kolor;
        this.liczba_drzwi = liczba_drzwi;
        this.pojemnosc = pojemnosc;
    }


    @Override
    public int KlaksonInterface1(int siła_dzwieku) {
        System.out.println("Klakson 1 Pojazdy" + "csiła: " + siła_dzwieku);
        return 0;
    }




    public String toString() {
        return marka + " " + kolor + " " + liczba_drzwi + " " + pojemnosc;
    }

    @Override
    public int KlaksonInterface2(int siła_dzwieku) {
        System.out.println("Klakson 1 Pojazdy" + "siła: " + siła_dzwieku);
        return 0;
    }
}
