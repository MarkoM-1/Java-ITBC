package Java;

import java.util.Scanner;

/*
 * Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
 */

public class NaizmenicnaSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma = suma - i;
            }
            else {
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}

