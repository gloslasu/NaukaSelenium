public class IphoneApp extends App{

    // konstruktor klasy IphoneApp
    public IphoneApp(String name) { // który przyjmuje jako parametr name czyli nazwę naszej aplikacji
        super(name); // i ta nazwa jest przekazywana za pomocą słowa kluczowego super do kontruktora klasy App
    }

    public void runIphoneApp() {
        System.out.println("uruchamiamy naszą aplikację na Srajfonie" );
    }
}
