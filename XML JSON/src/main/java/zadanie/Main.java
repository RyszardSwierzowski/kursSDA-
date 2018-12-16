package zadanie;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean isAll = false;
        String imie, nazwisko;
        long pesel;
        String isNextPerson;
        People people = new People();
        Scanner scanner = new Scanner(System.in);
        List<Person> listaOsob = new ArrayList<Person>();

        while (isAll == false) {
            System.out.println("Podaj dane osoby");

            System.out.print("   imie : ");
            imie = scanner.nextLine();
            System.out.print("   nazwisko: ");
            nazwisko = scanner.nextLine();
            try {
                System.out.print("   pesel: ");
                pesel = scanner.nextLong();
                scanner.nextLine();
                listaOsob.add(new Person(imie, nazwisko, pesel));
            } catch (Exception e) {
                System.out.println("Pesel może zawierać tylko cyfry - nie dodano nowej osoby");
            } finally {
                System.out.println("Czy chcesz dodać nową osobę [ T / n ]  ? :");
                isNextPerson = scanner.nextLine();
                System.out.println(isNextPerson);
                if (!isNextPerson.toLowerCase().equals("t")) {
                    isAll = true;

                }


            }
        }

        people.setListOfPerson(listaOsob);

        ObjectMapper  objectMapper = new XmlMapper();
        objectMapper.writeValue(new FileOutputStream("zadanie.xml"), people);
    }
}
