import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        //zapisDoXml();
        //wczytajZPlikuXml();

        //zapiszDoJSON();
        //wczytajZPlikuJSON();

    }

    private static void wczytajZPlikuJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        People people = objectMapper.readValue(
                new FileInputStream("output.json"), // input
                People.class // przekonwertuj do People ( jej kostruktor zawiera liste<Person> )
        );
        System.out.println(people);
    }
    private static void zapiszDoJSON() throws IOException {
        Person firstPerson = new Person("Ania", 28);
        Person secondPerson = new Person("Bartek", 29);

        // ZAPIS DO JSON

        People people = new People(Arrays.asList(firstPerson, secondPerson));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileOutputStream("output.json"), people);
    }

    private static void wczytajZPlikuXml() throws IOException {
        ObjectMapper objectMapper = new XmlMapper();
        People people = objectMapper.readValue(
                new FileInputStream("output.xml"), // input
                People.class // przekonwertuj do People ( jej kostruktor zawiera liste<Person> )
        );
        System.out.println(people);
    }
    private static void zapisDoXml() throws IOException {
        Person firstPerson = new Person("Ania", 28);
        Person secondPerson = new Person("Bartek", 29);

        // ZAPIS DO XML

        People people = new People(Arrays.asList(firstPerson, secondPerson));

        ObjectMapper objectMapper = new XmlMapper();
        objectMapper.writeValue(new FileOutputStream("output.xml"), people);
    }
}
