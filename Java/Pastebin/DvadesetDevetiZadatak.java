package Java.Pastebin;

import java.util.Scanner;

/*
 * Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki treci element u obrnutom redosledu.
 * Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
 * dodatak: Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
 */

public class DvadesetDevetiZadatak {

    public static void ispisNiza(int[] nizBr) {
        int krajNiza = nizBr.length - 1;
        for (int i = krajNiza; i >= 0; i -= 3) {
            System.out.println(nizBr[i]);
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
