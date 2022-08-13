package identifires.first;

public class Random {

    // klasa w tej samej paczce nie ma dostepu do pól/metod private rodzica

    public void testIdentifier() {

        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second); // domyslny identyfikator jest powiązany z paczką więc mamy do niego dostep.
        System.out.println(parent.third);
        // System.out.println(parent.fourth); // nie ma dostepu do private
        parent.first();
        parent.second();
        parent.third();
        // parent.fourth(); // nie ma dostepu do private
    }

}
