package identifires.first;

public class Child extends Parent{

    public void testIdentifier() { // żeby nie nadpisywac metody z klasy rodzica daliśmy inną nazwę metody niż w Parent. Robimy to żeby nie było żadnych wątpliwości.
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        // System.out.println(fourth); // nie mamy dostepu do pola prywatnego
        first();
        second();
        third();
        // fourth(); // nie mamy dostepu do metody prywatnej
    }

}
