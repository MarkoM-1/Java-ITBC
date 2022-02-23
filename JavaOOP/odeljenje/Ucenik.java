package JavaOOP.odeljenje;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> nizOcena;

    public Ucenik(String ime, String prezime, ArrayList<Integer> nizOcena) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = nizOcena;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Integer> getNizOcena() {
        return nizOcena;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setNizOcena(ArrayList<Integer> nizOcena) {
        this.nizOcena = nizOcena;
    }

    public void dodajUcenikaUNiz(Integer x) {
        nizOcena.add(x);
    }

    public String imePrezime(){
        return ime + " " + prezime;
    }

    public double prosek() {
        double zbirOcena = 0;

        if(nizOcena.isEmpty()){
            return 0;
        }

        for(int ocena : nizOcena){
            if(ocena == 1){
                return 1;
            }
            zbirOcena += ocena;
        }
        return zbirOcena / nizOcena.size();
    }

    public String ocene() {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for (int ocena : getNizOcena()){
            sb.append(ocena);
            x++;
            if(x != nizOcena.size()){
                sb.append(", ");
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int ukupanBrOcena = 0;

        if (nizOcena.isEmpty()){
            sb.append(imePrezime()).append(" nema ni jednu ocenu.");
        }
        else {
            sb.append(imePrezime()).append(" ima ocene: \n");

            for (Integer x : nizOcena) {
                sb.append(x);
                ukupanBrOcena++;

                if (ukupanBrOcena != nizOcena.size()) {
                    sb.append(", ");
                }
            }
        }
        sb.append("\n");
        return sb.toString();
    }

}


