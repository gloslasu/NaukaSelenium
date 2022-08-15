import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b; // to działa bo pod spodem java konwertuje nam typ int, czyli liczbę stało przecinkową na liczbę zmienno przecinkową.
        //int d = a/b; // tutaj jest błąd - oczekujemy inta a jest double.
        // 0,4 to w zaokrą gleniu 0
        int d = a/(int) b; // mówimy jawnie, że chcemy przekonwertować wartość b na typ int i mamy świadomość że stracimy tutaj pewne informacje.

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;




    }
}
