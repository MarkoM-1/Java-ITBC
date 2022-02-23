package Java.Pastebin;

import java.util.Scanner;

/*
 * Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
 */

public class PrviZadatak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj n: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Paran");
        }
        else {
            System.out.println("Neparan");
        }
    }
}
