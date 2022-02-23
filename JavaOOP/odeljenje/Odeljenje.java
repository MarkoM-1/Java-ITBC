package JavaOOP.odeljenje;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>(0);
    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int redniBroj) {
        dnevnik.remove(redniBroj);
    }

    public void pogledajOcene(Ucenik u) {
        System.out.print(u.ocene());
    }

    public void pogledajOcene(int redniBroj) {
        System.out.println(dnevnik.get(redniBroj).ocene());
    }

    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosek());
    }

    public void prosecnaOcena(int x) {
        System.out.println(dnevnik.get(x).prosek());
    }

    public double prosecnaOcenaOdeljenja() {
        double zbirOcena = 0;
        int velicinaOdeljenja = dnevnik.size();

        for (Ucenik u : dnevnik){
            zbirOcena += u.prosek();

            if (u.prosek() == 0){
                velicinaOdeljenja--;
            }
        }
        return zbirOcena / velicinaOdeljenja;
    }

    public void opisnaOcena(Ucenik u) {
        double prosek = u.prosek();

        if (prosek == 1) {
            System.out.println("Nedovoljan \n");
        }
        else if (prosek >= 4.5) {
            System.out.println("Odlican \n");
        }
        else if (prosek >= 3.5) {
            System.out.println("Vrlo dobar \n");
        }
        else if (prosek >= 2.5) {
            System.out.println("Dobar \n");
        }
        else {
            System.out.println("Dovoljan \n");
        }
    }

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik u : dnevnik){
            sb.append(u.toString());
        }
        return sb.toString();
    }

    public String velicinaOdeljenja() {
        if (dnevnik.size() > 25) {
            return "veliko odeljenje";
        }
        else if (dnevnik.size() >= 15) {
            return "srednje odeljenje";
        } else {
            return "malo odeljenje";
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenje ima djake: \n");
        for (Ucenik u : dnevnik) {
            sb.append(u.imePrezime());
            sb.append("\n");
        }
        return sb.toString();
    }

}
