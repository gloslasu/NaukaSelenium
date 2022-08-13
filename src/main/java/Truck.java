public class Truck implements Vehicle {


    @Override
    public void jazda(int speed) {
        System.out.println("jade ciężarówką po Texasie z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuje ciężarówką");
    }

    @Override
    public String info() {
        return "Truck";
    }

    public void zatankuj() {
        System.out.println("Tankuję i idę na obiad");
    }

}
