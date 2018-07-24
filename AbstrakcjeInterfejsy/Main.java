package Obiekty.AbstrakcjeInterfejsy;

public class Main  {
    public static void main(String[] args) {
        Pojazdy p1 = new Pojazdy("Fiat","Zielony", 5,1600);
        Pojazdy p2 = new Pojazdy("Seat","Czerwony", 6,1800);
        Pojazdy p3 = new Pojazdy("Panda","Pomarańczowy", 3,1900);
        Pojazdy p4 = new Pojazdy("Volvo","Purpurowy", 2,1400);
        p1.KlaksonInterface1(20);
        p1.KlaksonInterface2(20);

        System.out.println(p1);

        Samochód_1 s1 = new Samochód_1("Fiat","Red", 6, 1800);
        s1.setImie_wlasciciela("Klaudiusz");
        s1.getImie_wlasciciela();

        Samochód_2 s2 = new Samochód_2("Polonez","Niebieski",7,1850);
        s2.setImie_wlasciciela("Monika");
        s2.getImie_wlasciciela();

        s2.KlaksonInterface2();
        s1.KlaksonInterface1();
    }

}
