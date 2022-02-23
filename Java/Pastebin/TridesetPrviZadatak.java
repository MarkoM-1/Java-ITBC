package Java.Pastebin;

import java.util.Scanner;

/*
 * Napisati funkciju koja racuna proizvod 3 broja.
 */

public class TridesetPrviZadatak {

    public static int proizvod(int x, int y, int z) {
        return x * y * z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi prvi broj:");
        int prviBr = sc.nextInt();

        System.out.println("Unesi drugi broj:");
        int drugiBr = sc.nextInt();

        System.out.println("Unesi treci broj:");
        int treciBr = sc.nextInt();

        System.out.println("Proizvod je: " + proizvod(prviBr, drugiBr, treciBr));
    }
}

