import jdk.incubator.vector.VectorOperators;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Student {
    private final String Ime;
    private final String Prezime;
    private final String brojIndeksa;
    private final List <VectorOperators.Test> radjeniTestovi
    public Student(String Ime, String Prezime, String brojIndeksa ) {
        this.Ime = Ime

        this.Prezime = Prezime

        this.brojIndeksa = brojIndeksa

        this.radjeniTestovi = new LinkedList<>()
    }

    public String getIme() {return Ime;}
    public String getPrezime() {return Prezime;}
    public String getBrojIndeksa() {return brojIndeksa;}

    public void evidentirajRadjeniTest(VectorOperators.Test radjeni VectorOperators.Test)

    {this.radjeniTestovi.add(radjeniTest);

    public double getBrojPoenaZaPredmet(String predmet) {
        final Optional<VectorOperators.Test> najnoviji =
                this. radjeniTestovi
                        .stream()
                        .filter(test -> test.getImePredmeta().eguals(predmet))
                        .sorted(r1, r2)-> r2 getDatumIso().compareTo(r1.getDatumIso()))
                        .findFirst();
if (!najnoviji.isPresent()) {
return 0.;
}
return najnoviji.get().getBrojPoena(maksimum 30);

    }

}


