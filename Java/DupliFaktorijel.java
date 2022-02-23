package Java;

import java.util.Scanner;

/*
 * Napisati program koji racuna dupli faktorijel unetg broja n.
 */

public class DupliFaktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int n = sc.nextInt();

        int dupliFaktorijel = 1;

        for (int i = n; i>1 ; i-=2){
            dupliFaktorijel *= i;
        }
        System.out.print(dupliFaktorijel);
    }
}
