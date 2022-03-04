package at.spengergasse.domain;

import java.time.Year;

public class Angestellter extends Mitarbeiter{

    public Angestellter(String name, char gesch, Year gebJahr, Year eintrittsJahr) {
        super(name, gesch, gebJahr, eintrittsJahr);
    }

    @Override
    public double berechneGehalt() {

        //Year.now()
        return 1500 + 50 * ( Year.now().getValue() - getEintrittsJahr().getValue());
    }

    @Override
    public String toString() {

        return super.toString() + " ,gehalt: " + berechneGehalt();

    }
}
