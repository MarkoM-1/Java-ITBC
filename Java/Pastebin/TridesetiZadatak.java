package Java.Pastebin;

import java.util.Scanner;

/* Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati proizvod elemenata tog niza.
 * Primer: [2, 4] -> 8
 * dodatak: Napisati funkciju koja racuna proizvod elemenata zadatog niza.
 */

public class TridesetiZadatak {

    public static int proizvodElemenata(int[] x) {
        int proizvod = 1;
        for (int i = 0; i < x.length; i++) {
            proizvod *= x[i];
        }
        return proizvod;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi velicinu niza: ");
        int n = sc.nextInt();
        System.out.println("--------------------");

        int[] niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesi " + (i + 1) + " element niza: ");
            niz[i] = sc.nextInt();
        }
        System.out.println(proizvodElemenata(niz));
    }
}
