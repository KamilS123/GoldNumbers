package Obiekty.pw.edu.Zadanie2;

public class Osoba1 {
    int wiek;
    String nazwisko;

    Osoba1(int wiek, String nazwisko) {
        this.wiek = wiek;
        this.nazwisko = nazwisko;
    }

//

    public void pokaz(){
        System.out.println(wiek +  " " + nazwisko);
    }

    boolean porwonaj(Osoba1 os1, Osoba2 os2) {
        System.out.println(os2.equals(os1));
        return os2.equals(os1);
    }
}
