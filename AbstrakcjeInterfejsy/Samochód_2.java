package Obiekty.AbstrakcjeInterfejsy;

public class Samochód_2 extends Pojazdy  {
    private String imie_wlasciciela;

    Samochód_2(String marka, String kolor, int liczba_drzwi, int pojemnosc) {
        super(marka, kolor, liczba_drzwi, pojemnosc);
    }

    public void setImie_wlasciciela(String imie_wlasciciela) {
        this.imie_wlasciciela = imie_wlasciciela;
    }

    public String getImie_wlasciciela() {
        System.out.println(imie_wlasciciela);
        return imie_wlasciciela;
    }

   public void KlaksonInterface2() {
        System.out.println("Klakson 2 Samochód 2");
    }
   /* public void KlaksonInterface_1() {
        System.out.println("Klakson 1 Samochód 2");
    }*/

}
