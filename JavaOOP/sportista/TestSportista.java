package JavaOOP.sportista;

public class TestSportista {
    public static void main(String[] args) {
        Sportista igrac1 = new Sportista("Petar Petrovic", "kosarkom", "kk Beograd", 00);
        Sportista igrac2 = new Sportista("Marko Markovic", "kosarkom", "kk Beograd", 10);
        Sportista igrac3 = new Sportista("Jovan Jovanovic", "kosarkom", "kk Beograd", 15);

        System.out.println(igrac1);
        System.out.println(igrac2);
        System.out.println(igrac3);

        igrac2.setKlub("kk Novi Sad");
        igrac3.setBrojNaDresu(55);

        System.out.println(igrac2);
        System.out.println(igrac3);
    }
}
