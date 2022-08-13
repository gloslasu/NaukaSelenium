package identifires.second;

import identifires.first.Parent;

public class Random {

    public void testIdentifier() {

        Parent parent = new Parent();

        System.out.println(parent.first);

//        System.out.println(parent.second); // domyslny identyfikator jest powiązany z paczką więc mamy do niego dostep.
//        System.out.println(parent.third); // nie ma dostepu
//        System.out.println(parent.fourth); // nie ma dostepu

        parent.first();
//        parent.second(); // nie ma dostepu
//        parent.third(); // nie ma dostepu do protected
//        parent.fourth(); // nie ma dostepu

    }

}