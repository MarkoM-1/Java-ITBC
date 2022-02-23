package Java;

import java.util.Scanner;

/*
 Za uneti celobrojni nenegativan broj n, ispasti za sve brojeve od 1 do i zakljucno sa n nisku "Fizz"
 ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5
 */

public class FizzBuzz {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite broj: ");
        int n = sc.nextInt();

        for (int x = 1 ; x <= n; x++) {
            System.out.print(x + ":");
            if (x % 3 == 0){
                System.out.print("Fizz");
            }
            if ( x % 5 == 0){
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }
}
