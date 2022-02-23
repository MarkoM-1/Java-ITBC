package Java.Pastebin;

import java.util.Scanner;

/*
 * Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
 * "Dobrodosao u {x}. razred, {ime} {prezime}",
 * pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
 * A ako korisnik nije djak ispisati jednu odgovarajucu poruku od:
 * "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
 * jos jedna pretpostavka - u skolu polazi sa 7 godina i da nije ponavljao razred.
 */

public class OsmiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi ime: ");
        String ime = sc.nextLine();

        System.out.print("Unesi prezime: ");
        String prezime = sc.nextLine();

        System.out.print("Unesi godinu rodjenja: ");
        int godiste = sc.nextInt();

        int razred = 2015 - godiste;

        if (razred >= 1 && razred <= 12) {
            System.out.println("Dobrodosao u " + razred + " razred," + ime + " " + prezime);
        }
        else if (razred < 1) {
            System.out.print(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        }
        else {
            System.out.print(ime + " " + prezime + " je zavrsio skolu.");
        }
    }

}
