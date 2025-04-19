import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите колчиство чисел: ");
        int count = scanner.nextInt();

        int result = findMinOdd (count, scanner);

        if (result == -1) {
            System.out.println("Нет нечётных чисел");
        } else {
            System.out.println("инимальное нечётное число: " + result);
        }

    }
    public static int findMinOdd(int countNumber, Scanner scanner) {
        boolean found = false;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < countNumber; i++) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            if (number % 2 != 0 && number < min) {
                min = number;
                found = true;
            }
        }
        if (!found) {
            return - 1;
        } else {
            return min;
        }

    }
}
