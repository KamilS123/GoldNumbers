package Obiekty.pw.edu.Zadanie3;

public class Osoba_1 {
    int age;
    String nazwisko;
    int podaj_pobory;

    Osoba_1(int age, String nazwisko, int podaj_pobory) {
        this.age = age;
        this.nazwisko = nazwisko;
        this.podaj_pobory = podaj_pobory;
    }
/////////////////////////////////////////////////////////////
    public void podaj_typ(Integer a) {
        System.out.println(a instanceof Integer);
    }

    public void pokaz() {
        System.out.println( age + " " + nazwisko + " " + podaj_pobory);
    }

    public void porownaj(Osoba o1, Osoba o2) {
        System.out.println(o1.equals(o2));
    }


}
