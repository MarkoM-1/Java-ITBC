package JavaOOP.automobil;


public class Voznja {
    public static void main(String[] args) {

        Automobill auto1 = new Automobill("Fiat", "Panda", 11683845, "Pera");
        Automobill auto2 = new Automobill("Zastava", "Yugo 55", 16883383);

        System.out.println(auto1);
        System.out.println(auto2);

        auto2.setVlasnik("Pera");
        System.out.println("Novi vlasnik automobila marke " + auto2.getMarka() + " " + auto2.getModel() + " je " + auto2.getVlasnik() + ".");
    }
}
