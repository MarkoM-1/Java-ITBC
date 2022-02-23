package JavaOOP.odeljenje;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUcenik {
    public static void main(String[] args) {

        Ucenik marko = new Ucenik("Marko", "Markovic");
        ArrayList<Integer> oceneMarko = new ArrayList<>(Arrays.asList(4, 4, 4, 5, 3));
        marko.setNizOcena(oceneMarko);

        ArrayList<Integer> ocenePetar = new ArrayList<>(Arrays.asList(5, 3, 5, 2));
        Ucenik petar = new Ucenik("Petar", "Petrovic", ocenePetar);

        ArrayList<Integer> oceneIvan = new ArrayList<>(Arrays.asList(3, 2, 3, 1, 5));
        Ucenik ivan = new Ucenik("Ivan", "Ivanovnic", oceneIvan);

        Ucenik zoran = new Ucenik("Zoran", "Jovanovic");

        Odeljenje iv = new Odeljenje("IV2");

        iv.upisiUcenika(marko);
        iv.upisiUcenika(petar);
        iv.upisiUcenika(ivan);
        iv.upisiUcenika(zoran);

        System.out.println(iv);

        System.out.println("----------------");

        System.out.print(marko);
        System.out.print("Prosek ocena: ");
        System.out.println(iv.getDnevnik().get(iv.getDnevnik().indexOf(marko)).prosek());
        iv.opisnaOcena(marko);

        System.out.print(petar);
        System.out.print("Prosek ocena: ");
        System.out.println(petar.prosek());
        iv.opisnaOcena(petar);

        System.out.print(ivan);
        System.out.print("Prosek ocena: ");
        System.out.println(ivan.prosek());
        iv.opisnaOcena(ivan);

        iv.ispisiUcenika(ivan);

        System.out.println("----------------");
        System.out.println("Prosecna ocena odeljenja je: ");
        System.out.println(iv.prosecnaOcenaOdeljenja());

        System.out.println("----------------");

        ArrayList<Integer> zoranOcene = new ArrayList<>(Arrays.asList(5, 5));
        zoran.setNizOcena(zoranOcene);
        System.out.println(iv.izlistajDnevnik());

        System.out.println("Nova prosecna ocena odeljenja je: ");
        System.out.println(iv.prosecnaOcenaOdeljenja());

        System.out.print("Prema velicini ovo odeljenje je ");
        System.out.println(iv.velicinaOdeljenja());






/*        System.out.print(marko);

        System.out.println("Prosek ucenika je " + marko.prosek(x));*/

/*        v2.pogledajOcene(marko);
        v2.pogledajOcene(1);
        v2.prosecnaOcena(marko);
        v2.prosecnaOcena(1);
        v2.prosecnaOcenaOdeljenja(v2);*/

/*
        iV2.prosecnaOcenaOdeljenja(iV2);
        v2.prosecnaOcenaOdeljenja(v2);
*/
/*        v2.opisnaOcena(marko);*/
/*        System.out.println(v2.izlistajDnevnik());*/



/*       System.out.println(v2.velicinaOdeljenja());*/

/*        System.out.println(v2.prosecnaOcenaOdeljenja());*//*
        System.out.println(iV2.prosecnaOcenaOdeljenja());*/

/*        System.out.println(v2.izlistajDnevnik());*/
/*        System.out.println(iV2.izlistajDnevnik());*/

    }
}
