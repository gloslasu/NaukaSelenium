package animals;

public abstract class Animal {

    public final static int legs = 4; // stworzymy sobie tylko zwierzatka które będa miały 4 nózki

    public abstract void sound(); // metoda abstrakcyjna, której implementację dostarczą klasy, które będą dziedziczyły po klasie Animal

// możemy mieć wewnątrz klasy abstrakcyjnej jakąś metodę która będzie miała jakąś implementację:
    public void sayHello() {
        System.out.println("Hello, i'm an animal.");
    }
}
