import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionsExamples {

    public static void main(String[] args) {

//        int[] numbers = new int[2];
//        numbers[0] = 1;
//        numbers[1] = 3;
//
//// chcemy przejśc po wszystkich elementach naszej tablicy.
//      for (int i = 0; i <= numbers.length; i++) { // numbers.length = 2 więc otrzymujemy wyjątek bo w tablicy mamy element 0 i 1 a nie 0,1,2
//          System.out.println(numbers[i]);
//      }
//    }

// Tworzymy obiekt
        WebDriver driver = getDriver("firefox"); // firefoxxxx
        driver.get();
        driver.findElementBy();
    }


        private static WebDriver getDriver (String name){
            if (name.equals("chrome")) {
                return new ChromeDriver(); // jeśli podamy w parametrze chrome to zwrócimy obiekt typu ChromeDriver
            } else if (name.equals("firefox")) {
                return new FirefoxDriver();

            }
            return null; // defaultowa wartość
        }
    }
