package Obiekty.Super;


    class ksiazka {
        String tytuł = "Marks";
        int rozdziały = 90;
        double cena = 50;

        void pokazInformacje() {
            System.out.println("Tytuł: " + tytuł + "\ncena: " + cena + "zł " + "\nrozdziały: " + rozdziały);
        }
    }
    class Nadpisanie extends ksiazka{
        int ile_stron = 200;

        void pokazInformacje(){
            super.pokazInformacje();
            System.out.println("stron: " + ile_stron);
        }
}
public class Super {
    public static void main(String[] args) {
        Nadpisanie np1 = new Nadpisanie();
        np1.pokazInformacje();
    }
}
