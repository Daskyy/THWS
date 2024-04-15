package chapter15.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerson {

    // Fach richtig gesetzt?
    @Test
    public void testStudentFach() {
        Student student = new Student("Programmieren");
        assertEquals("Programmieren", student.fach);
    }

    @Test
    public void testProfessorFach() {
        Professor professor = new Professor("Programmieren");
        assertEquals("Programmieren", professor.fach);
    }

    // Ableitung von abstrakter Klasse funktionieren?
    /*@Test
    public void testStudent() {
        Person personen[] = new Person[1];
        personen[0] = new Student("Programmieren");
        personen[0].gibTaetigkeitAus();
    }

    @Test
    public void testProfessor() {
        Person personen[] = new Person[1];
        personen[0] = new Professor("Programmieren");

        personen[0].gibTaetigkeitAus();
    }

    @Test
    public void testBeide() {
        Person personen[] = new Person[2];
        personen[0] = new Student("Programmieren");
        personen[1] = new Professor("Programmieren");

        personen[0].gibTaetigkeitAus();
        personen[1].gibTaetigkeitAus();
    }*/
}
