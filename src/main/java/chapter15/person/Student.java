package chapter15.person;

public class Student extends Person{
    public Student(String fach) {
        super(fach);
    }
    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Student besucht das Fach " + fach);
    }
}
