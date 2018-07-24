package Obiekty.ZadanieZNumeramiTel;

public class GoldNumbers {
    String imie;
    int ciagCyfr;
    int xxx,yy,zz;

    public GoldNumbers(String imie, int ciagCyfr, int xxx, int yy, int zz) {
        this.imie = imie;
        this.ciagCyfr = ciagCyfr;
        this.xxx = xxx;
        this.yy = yy;
        this.zz = zz;

    }

    public GoldNumbers(String imie, int ciagCyfr, int xxx, int yy) {
        this.imie = "Kasia";
        this.ciagCyfr = 888;
        this.xxx = 2;
        this.yy = 1;
    }

    public GoldNumbers(String imie, int ciagCyfr, int xxx) {
        this.imie = "Mariusz";
        this.ciagCyfr = 501;
        this.xxx = 7;
    }



    @Override
    public String toString() {
        String wynik = "";
        wynik = wynik + imie + ":\n";
            if(xxx!=0 && yy!=0 && zz!=0)
                wynik = wynik + ciagCyfr + "-" + xxx+xxx+xxx + "-" + yy+yy + "-" + zz+zz;
            else if (xxx!=0 &&yy!=0)
                wynik = wynik + ciagCyfr + "-" + xxx+xxx+xxx + "-" + yy+yy + "-" + yy+yy;
            else if (xxx!=0)
                wynik = wynik + ciagCyfr + "-" + xxx+xxx+xxx + "-" + xxx+xxx + "-" + xxx+xxx;
                    return wynik;



        }

    public void zmienCyfre(int i, int j) {

        this.xxx = j;

    }



    public static void main(String[] args) {
        GoldNumbers nr1 = new GoldNumbers("Piotr",605,5,4,3);
        GoldNumbers nr2 = new GoldNumbers("Kasia",888,2,1);
        GoldNumbers nr3 = new GoldNumbers("Mariusz",501,7);


        nr1.zmienCyfre(1,7);

        nr2.zmienCyfre(2,5);

        nr3.zmienCyfre(3,4);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);



    }

}








/*Zad1
Zdefiniuj klasę GoldNumber, której obiekty będą tzw. "złotymi" numerami telefonicznymi,
czyli numerami, które są łatwe do zapamiętania. Przyjmujemy, że obiekty tej klasy, to numery
postaci XXX-YY-ZZ, gdzie X to cyfra występująca w pierwszym członie numeru,
odpowiednio Y i Z to cyfry, z których składają się człony drugi i trzeci. Obiekty tej klasy
dodatkowo jako atrybuty mają posiadać informację o osobie, która jest właścicielem numeru
oraz numer identyfikujący sieć.
Zdefiniuj odpowiednie metody porządkowe, użytkowe i konstruktory tak, aby można było
uruchomić poniższy kod testowy. */