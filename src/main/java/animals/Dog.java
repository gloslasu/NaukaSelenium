package animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("hou hou");
        sayHello();
        System.out.println("liczba nóg " + legs);
    }
}
