package Obiekty.pw.edu.Zadanie3;

public class Osoba_2 extends Osoba_1 {
    Osoba_2(int age, String nazwisko, int podaj_pobory) {
        super(age, nazwisko, podaj_pobory);
    }

    @Override
    public void pokaz() {
        System.out.println( age + " " + nazwisko + " " + podaj_pobory);

    }
    @Override
    public void podaj_typ(Integer a) {
        System.out.println(a instanceof Integer);
    }
    @Override
    public void porownaj(Osoba o1, Osoba o2) {
        System.out.println(o1.equals(o2));
    }
}
