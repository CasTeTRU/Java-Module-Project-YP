import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Введите название машины " + (i + 1) + ": ");
            String name = scanner.next();

            int speed = -1;
            while (speed < 0 || speed > 250) {
                System.out.println("Введите скорость машины " + (i + 1) + ": ");

                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();

                    if (speed < 0 || speed > 250) {
                        System.out.println("Неправильная скорость");
                    }
                } else {
                    System.out.println("Скорость только числом!");
                    scanner.next();
                }
            }
            cars[i] = new Car(name, speed);
            race.checkLeader(cars[i]);
            }
        scanner.close();
        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
    }
}
