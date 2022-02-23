package Java.Pastebin;

import java.util.Scanner;

/*
 * Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
 * Primer: [1, 2, 3, 4, 5] -> 1 3 5
 * dodatak: Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
 */

public class DvadesetSedmiZadatak {

    public static void ispisNiza(int[] niz) {
        for (int i = 0; i < niz.length; i += 2) {
            System.out.println(niz[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi velicinu niza: ");
        int n = sc.nextInt();
        System.out.println("--------------------");

        int[] nizBrojeva = new int[n];

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.print("Unesi " + (i + 1) + " element niza: ");
            nizBrojeva[i] = sc.nextInt();
        }
        ispisNiza(nizBrojeva);
    }
}
