/*
package JavaOOP.odeljenje;


import java.util.ArrayList;

public class OdeljenjeSaKomentarima {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public OdeljenjeSaKomentarima(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public OdeljenjeSaKomentarima(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>(0);
    }
    public String getOznaka(){
        return oznaka;
    }
    public ArrayList<Ucenik> getDnevnik(){
        return dnevnik;
    }

    public void setOznaka(String oznaka){
        this.oznaka = oznaka;
    }
    public void setDnevnik(ArrayList<Ucenik> dnevnik){
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik x){
        dnevnik.add(x);
    }
    public void upisiUcenika(Ucenik x, int redniBroj){
        dnevnik.add(redniBroj, x);
    }
    public void ipisiUcenika(Ucenik x){
        dnevnik.add(x);
    }
    public void ipisiUcenika(int redniBroj){
        dnevnik.remove(redniBroj);
    }

    public void pogledajOcene(Ucenik u){
*/
/*        for(ArrayList<Double> y: x.getNizOcena()){   <--------- kako ovo nije niz nego trazi double*//*

        System.out.print("Ocene " + u.getIme() + " " + u.getPrezime() + ": ");
        int z = 0;
        for(double y: u.getNizOcena()){
            System.out.print(y);
            z++;
            if(z != u.getNizOcena().size()) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    public void pogledajOcene(int x){
        int z = 0;
        Ucenik ucenik = dnevnik.get(x);
        ArrayList<Double> oceneUcenika = ucenik.getNizOcena(); // moze i samo get.nizocena dole u petlji, umesto da se pravi ova varijabla
        System.out.print(ucenik.getIme() + " " + ucenik.getPrezime() + ", ocene: \n");
        for(double y: oceneUcenika){
            System.out.print(y);
            z++;
            if(z != oceneUcenika.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }
    public void prosecnaOcena(Ucenik u){
        double prosek = 0;
        for(double ocene: u.getNizOcena()){
            prosek = prosek + ocene;
        }
        prosek = prosek / u.getNizOcena().size();
        System.out.print(u.getIme() + " " + u.getPrezime() + ", prosek ocena: " + prosek + "\n");
    }
    public double prosecnaOcenaNijeVoid(Ucenik u){
        double prosek = 0;
        for(double ocene: u.getNizOcena()){
            prosek = prosek + ocene;
        }
        prosek = prosek / u.getNizOcena().size();

        return prosek;
    }
    public void prosecnaOcena(int x){
        double prosek = 0;
        Ucenik uc = dnevnik.get(x);
        for(double y : uc.getNizOcena()){
            prosek = prosek + y;
        }
        prosek = prosek / uc.getNizOcena().size();
        System.out.print(uc.getIme() + " " + uc.getPrezime() + ", " + x + ". po redu u dnevniku. Prosek ocena: " + prosek + "\n");
    }
    public void prosecnaOcenaOdeljenja(OdeljenjeSaKomentarima x){
*/
/*        double prosek = 0; <---------- ako se ovde deklarise prosek 0 onda svaki put
                                         kad prolazi kroz petlju ne restartuje prosek na 0 sto znaci da kada dobije prosek prvog djaka
                                         nece racunati dobro prosek ostalih djaka u dnevniku
                                         *//*

        double prosekOdeljenja = 0;
        // mora u if else kako bi ispisao poruku ukoliko u odeljenju nema ucenika
        if (x.getDnevnik().isEmpty()){
            System.out.print("U odeljenju nema ucenika.\n");
        }
        else{
            // za svakog ucenika u dnevniku

            for(Ucenik uc: x.getDnevnik()){
                double prosek = 0; // prosek mora da se resetuje kod svakog ucenika
                //uzmi njegove ocene
                //saberi sve ocene
                for(double ocena: uc.getNizOcena()){
                    prosek = prosek + ocena;
                }
                //izracunaj prosek ocena tako sto ces zbir ocena podeliti sa brojem ocena odnosno velicinom niza ocena
                prosek = prosek / uc.getNizOcena().size();
                //prosek odeljenja izracunaj tako sto ces sabrati prosek svakog ucenika i podeliti sa ukupnim brojem ucenika u dnevniku
                prosekOdeljenja = prosekOdeljenja + prosek;
            }
            prosekOdeljenja = prosekOdeljenja / x.getDnevnik().size();
            System.out.println("Prosek odeljenja " + x.getOznaka() + " je: " + prosekOdeljenja );
        }
    }

    public void opisnaOcena(Ucenik u){
        boolean imaJedinicu = false;
        for(double y: u.getNizOcena()){
            if (y == 1){
                imaJedinicu = true;
                break;
            }
        }
        if(imaJedinicu){
            System.out.println("Nedovoljan");
        }
        else if(prosecnaOcenaNijeVoid(u) >= 4.5){
            System.out.println("Odlican");
        }
        else if(prosecnaOcenaNijeVoid(u) >= 3.5){
            System.out.println("Vrlo dobar");
        }
        else if(prosecnaOcenaNijeVoid(u) >= 2.5){
            System.out.println("Dobar");
        }
        else if(prosecnaOcenaNijeVoid(u) >= 1.5){
            System.out.println("Dovoljan");
        }
    }
    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();

        for(Ucenik uc: getDnevnik()){
            int z = 0;
            sb.append(uc.getIme());
            sb.append(" ");
            sb.append(uc.getPrezime());
            sb.append(" ima ocene: ");
            sb.append("\n");
            for(double ocene: uc.getNizOcena()){
                sb.append(ocene);
                z++;
                if(z != uc.getNizOcena().size()) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
            }
        return sb.toString();
    }

*/
/*    public velicinaOdeljenja(){

    }*//*




*/
/*    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getOznaka());
        sb.append(" odeljenje ima djake: \n");
        for(Ucenik uc: getDnevnik()){
            sb.append(uc.getIme());
            sb.append(" ");
            sb.append(uc.getPrezime());
            sb.append("\n");
        }
        return sb.toString();
    }*//*


}
*/
