//package zadania.sortowanie.zadaniaStr12;
//
///*
//    1   Stwórz klasę Osoba posiadającą pola name, surname, age.
//        Wypełnij tablice obiektami klasy Osoba.
//        Napisz metodę wyszukującą osobę w danym wieku zaimplementowanymi algorytmami (każda osoba powinna być w innym wieku).
//        Wypisz indeks oraz osobę. Który algorytm zostanie użyty gdy dane wejściowe są posortowane, a który gdy nie są?
//    2   Napisz metodę do znajdowania indeksu osoby w tablicy gdy kilka osób jest w tym samym wieku.
//        Który algorytm zostanie użyty?
//*/
//
//import zadania.sortowanie.SearchAlgorithm;
//import zadania.sortowanie.WyszukiwanieLiniowe;
//
//import java.util.List;
//
//public class Zadania
//{
//    private static Osoba zad1ZnajdzOsobeWWieku(Osoba[] tabO,int szukanyWiek){
//
//        SearchAlgorithm<Osoba> sA = new WyszukiwanieLiniowe<>();
////        if(sA.search(szukanyWiek, tabO)<0){
////            System.out.println("Brak osoby");
////        }
////        return tabO[sA.search(szukanyWiek, tabO)];
//        System.out.println(sA.search(szukanyWiek, tabO));
//        return null;
//
//
//    }
//
//    public static void main(String[] args) {
//        Osoba[] tabOsob = {
//                                new Osoba("Tomek","Nowak",   21),
//                                new Osoba("Radek","Kowalski",33),
//                                new Osoba("Ola",  "Nowak",   45),
//                                new Osoba("Paweł","Norek",   22),
//                                new Osoba("Kinga","Nowak",   18),
//                                new Osoba("Ela",  "As",      17),
//                                new Osoba("Jan",  "Nowak",   92),
//                                new Osoba("Iza",  "Kowalska",49)
//                          };
//
//        System.out.println(zad1ZnajdzOsobeWWieku(tabOsob,92));
//        System.out.println(zad1ZnajdzOsobeWWieku(tabOsob,11));
//    }
//}
