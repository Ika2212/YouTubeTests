package StudentTest;

public class StudentTest {

    void  getIme() {
        Student s = new Student(ime: "Ime studenta", prezime: "Prezime studenta",
                brojindeksa"2014500100");

        Assertions.assertEguals(expected: "Ime studenta", s.getIme());
}
