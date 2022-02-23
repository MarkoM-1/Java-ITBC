package domaci.Java.Pastebin;

import java.util.Scanner;

/*
 * Napisati funkciju koja racuna prosecnu vrednost double[] niza.
 */

public class CetrdesetPrviZadatak {
    public static Scanner sc = new Scanner(System.in);

    public static double prosecnaVrednost(double[] x) {
        double vratiVrednost = 0;
        for (int i = 0; i < x.length; i++) {
            vratiVrednost += x[i];
        }
        vratiVrednost /= x.length;
        return vratiVrednost;
    }

    public static void main(String[] args) {
        System.out.print("Unesi velicinu niza: ");

        double[] niz = new double[sc.nextInt()];

        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesi " + (i + 1) + ". element niza: ");
            niz[i] = sc.nextDouble();
        }

        System.out.print("Prosecna vrednost niza je: " + prosecnaVrednost(niz));
    }
}
