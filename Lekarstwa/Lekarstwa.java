package Obiekty.Lekarstwa;

public class Lekarstwa {

    String  nazwa;
    double cena;
    double refundacja;
    boolean ubezpieczony;


    Lekarstwa(String  nazwa, double cena, double refundacja) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.refundacja = refundacja;


    }

    public void setNazwa(String  nazwa) {
        this.nazwa = nazwa;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setRefundacja(double refundacja) {
        this.refundacja = refundacja;
    }
    public void setUbezpieczony(boolean ubezpieczony) {
        this.ubezpieczony = ubezpieczony;
    }
//////////////////
    public String  getNazwa() {
        return nazwa;
    }
    public double  getCena() {
        return cena;
    }

    public double  getRefundacja() {
        return cena * refundacja ;
    }
    public boolean getUbezpieczony() {
        if(ubezpieczony==true) {
            System.out.println(refundacja);
        }
        return ubezpieczony;
    }
    ///////////////////////////////////////////////////////

    double cena(boolean ubezpieczony) {
        if(ubezpieczony) {
            System.out.println(getNazwa() + " kosztuje " + (cena - getRefundacja() + "zł po refundacji"));
        } else {
            System.out.println(nazwa + " nie ma refundacji");
        }
    return 0;
    }
////////////////////////////////////////////


}
