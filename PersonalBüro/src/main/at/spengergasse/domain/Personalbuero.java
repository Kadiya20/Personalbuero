package at.spengergasse.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personalbuero {

    private List<Mitarbeiter> mitarbeiters;

    public Personalbuero(ArrayList<Mitarbeiter> mitarbeiters) {

        mitarbeiters = new ArrayList<>();
    }

    public double frauenQuote()
    {
        int anzFrauen = 0;
        for (Mitarbeiter mitarbeiter : mitarbeiters) {

            if(mitarbeiter.getGesch() == 'f')
            {
                anzFrauen++;
            }
        }
        if(mitarbeiters.isEmpty())
        {
            return 0;
        }
        else {
            return (anzFrauen / mitarbeiters.size()) * 100;
        }
    }

    public String aufnehmen(Mitarbeiter mitarbeiter)
    {
        //inn or ifn
        if(mitarbeiter != null)
        {
            if(mitarbeiter.getGesch() == 'f')
            {
                mitarbeiters.add(mitarbeiter);
                return "ok";
            }
            if(mitarbeiters.isEmpty() || frauenQuote() >= 40.0)
            {
                mitarbeiters.add(mitarbeiter);
                return "ok";
            }
            return  "quote";
        }
        else
        {
            System.out.println("mitarbeite is null");
            return null;
        }
    }

    public Mitarbeiter kuendigen(String name)
    {
        if (name != null) {

            Iterator<Mitarbeiter> iterator = mitarbeiters.iterator();
            while(iterator.hasNext())
            {
                Mitarbeiter mitarbeiter = iterator.next();
                if(mitarbeiter.getName().equals(name))
                {
                    iterator.remove();
                    System.out.println("mitarbeiter" + mitarbeiter + "wird gekündigt");
                    return mitarbeiter;
                }
            }
            System.out.println("kein mitarbeiter mit diesem namen gefunden");
            return null;


        }
        else
        {
            System.out.println("name ist null");
            return null;
        }
    }


}
