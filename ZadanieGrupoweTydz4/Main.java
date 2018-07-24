package Obiekty.ZadanieGrupoweTydz4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pracownik> listaPracownikow = new ArrayList<>();
        odpal(listaPracownikow);

       /* Pielegniarka p = new Pielegniarka(1500, 60, "Kasia","kowalska");
        p.setNadgodziny(50);
        p.wyplac();*/
    }

    public static void odpal(ArrayList<Pracownik> listaPracownikow) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" (Wpisz_1) Dodaj Pielegniarke \n (Wpisz_2) Usuń Pielegniarke \n (Wpisz_3) Dodaj Ochroniarza: \n (Wpisz_4) Usuń ochroniarza \n (Wpisz_5) Wyswietl Wszystkich pracowników \n " +
                    "(Wpisz_6) Modyfikuj Pracownika \n (Wpisz_7) Wyswietl sume wypłat pracowników \n (Wpisz_8) Wyswietl sume nadgodzin pracowników");
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    System.out.print("Podaj imie Pielegniarki: ");
                    String imiePielegniarki = scanner.next();
                    System.out.print("Podaj nazwisko Pielegniarki: ");
                    String nazwiskoPielegniarki = scanner.next();
                    System.out.print("Podaj liczbe nadgodzin: ");
                    int liczba_nadgodzin_Pielegniarki = scanner.nextInt();
                    listaPracownikow.add(new Pielegniarka(1500,liczba_nadgodzin_Pielegniarki, imiePielegniarki, nazwiskoPielegniarki));
                    break;

                case 2:
                    System.out.print("Podaj imie Pielegniarki: ");
                    String imiePielRemove = scanner.next();
                    System.out.print("Podaj nazwisko Pielegniarki: ");
                    String nazwiskoPielRemove = scanner.next();

                    List<Pracownik> listaPomocniczaPielegniarka = listaPracownikow.stream()
                            .filter(e -> e.getImie().equals(imiePielRemove))
                            .filter(e -> e.getNazwisko().equals(nazwiskoPielRemove))
                            .collect(Collectors.toList());
                    for (Pracownik p : listaPomocniczaPielegniarka) {
                        listaPracownikow.remove(p);
                    }
                    break;

                case 3:
                    System.out.print("Podaj imie Ochroniarza: ");
                    String imieOchroniarza = scanner.next();
                    System.out.print("Podaj Nazwisko Ochroniarze: ");
                    String nazwiskoOchroniarza = scanner.next();
                    System.out.print("Podaj liczbe uchybień Ochroniarza");
                    int liczbaUchybienOchroniarza = scanner.nextInt();
                    listaPracownikow.add(new Ochroniarz(1500,liczbaUchybienOchroniarza, imieOchroniarza, nazwiskoOchroniarza));
                    break;

                case 4:
                    System.out.print("Podaj imie Ochroniarza: ");
                    String imieOchroniarzaRemove = scanner.next();
                    System.out.print("Podaj nazwisko Ochroniarza: ");
                    String nazwiskoOchroniarzaRemove = scanner.next();

                    List<Pracownik> listaPomocniczaOchrona = listaPracownikow.stream()
                            .filter(e -> e.getImie().equalsIgnoreCase(imieOchroniarzaRemove))
                            .filter(e -> e.getNazwisko().equalsIgnoreCase(nazwiskoOchroniarzaRemove))
                            .collect(Collectors.toList());

                    for (Pracownik p : listaPomocniczaOchrona) {
                        listaPracownikow.remove(p);
                    }
                    break;

                case 5:
                    for (Pracownik p : listaPracownikow) {
                        System.out.println("ID pracownika: " + listaPracownikow.indexOf(p) + "_ " + p);
                    }
                    break;

                case 6:
                    System.out.print("Podaj ID pracownika którego chcesz modyfikować: \n Jesli chcesz wyjsc do menu głónego napisz wpisz 'exit'\n");
                    String toChange = scanner.next();

                    if (toChange.equals("exit")) break;

                    int IDnumber = Integer.parseInt(toChange);
                    System.out.println("Wybrałeś pracownika " + listaPracownikow.get(IDnumber));

                    System.out.print("Podaj co chcesz zrobić: \n (Wybierz_1) Zmień imie Pielegniarki \n (Wybierz_2) Zmień nazwisko Pielęgniarki \n (Wybierz_3) Zmień imie Ochroniarza \n (Wybierz_4) Zmień nazwisko Ochroniarza");

                    int wybranyNumer = scanner.nextInt();

                    switch (wybranyNumer) {
                        case 1:
                            System.out.print("Podaj imie Pielegniarki ");
                            String imiePielNowe = scanner.next();
                            listaPracownikow.get(IDnumber).setImie(imiePielNowe);
                            break;

                        case 2:
                            System.out.print("Podaj nazwisko Pielegniarki ");
                            String nazwiskoPielNowe = scanner.next();
                            listaPracownikow.get(IDnumber).setNazwisko(nazwiskoPielNowe);
                            break;

                        case 3:
                            System.out.println("Podaj imie Ochroniarza ");
                            String imieOchrNowe = scanner.next();
                            listaPracownikow.get(IDnumber).setImie(imieOchrNowe);
                            break;

                        case 4:
                            System.out.print("Podaj nazwisko Ochroniarza ");
                            String nazwiskoOchronNowe = scanner.next();
                            listaPracownikow.get(IDnumber).setNazwisko(nazwiskoOchronNowe);
                            break;
                        default :
                            System.out.println("ŹLE WYBRANY NUMER W PETLI SRODKOWEJ");
                    }
///////////////////////////////////////////////////////////////////////////////////////////
                case 7:


                default:
                    System.out.println("Podałeś zły zakres");


            }
        }
/////////////////////////////////////////////////
    }
/////////////////////////////////////////////////
}
