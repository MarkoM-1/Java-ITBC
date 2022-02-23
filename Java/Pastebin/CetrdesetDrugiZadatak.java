package domaci.Java.Pastebin;

import java.util.Scanner;

/*
 * Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
 */

public class CetrdesetDrugiZadatak {

    public static boolean provera(String[] niz) {
        boolean postoji = false;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equals("Marija") || niz[i].equals("Petar")) {
                postoji = true;
                break;
            }
        }
        return postoji;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Koliko imena ima niz: ");
        String[] nizImena = new String[sc.nextInt()];

        for (int i = 0; i < nizImena.length; i++) {
            System.out.print("Unesi " + (i + 1) + ". ime u nizu: ");
            nizImena[i] = sc.next();
        }

        if (provera(nizImena)) {
            System.out.print("U nizu postoji Marija i/ili Petar");
        }
        else {
            System.out.print("U nizu ne postoji ni Marija ni Petar");
        }
    }
}
