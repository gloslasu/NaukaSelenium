package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą ChromeDrivera");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce Chrome");
    }
}
