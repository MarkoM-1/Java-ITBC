package Java;

import java.util.Scanner;

/*
 Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
 */

public class Faktorijel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int n = sc.nextInt();
        int fakt = 1;

        for (int i = 2; i <= n ;i++) {
            fakt *= i;
        }
        System.out.println(fakt);
    }
}
