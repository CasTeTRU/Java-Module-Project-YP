public class Car {
    private final String name;
    private final int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        int raceTime = 24;
        return (speed * raceTime);
    }
}
