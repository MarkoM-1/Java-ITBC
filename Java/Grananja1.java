package Java;

import java.util.Scanner;

/*
 * Napisati program koji proverava da li je uneti broj paran.
 * Ukoliko jeste, program treba da ispise poruku: Broj je paran!
 * Ukoliko nije, program treba da ispise poruku: Broj je neparan!
 */

public class Grananja1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Unesite broj: ");
        int x = s.nextInt();

        if ( x % 2 == 0) {
            System.out.print("Broj je paran!");
        }
        else {
            System.out.print("Broj je neparan!");
        }
    }
}
