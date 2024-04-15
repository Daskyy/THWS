package chapter15.person;

public abstract class Person {
    String fach;

    public Person(String fach) {
        this.fach = fach;
    }
    public abstract void gibTaetigkeitAus();
}
