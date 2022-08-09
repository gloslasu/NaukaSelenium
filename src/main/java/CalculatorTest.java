import java.util.Scanner;

public class Calculator {

// napisz program, który poprosi użytkownika o dwie liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        int firestName = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int add = firestName + secondNumber;

        System.out.println("Wynikiem dodawania podanych liczb jest " + add);


    }

}
