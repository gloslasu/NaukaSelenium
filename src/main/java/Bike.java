public class Bike implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("jadę rowerem z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuje rowerem");
    }

    @Override
    public String info() {
        return "Bike";
    }
}
