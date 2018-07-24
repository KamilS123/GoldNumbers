package Obiekty.ZarzadzaniePracownikami;

public class Pracownik {
   String imie;
   String nazwisko;
   int placa;
   char plec;
   int dzial;

   Pracownik(String imie, String nazwisko, int placa, char plec, int dzial) {
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.placa = placa;
       this.plec = plec;
       this.dzial = dzial;
   }
}
/*Zad. 1. Napisać program do zarządzania danymi pracowników. W tym celu należy utworzyć klasę
Pracownik z następującymi polami:
imię – typu String;
nazwisko – typu String;
placa – typu int;
plec – typu char;
dzial – typu int;
1. Klasę tą wyposażyć w konstruktor, którego parametry umożliwią przypisanie wartości
wszystkim polom klasy.
2. W klasie Pracownik stworzyć statyczną funkcję wczytajZPlikuTekstowego, której zadaniem
jest odczytanie danych pracowników zapisanych w pliku tekstowym i utworzenie dla nich
obiektów klasy Pracownik. Dane zapisane są w formacie:
Imię Nazwisko Płaca Płeć Nr działu
Przykład
Jan Kowalski 2010 M 3
Agnieszka Cuber 2900 K 3
Adam Nowak 1100 M 4
Sylwia Zych 2100 K 3
Beata Dudek 1900 K 4
Metoda wczytajZPlikuTekstowego przyjmuje 2 parametry:
– nazwę pliku tekstowego z danymi pracowników,
– tablicę do przechowywania wczytanych obiektów klasy Pracownik (maks. 100
elementów)
Wynikiem metody powinna być liczba odczytanych danych (int)
3. Napisać metodę statyczną o nazwie srednieZarobki, której parametrem jest tablica
pracowników, numer działu oraz płeć, a wynikiem średnia płaca osób pracujących w dziale
o podanym numerze oraz o podanej płci
Przykładowo wynikiem metody srednieZarobki dla kobiet z działu 3 w podanym
przykładzie powinna być wartość 2500.
4. Napisać statyczną metodę zapiszDoPliku, której zadaniem będzie zapisanie obiektów
(serializacja) typu pracownik do pliku o nazwie podanej jako pierwszy parametr. Drugim
parametrem jest tablica obiektów typu Pracownik, które powinny zapisane do pliku.
5. Napisać statyczną metodę odczytZPliku, której zadaniem będzie wczytanie tablicy
obiektów z pliku (zapisanych metodą zapiszDoPliku).*/