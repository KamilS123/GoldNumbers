package Obiekty.Rachunek;

public class Rachunek {
    String rodzaj_rachunku;
    int kwota_do_zaplaty;

    public Rachunek(String rodzaj_rachunku, int kwota_do_zaplaty) {
        this.rodzaj_rachunku = rodzaj_rachunku;
        this.kwota_do_zaplaty = kwota_do_zaplaty;
    }
    public Rachunek(){}

    public String toString() {
        String wynik = "";

        wynik = wynik + "Rodzaj rachunku: " + rodzaj_rachunku + "\n na kwote: " + kwota_do_zaplaty + "zł";
        return wynik;
    }

    public void DodajDoRachunku(int dodaj) {
        this.kwota_do_zaplaty = kwota_do_zaplaty + dodaj;
    }

    public static void main(String[] args) {
      Rachunek rachunek = new Rachunek("Gaz",125);
      rachunek.DodajDoRachunku(20);
        System.out.println(rachunek);
    }


}
/*Zaprojektuj i zaimplementuj klasę Rachunek tak, aby możliwe było uruchomienie poniższego
kodu testującego.
kod programu wynik działania
programu
 Rachunek r1= new
Rachunek("gaz",135.59);
 Rachunek r2= new
Rachunek("elektrycznosc",99.0);
Rachunek za: gaz
 wysokosc:
 System.out.println(r1);
 System.out.println(r2);
 r1.dodaj(6.41);
 r2.dodaj(1.78);
 System.out.println(r1);
 System.out.println(r2);
 Rachunek r3= new Rachunek();
 System.out.println(r3);
jed*trz*pie*59/100
zł
Rachunek za:
elektrycznosc
 wysokosc:
dzie*dzie zł
Rachunek za: gaz
 wysokosc:
jed*czt*dwa zł
Rachunek za:
elektrycznosc
 wysokosc:
jed*zer*zer*78/100
zł
Rachunek za:
pizza?
 wysokosc: zer */