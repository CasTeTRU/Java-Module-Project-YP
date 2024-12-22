public class Race {
    private String currentLeader = "";
    private int leaderDistance = 0;

    public void checkLeader(Car car) {
        int carDistance = car.getDistance();

        if (carDistance > leaderDistance) {
            currentLeader = car.getName();
            leaderDistance = carDistance;
        }
    }

    public String getCurrentLeader() {
        return currentLeader;
    }
}
