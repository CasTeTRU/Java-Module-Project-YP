import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        Car[] cars = new Car[3];

        for (int i = 1; i <= cars.length; i++) {
            System.out.println("Введите название машины " + i + ": ");
            String carName = scanner.next();

            int carSpeed = 0;
            while (carSpeed <= 0 || carSpeed > 250) {
                System.out.println("Введите скорость машины " + i + ": ");

                if (scanner.hasNextInt()) {
                    carSpeed = scanner.nextInt();

                    if (carSpeed <= 0 || carSpeed > 250) {
                        System.out.println("Неправильная скорость. Диапазон от 0 до 250 км/ч");
                    }
                } else {
                    System.out.println("Скорость только числом!");
                    scanner.next();
                }
            }
            cars[i-1] = new Car(carName, carSpeed);
            race.checkLeader(cars[i-1]);
            }
        scanner.close();
        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
    }
}
