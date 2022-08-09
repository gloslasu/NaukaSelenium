public class Futbloller extends Person {// nasz piłkarz rozszerza klasę Personi w tym momencie nauczyciel ma już dostęp do pól i metod jakie zostały zdefiniowane w klasie Person

    public String footballClub;

    public Futbloller(String namePerson, int agePerson, String footballClub) {
        super(namePerson, agePerson); // super musi być pierwszą operacją jaką wykonamy wewnątrz konstruktora klasy potomnej.
        this.footballClub = footballClub; // przypisujemy wartość
    }

    public void playFootbal() {
        System.out.println("I am playing football");
        walkPerson(); // piłkarz ma dostęp do metody klasy Person
        eatPerson(); // piłkarz ma dostęp do metody klasy Person
    }
}
