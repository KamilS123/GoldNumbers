package Obiekty.Lekarstwa;

public class Main {
    public static void main(String[] args) {
        Lekarstwa lekarstwa1 = new Lekarstwa("Apap", 15,0.1);
        Lekarstwa lekarstwa2 = new Lekarstwa("WitaminaC", 15,0.1);
        Lekarstwa lekarstwa3 = new Lekarstwa("Polopiryna", 15,0.1);
        Lekarstwa lekarstwa4 = new Lekarstwa("Gripex", 15,0.1);
        Lekarstwa lekarstwa5 = new Lekarstwa("Rutinoscorbin", 15,0.1);

        lekarstwa1.setRefundacja(0.1);
        lekarstwa2.setRefundacja(0.5);
        lekarstwa3.setRefundacja(0.3);
        lekarstwa4.setRefundacja(0.25);
        lekarstwa5.setRefundacja(0.16);


        lekarstwa1.cena(true);
        lekarstwa2.cena(false);
        lekarstwa3.cena(true);
        lekarstwa4.cena(false);
        lekarstwa5.cena(true);
        }
}
