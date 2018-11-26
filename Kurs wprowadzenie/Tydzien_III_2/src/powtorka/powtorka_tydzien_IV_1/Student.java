package powtorka.powtorka_tydzien_IV_1;

public class Student extends  Osoba implements Nauka
{
    private String rokStudiow;

    public Student(String imie, String nazwisko,String rokStudiow) {
        super(imie,nazwisko);
        this.rokStudiow = rokStudiow;
    }
    public void wyswietlInfo(){
        System.out.println(imie+" "+nazwisko+" rok studiow: "+rokStudiow);
    }
    @Override    public void czytaj(String nazwaKsiazki) {
        System.out.println("czytam szybko : "+'"'+nazwaKsiazki+'"');
    }


    public static void main(String... s){
        Student s1 = new Student("Jan","Ziemniak","1");
        //s1.wyswietlInfo();
        s1.czytaj("XYZ");
    }


}
