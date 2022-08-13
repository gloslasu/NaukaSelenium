//#73 Praca domowa
//        Stwórz paczkę drivers a wewnątrz niej tworzymy interfejs WebDriver, który będzie posiadał dwie metody:
//        void get();
//        void findElementBy();  // wypisujemy, że znajdujemy element za pomocą chrome lub firefox
//        Następnie musimy utworzyć dwie klasy, które będą implementowały ten interface:
//        drivers.ChromeDriver
//        drivers.FirefoxDriver
//        Co ma się dalej zadziać:
//        drivers.ChromeDriver.get() // tutaj mamy wypisać info, że otwieramy przeglądarkę za pomocą Chrome
//        drivers.ChromeDriver.get() // tutaj mamy wypisać info, że otwieramy przeglądarkę za pomocą firefox
//        drivers.ChromeDriver.findElementBy()
//        drivers.FirefoxDriver.findElementBy()


        package drivers;

public interface WebDriver {

    void get();
    void findElementBy();

}
