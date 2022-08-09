public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {

        int number = 12; // dla 12 jest spełniony warunek > 0 oraz > 12
        // ale jesli sprawdzi się jakiś warunek to już nie sprawdzamy kolejnych

        if (number == 0){
            System.out.println("liczba = 0");
        } else if (number > 0) {
            System.out.println("liczba dodatnia");
        } else if (number > 10){
            System.out.println("liczba większa od 10");
        } else if (number < -5){
            System.out.println("liczba mniejsza od -5");
        } else{
            System.out.println("żaden warunek nie został spełniony");
        }
    }

}


