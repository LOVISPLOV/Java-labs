
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел: ");
        int count = scanner.nextInt();

        int result = getOddSumFiltered (count, scanner);
        System.out.println(result);
    }
    public static boolean filterOne(int x) {
        return x % 2 != 0 && x % 3 == 0;
    }
    public static boolean filterTwo (int z) {
        return z % 4 != 0 && z % 10 != 5;
    }
    public static int getOddSumFiltered(int limit, Scanner scanner) {
        int i = 1;
        int sum = 0;
        while (i <= limit) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();

            if (number % 9 == 0) {
                i++;
                continue;
            }
            if (filterOne(number) && filterTwo(number)) {
                sum += number;
                System.out.println("i = " + number);
                if (sum > 150) {
                    break;
                }
            }
            i++;
        }
        return sum;
    }
}