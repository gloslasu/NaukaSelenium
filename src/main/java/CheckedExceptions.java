import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main (String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\Sławek\\Documents\\b2b\\Selenium\\Projekty\\NaukaSelenium\\src\\main\\java\\testxxx.txt"); // próbujey wywołać metodę readFile?() i ta metoda wyrzuci wyjątek
        } catch (FileNotFoundException e) { // przechwycenie obiektu w tym miejscu i wykonanie kodu w bloku catch
            System.out.println("wyjątek został wyrzucony");
            System.out.println(e.getMessage()); // wyrzucamy wiadomość naszego wyjątku
            // wiadomośc jest pobrana z obiektu klasy FileNotFoundException
        } finally {
            System.out.println("Closing File");
        }
    }

public static void readFile(String path) throws FileNotFoundException {
    FileInputStream fileInputStream = new FileInputStream(path);

}

}
