package Java;

import java.util.ArrayList;

/*
 * Kreirajte array listu nekog vaseg interesovanje (npr sport)
 * u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
 * iz liste dohvatite 3. element liste i ispisite
 * promenite naziv prvog elementa
 * uklonite 5. element
 * ispisite velicinu vase liste
 * pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste
 */

public class ArrayListe {
    public static void main(String[] args) {
        ArrayList<String> sport = new ArrayList<>(5);
        sport.add("fudbal");
        sport.add("kosarka");
        sport.add("odbojka");
        sport.add("rukomet");
        sport.add("vaterpolo");
        System.out.println(sport.get(3));
        sport.set(0, "sah");
        sport.remove(4);
        System.out.println(sport.size());
        System.out.println("Klasicna for petlja:");
        for (int i = 0; i < sport.size(); i++) {
            System.out.println(sport.get(i));
        }
        System.out.println("Napredna for petlja:");
        for (String x : sport) {
            System.out.println(x);
        }
    }
}
