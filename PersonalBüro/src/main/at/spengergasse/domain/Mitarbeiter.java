package at.spengergasse.domain;

import java.time.Year;

public abstract class Mitarbeiter {

    private String name;
    private char gesch;
    private Year gebJahr;
    private Year eintrittsJahr;

    public Mitarbeiter(String name, char gesch, Year gebJahr, Year eintrittsJahr) {
        setName(name);
        setGesch(gesch);
        setEintrittsJahr(eintrittsJahr);
        setGebJahr(gebJahr);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isBlank())
        {
            this.name = name;

        }
        else
        {
            System.out.println("Fehler:name kann nicht null sein");
        }

    }

    public char getGesch() {
        return gesch;
    }

    public void setGesch(char gesch) {
        if(gesch == 'f' || gesch == 'm' || gesch == 'd')
        {
            this.gesch = gesch;
        }
        else
        {
            System.out.println("Fehler: : ungültige geschlecht");
        }

    }

    public Year getGebJahr() {
        return gebJahr;
    }

    public void setGebJahr(Year gebJahr) {
        if(Year.now().getValue() - gebJahr.getValue() >= 14
                && Year.now().getValue() - gebJahr.getValue() <= 100) {
            this.gebJahr = gebJahr;
        }
    }

    public Year getEintrittsJahr() {
        return eintrittsJahr;
    }

    public void setEintrittsJahr(Year eintrittsJahr) {
        if(Year.now().getValue() >= eintrittsJahr.getValue())
        {
            this.eintrittsJahr = eintrittsJahr;
        }
        else
        {
            System.out.println("Fehler: ");
        }
    }

        public int berechneAlter()
        {
            return Year.now().getValue()-gebJahr.getValue();
        }

        public int berechneDienstAlter()
        {
            return Year.now().getValue() -eintrittsJahr.getValue();
        }


        public abstract double  berechneGehalt(); // als einzelne Objekt









    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", gesch=" + gesch +
                ", gebJahr=" + gebJahr +
                ", eintrittsJahr=" + eintrittsJahr ;
    }
}
