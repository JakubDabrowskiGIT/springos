package pl.kurs2.springos.model;

public class Person {
    private Long Id;
    private String name;
    private String surname;

    public Person(){}

    public Person(Long id, String name, String surname) {
        Id = id;
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    @Override
    public String toString() {
        return getName()+ " "+ getSurname();
    }
}
