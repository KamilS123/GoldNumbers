package Obiekty.ZadanieGrupoweTydz4;

public class Pracownik implements Wyplata {
    double pensja;
    String imie;
    String nazwisko;
    int nadgodziny;
    double wyplata;

    public Pracownik(double pensja, String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;

    }


    public void setPensja() {
        this.pensja = pensja;
    }
    public double getPensja() {
        return pensja;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNadgodziny(int nadgodziny) {
        this.nadgodziny = nadgodziny;
    }
    @Override
    public String toString(){
        return "Imie: " + imie + " Nazwisko: " + nazwisko;
    }


    @Override
    public void wyplac() {
        System.out.println("Pensja: " + pensja + nadgodziny);

    }

    @Override
    public void potrac() {
        System.out.println("Nie ma potracen");

    }
//////////////////////////////////////////

}
