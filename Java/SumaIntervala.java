package Java;

import java.util.Scanner;

/*
 * Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n]
 */

public class SumaIntervala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = 0;
        int m = 1;
        int n = 1;
        int suma = 0;

        while (userInput != 1) {
            System.out.println("Unesite dva broja (prvi broj mora biti manji ili jednak drugom broju): ");
            m = sc.nextInt();
            n = sc.nextInt();

            if (m <= n) {
                userInput = 1;
            }
            else {
                System.out.println("Pogresno ste uneli broj, pokusajte ponovo.");
            }
        }

        for (int i = m; i <= n; i++) {
            suma += i;
        }
        System.out.println(suma);
    }
}
