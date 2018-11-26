package zadania;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/*
   1 Napisz program który będzie odczytywał dane z wejścia (Scanner) w formacie <imie> <nazwa_działu>, a po wpisaniu “list” wypisze osoby pogrupowane w działy, np.:
    “Kadry”: [“Bob”, “Mike”, “Pluto”]
    “Wdrożenie”: [“Janusz”, “Maria”, “Chris”]
   2 Napisz program który będzie wczytywał plik tekstowy w którym będą zawarte informacje w formacie:
    <imie>;<nazwisko>;<stanowisko>;<unikatowe_id>;
    <imie>;<nazwisko>;<stanowisko>;<unikatowe_id>;...
    Każda linia reprezentuje obiekt Employee który posiada 4 pola: name: String, surname: String, position: String, id: Long.
     Posortuj kolekcję rosnąco według id i zapisz do pliku result.txt.
    https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#lines-java.nio.file.Path-
    https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#write-java.nio.file.Path-java.lang.Iterable-java.nio.file.OpenOption...-
    https://docs.oracle.com/javase/7/docs/api/java/nio/file/Paths.html#get(java.lang.String,%20java.lang.String...)
   3 *Stwórz mapę <imię: String> : <stanKonta: Long>.
   Przefiltruj kolekcję tak aby zawierała osoby tylko z literą “k” lub “g” i stanem konta powyżej 10000. Następnie posortuj kolekcję malejąco według stanu konta.

 */
public class ZadaniaStr4 {
// Z A D A N I E    1
    private static void zad1() {
        Scanner scanner = new Scanner(System.in);
        String in = "";
        String imie;
        String dzial;
        Map<String, ArrayList<String>> mapaPracownikow = new HashMap<>();
        //List<String> listaPracownikow = new ArrayList<>();


        while (!in.equals("list")) {
            System.out.print("podaj imie: ");
            in = scanner.nextLine();
            if(!in.equals("list")){
                imie = in;
                System.out.print("podaj nazwe dzialu: ");
                in = scanner.nextLine();
                dzial = in;

                if (mapaPracownikow.containsKey(dzial)) {
                    ArrayList<String> listaPracownikow = mapaPracownikow.get(dzial);
                    listaPracownikow.add(imie);
                    mapaPracownikow.put(dzial, listaPracownikow);
                } else
                {
                    ArrayList<String> listaPracownikow = new ArrayList<>();
                    listaPracownikow.add(imie);
                    mapaPracownikow.put(dzial, listaPracownikow);
                }
            }
        }
        mapaPracownikow.entrySet().stream()
                .forEach(k -> {
                    System.out.println("dział "+k.getKey());
                    k.getValue().stream()
                            .forEach(v-> System.out.print(v+" "));
                });

    }
// Z A D A N I E    2
    private static void zad2(){
        FileReader r = null;
        String linia = "";
        String name,surname,poition;
        long id;
        List<Employee> listaPrac = new ArrayList<>();
        String[] listaStr = null;




        try{
            r = new FileReader("tekst.txt");
        }catch (FileNotFoundException e){
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }
        BufferedReader bfr = new BufferedReader(r);
        try {
            while((linia = bfr.readLine()) != null){
                //System.out.println(linia);
                linia=linia.replaceAll("<","");
                linia=linia.replaceAll(">","");
                //linia.replace("<","");
                listaStr=linia.split(";");
                //System.out.println(listaStr[0]+listaStr[1]+listaStr[2]+listaStr[3]);
                listaPrac.add(new Employee(listaStr[0],listaStr[1],listaStr[2], Long.parseLong(listaStr[3])));
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        // ZAMYKANIE PLIKU
        try {
            r.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }




        Path path = Paths.get("result.txt");

    //Use try-with-resource to get auto-closeable writer instance
        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            listaPrac.stream()
                    .sorted()
            .forEach(e-> {
                try {
                    writer.write(e.name+";"+e.surname+";"+e.position+";"+e.id+"\n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// Z A D A N I E    3
private static void zad3(){
        Map<String,Long> m = new HashMap<>();
        m.put("akar",5L);
    m.put("aag",11111111L);
        m.put("fgaga",1000000L);
        m.put("adam",465486468468L);
        m.put("gadam2",465486468468L);
        m.put("akuba",5400000000000000L);
        m.entrySet().stream()
                .filter(e->
                    (e.getKey().contains("k") || e.getKey().contains("g")) && e.getValue()>10000
                )
                .sorted(Map.Entry.comparingByValue((o1, o2) ->{
                    if(o1>o2)return -1;
                    else if(o1<o2)return 1;
                    else return 0;
                } ))
                .forEach(System.out::println);
}


    public static void main(String[] args) {
        //zad1();
        //zad2();
        zad3();

    }
}