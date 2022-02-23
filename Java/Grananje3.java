package Java;

import java.util.Scanner;

/*
 * Napisati program koji na osnovu unete godine i meseca
 * ispisuje koliko taj mesec ima dana. (Vodite racuna o prestupnoj godini!)
 */

public class Grananje3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite godinu: ");
        int godina = s.nextInt();

        System.out.print("Unesite mesec( u formatu 1-12): ");
        int mesec = s.nextInt();

        if (mesec == 2) {
            if (godina % 4 == 0) {
                System.out.print(mesec + ". mesec " + " u " + godina + ". godini ima 29 dana.");
            } else {
                System.out.print(mesec + ". mesec " + " u " + godina + ". godini ima 28 dana.");
            }
        }
        else if( (mesec % 2 != 0 && mesec < 8) || (mesec % 2 == 0 && mesec > 7) ){
                System.out.print(mesec + ". mesec " + " u " + godina + ". godini ima 31 dan.");
        }
        else {
            System.out.print(mesec + ". mesec " + " u " + godina + ". godini ima 30 dana.");
        }
    }
}