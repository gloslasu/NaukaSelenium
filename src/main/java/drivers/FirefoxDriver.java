package drivers;

import drivers.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą FirefoxDrivera");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce Firefox");
    }
}
