package at.spengergasse.domain;

import java.time.Year;

public class Freelancer extends Mitarbeiter{


    public Freelancer(String name, char gesch, Year gebJahr, Year eintrittsJahr) {
        super(name, gesch, gebJahr, eintrittsJahr);
    }

    @Override
    public double berechneGehalt() {
        return 0;
    }

    @Override
    public String toString() {
        return "Freelancer{}";
    }
}
