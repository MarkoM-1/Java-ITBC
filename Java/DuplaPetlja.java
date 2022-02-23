package Java;

/*
 * U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
 */

public class DuplaPetlja {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Nedelja: " + (i+1));
            for (int j= 0; j <7 ; j++) {
                System.out.println("Dan: " + (j+1));
            }
        }
    }
}
