package Java.Pastebin;

import java.util.Scanner;

/*
 * Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
 */

public class SedmiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi mesec(1-12): ");
        int mesec = sc.nextInt();

        System.out.print("Unesi dan: ");
        int dan = sc.nextInt();

        switch (mesec) {
            case 1:
                if (dan <= 20) {
                    System.out.print("Horoskopski znak: jarac.");
                }
                else {
                    System.out.print("Horoskopski znak: vodolija.");
                }
                break;
            case 2:
                if (dan <= 19) {
                    System.out.print("Horoskopski znak: vodolija.");
                }
                else {
                    System.out.print("Horoskopski znak: riba");
                }
                break;
            case 3:
                if (dan <= 20) {
                    System.out.print("Horoskopski znak: riba.");
                }
                else {
                    System.out.print("Horoskopski znak: ovan");
                }
                break;
            case 4:
                if (dan <= 20) {
                    System.out.print("Horoskopski znak: ovan.");
                }
                else {
                    System.out.print("Horoskopski znak: bik");
                }
                break;
            case 5:
                if (dan <= 21) {
                    System.out.print("Horoskopski znak: bik.");
                }
                else {
                    System.out.print("Horoskopski znak: blizanci");
                }
                break;
            case 6:
                if (dan <= 21) {
                    System.out.print("Horoskopski znak: blizanci.");
                }
                else {
                    System.out.print("Horoskopski znak: rak");
                }
                break;
            case 7:
                if (dan <= 22) {
                    System.out.print("Horoskopski znak: rak.");
                }
                else {
                    System.out.print("Horoskopski znak: lav");
                }
                break;
            case 8:
                if (dan <= 22) {
                    System.out.print("Horoskopski znak: lav.");
                }
                else {
                    System.out.print("Horoskopski znak: devica");
                }
                break;
            case 9:
                if (dan <= 22) {
                    System.out.print("Horoskopski znak: devica.");
                }
                else {
                    System.out.print("Horoskopski znak: vaga");
                }
                break;
            case 10:
                if (dan <= 23) {
                    System.out.print("Horoskopski znak: vaga.");
                }
                else {
                    System.out.print("Horoskopski znak: skorpija");
                }
                break;
            case 11:
                if (dan <= 22) {
                    System.out.print("Horoskopski znak: skorpija.");
                }
                else {
                    System.out.print("Horoskopski znak: strelac");
                }
                break;
            case 12:
                if (dan <= 21) {
                    System.out.print("Horoskopski znak: strelac.");
                }
                else {
                    System.out.print("Horoskopski znak: jarac");
                }
                break;
            default:
                System.out.println("Pogresan mesec.");
        }
    }
}
