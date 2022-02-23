package JavaOOP.automobil;

/*
 * Vozilo  - Napisati klasu Automobill. Automobill ima
 * 1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
 * 2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
 * 3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
 * Automobill moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
 * Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
 * Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobill.
 */

public class Automobill {
    private String marka;
    private String model;
    private int sn;
    String vlasnik;

    public Automobill(String marka, String model, int sn, String vlasnik) {
        this.marka = marka;
        this.model = model;
        this.sn = sn;
        this.vlasnik = vlasnik;
    }

    public Automobill(String marka, String model, int sn) {
        this.marka = marka;
        this.model = model;
        this.sn = sn;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSn() {
        return sn;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String x) {
        this.vlasnik = x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (vlasnik != null) {
            sb.append(getVlasnik()).append(" vozi auto marke ").append(getMarka()).append(" ").append(getModel()).append(". ").append("Serijski broj: ").append(getSn());
        }
        else {
            sb.append(getMarka()).append(" ").append(getModel()).append(" nema vlasnika.").append(" Serijski broj: ").append(getSn());
        }
        return sb.toString();
    }
}
