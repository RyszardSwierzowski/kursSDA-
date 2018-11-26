package lambda_i_stream.Optional;

import lambda_i_stream.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Optionale {

    public static void czyMaTekst_ab(List<String>str){

            str.stream()
                .filter(s->s.length()>=2)
                .filter(s->s.substring(0,2).equals("ab"))
                .findAny().ifPresent(s-> System.out.println(s));
    }
    public static void najstarszaMK(List <Person> osoby){

            Person p=osoby.stream()
                .filter(byFirstCharInName("M"))
                .filter(byFirstCharInSurname("K"))
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .findFirst().orElse(null);








    }

    private static Predicate<Person> byFirstCharInSurname(String firstChar) {
        return s-> s.getSurname().substring(0,1).equals(firstChar);
    }private static Predicate<Person> byFirstCharInName(String firstChar) {
        return s-> s.getSurname().substring(0,1).equals(firstChar);
    }

    public static void main(String[] args) {

        List<String> listaString = Arrays.asList("abc", "def","AsasaA","dadgasgaga","125345","d5569");
        List<Person> listaOsob = new ArrayList<>();
        listaOsob.add(new Person("Jacek","Glaz",23,186,""));
        listaOsob.add(new Person("Tomek","Kamyk",21,156,""));
        listaOsob.add(new Person("Patryk","Gasasasas",7,121,""));
        listaOsob.add(new Person("Cezary","Makowiec",56,209,""));
        listaOsob.add(new Person("Cezary","Kowalski",17,156,""));
        listaOsob.add(new Person("Marek","Kowalski",17,156,""));

//        String str = listaString.stream()
//                                .filter(s->s.length()==5)
//                                .findAny()   // pobiera dowolny elememnt
//                                .orElse("Brak"); // jeśli nie ma elementu spełniającego kryteria filtu elementu to przyjmij wartość ....
//        System.out.println(str);

        czyMaTekst_ab(listaString);

    }
}
