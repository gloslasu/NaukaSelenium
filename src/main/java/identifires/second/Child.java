package identifires.second;

import identifires.first.Parent;

public class Child extends Parent {

    // jeżeli jest dziedziczenie to z innej paczki mamy dostęp do pól public i protected

    public void testIdentifier() {
        System.out.println(first);
        // System.out.println(second);
        System.out.println(third);
        // System.out.println(fourth); // nie mamy dostepu do pola prywatnego

        first();
        // second();
        third();
        // fourth(); // nie mamy dostepu do metody prywatnej
    }
}
