package domaci.Java;

/*
 * Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku
 * proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom.
 */

import java.util.Scanner;

public class ArtimetickeOperacije {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = sc.nextInt();

        System.out.println(a + b );
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
