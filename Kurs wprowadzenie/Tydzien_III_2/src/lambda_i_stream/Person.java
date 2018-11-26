package lambda_i_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String surname;
    private int age;
    private float height;
    private  String comment;

    public Person(String name, String surname, int age, float height, String comment) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
//    static Set<Person> pobierzSetZMapy(Map s, String imie){
//        Set<Person> listaOsob = new HashSet<>();
//        listaOsob=s.get(imie);
//    }

    static boolean czyKazdyMaPonadDwaM(List<Person >s){
        int temp=(int)    s.stream().filter(x->x.getHeight()<200)
                .count();
        if(temp==0){ return true;}
        else {return false;}
    }


//    static Map ListToMap(List<Person> s){
//        Map<String, Person> temp = new HashMap<>();
//
//        s.stream().forEach(x->
//                {
//                    if(!temp.containsKey(x.getName()))
//                        {
//                            Set<Person> setOsob = new HashSet<>();
//                            setOsob.add(x);
//                            temp.put(x.getName(),x);
//                        }
//                    else
//                        {
//                            Set<Person> setOsob = new HashSet<>();
//                            setOsob=temp.get(x.getName());
//                        }
//                }
//        );



       // Set<Person> setOsob = new HashSet<>();



//            s.stream().forEach(x->
//                    {
//                        if(!temp.containsKey(x.getName()))
//                        {
//                            Set<Person> setOsob = new HashSet<>();
//                            setOsob.add(x);
//                        }
//                        else
//                        {
//                            Set<Person> setOsob = new HashSet<>();
//                            for(Person x: )
//                            setOsob = temp.get(x.getName());
//
//                        }
//                    }
//          );
//
//    }

    public static void main(String[] args) {
        List<Person> listaOsob = new ArrayList<>();
        listaOsob.add(new Person("Jacek","Glaz",23,186,""));
        listaOsob.add(new Person("Tomek","Kamyk",21,156,""));
        listaOsob.add(new Person("Patryk","Gasasasas",7,121,""));
        listaOsob.add(new Person("Cezary","Makowiec",56,209,""));
        listaOsob.add(new Person("Cezary","Kowalski",17,156,""));

        listaOsob.stream()
                .filter(x-> x.getAge()>20 ||x.height>175)
                .forEach(x-> System.out.println(x.getName()+" "+x.getSurname()));


        List<String> osobyPlusOsiemnascie =new ArrayList<>();
                  listaOsob.stream()
                                    .filter(x-> x.getAge()<18 )
                                    .forEach(x->osobyPlusOsiemnascie.add(x.getName() +" "+ x.getSurname()));
        if(osobyPlusOsiemnascie.stream()
                .filter(x-> x.contains("Kowalski")).count()>0){
            System.out.println("Jest osoba o nazwisku Kowalski");
        }else{
            System.out.println("Nie ma osoby o nazwisku Kowalski");
        }
        System.out.println("Czy każdy ma mniej jak 2m? : "+czyKazdyMaPonadDwaM(listaOsob));

    }
}
