package Obiekty.ZadanieGrupoweTydz4;

public class Pielegniarka extends Pracownik {
    int nadgodziny;

    public Pielegniarka(double pensja, int nadgodziny, String imie, String nazwisko) {
        super(pensja, imie, nazwisko);
        this.nadgodziny = nadgodziny;
    }

    public int getNadgodziny() {
        return nadgodziny;
    }

    public void setNadgodziny(int nadgodziny) {
        this.nadgodziny = nadgodziny;
    }



    public void wyplac() {
        System.out.println(pensja +(13*nadgodziny));
    }
}
