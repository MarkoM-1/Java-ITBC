package domaci.Java.Pastebin;

import java.util.Scanner;

/*
 * Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
 */

public class CetvrtiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int n = sc.nextInt();

        for (int i = n ; i <= 0 ; i++ ) {
            System.out.println(i);
        }
    }
}