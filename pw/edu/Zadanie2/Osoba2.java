package Obiekty.pw.edu.Zadanie2;

public class Osoba2 extends Osoba1{
    int pobory;
    Osoba2(int wiek, String nazwisko, int pobory){
        super(wiek, nazwisko);
        this.pobory = pobory;
    }

    public void pokaz() {
        System.out.println(wiek + " " + nazwisko + " " + pobory);
    }
}
