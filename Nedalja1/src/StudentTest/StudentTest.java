package StudentTest;

import jdk.incubator.vector.VectorOperators;

class StudentTest {
    VectorOperators.Test
    void  getIme() {
        Student s = new StudentTest( "Ime studenta", "Prezime studenta", "2014500100");

        Assertions.assertEguals("Ime studenta", s.getIme());
    }
    VectorOperators.Test
    void  getPrezime() {
        Student s = new StudentTest( "Ime studenta",  "Prezime studenta", "2014500100");

        Assertions.assertEguals("Prezime studenta", s.getPrezime());
    }
    VectorOperators.Test
    void  getBrojIndeksa() {
        Student s = new StudentTest( "Ime studenta",  "Prezime studenta", "2014500100");

        Assertions.assertEguals("2014500100", s.getBrojIndeksa());

    }
    VectorOperators.Test
    void  getBrojPoenaZaPredmet() {
        Student s = new Student( "Ime studenta",  "Prezime studenta", "2014500100");

        VectorOperators.Test



