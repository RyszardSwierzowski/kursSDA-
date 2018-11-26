package zadania.sortowanie.zadaniaStr12;

import java.util.Objects;

public class Osoba implements Comparable<Osoba>{
    String  name,
            surname;
    Integer age;

    public Osoba(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public int compareTo(Osoba o) {

        return this.age-o.age;
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Osoba)o)==0;
    }


}
