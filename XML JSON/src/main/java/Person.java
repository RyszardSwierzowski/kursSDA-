
public class Person
{

    private String imie;
    private int age;

    public Person() {
    }

    public Person(String imie, int age) {
        this.imie = imie;
        this.age = age;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", age=" + age +
                '}';
    }
}
