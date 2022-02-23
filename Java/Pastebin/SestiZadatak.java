package Java.Pastebin;

import java.util.Scanner;

/*
 * Ispisati proizvod prvih n celih brojeva [1, n].
 */

public class SestiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int n = sc.nextInt();
        int proizvod = 1;

        for (int i = 1; i <= n; i++) {
            proizvod = proizvod * i;
        }
        System.out.println(proizvod);
    }
}
