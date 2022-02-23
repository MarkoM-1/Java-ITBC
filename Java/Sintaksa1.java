package Java;

import java.util.Scanner;

/*
 * Napisati program koji ce racunati povrsinu okrecene prostorije,tako sto se ivice prostorije ucitavaju preko konzole.
 * (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
 */

public class Sintaksa1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dužinu zida: ");
        float a = s.nextFloat();

        System.out.print("Unesite širinu zida: ");
        float b = s.nextFloat();

        System.out.print("Unesite visinu zida: ");
        float c = s.nextFloat();

        float rezultat = 2 * (a * c + b * c) + a * b;

        System.out.print("Ukupna površina okrecene prostorije je: " + rezultat) ;

    }

}