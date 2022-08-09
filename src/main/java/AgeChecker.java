/*
PRACA DOMOWA
Zapytaj użytkownika o wiek. W przypadku gdy ma mniej niż 18 lat wypisz na ekranie:
"Nie masz 18 lat i nie możesz kupić alkoholu."

Gdy ma wiecej niż 18 lat to podziękuj za zakupy.
 */

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek: ");

        int wiek = scanner.nextInt();

        if (wiek <18 && wiek >= 0){
            System.out.println("Nie masz 18 lat i nie możesz kupić alkoholu.");
        } else if  (wiek < 0){
            System.out.println("wiek nie może być ujemny");
        } else {
            System.out.println("Dziekujemy za zakupy");
        }

    }

}
