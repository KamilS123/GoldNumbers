package Obiekty.ZadanieGrupoweTydz4;

public class Ochroniarz extends Pracownik {
    int uchybienia;

    public Ochroniarz(double pensja, int uchybienia, String imie, String nazwisko) {
        super(pensja, imie, nazwisko);
        this.uchybienia = uchybienia;
    }


    public int getUchybienia() {
        return uchybienia;
    }

    public void setUchybienia(int uchybienia) {
        this.uchybienia = uchybienia;
    }


    public void potrac(){
        System.out.println((5*uchybienia));
    }


    public void wyplac() {
        System.out.println(pensja-(5*uchybienia));

    }

}
