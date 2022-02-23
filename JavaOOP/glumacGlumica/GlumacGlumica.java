package JavaOOP.glumacGlumica;
/*
 * Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
 * pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom) i da li je iz Srbije odgovorite preko booleana.
 * Sve potrebno za glumca i glumicu da budu dva ispisa
 */

public class GlumacGlumica {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean poreklo;

    public GlumacGlumica(String ime, String prezime, char pol, int godine, double ocena, boolean poreklo) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.poreklo = poreklo;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public boolean isPoreklo() {
        return poreklo;
    }

    public void setPoreklo(boolean poreklo) {
        this.poreklo = poreklo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append("\nPol: ");
        sb.append(pol);
        sb.append(" | godine: ");
        sb.append(godine);
        sb.append(" | ocena: ");
        sb.append(ocena);
        sb.append(" | poreklo: ");
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        if (poreklo == false) {
            sb.append(" nije poreklom iz Srbije.\n");
        }
        else {
            sb.append(" je poreklom iz Srbije.\n");
        }
        return sb.toString();
    }
}
