package zadania;

public class Employee implements Comparable<Employee>{
    String name, surname, position;
    long id;

    public Employee(String name, String surname, String position, long id) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.id = id;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    @Override
    public int compareTo(Employee o) {

        return (int)(id-o.id);
    }
}
