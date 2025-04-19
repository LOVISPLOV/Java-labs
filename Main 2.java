import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login;
        int password;

        while (true) {
            // === Ввод логина ===
            while (true) {
                System.out.print("Введите логин: ");
                login = scanner.nextLine();

                if (login.matches("[a-zA-Z]+")) {
                    break;
                } else {
                    System.out.println("Недопустимый логин. Только буквы!");
                }
            }

            // === Ввод пароля ===
            while (true) {
                try {
                    System.out.print("Введите пароль: ");
                    password = scanner.nextInt();
                    scanner.nextLine(); // чистим мусор
                    break;
                } catch (Exception e) {
                    System.out.println("Пароль должен быть числом!");
                    scanner.nextLine(); // чистим мусор
                }
            }

            // === Финальная проверка ===
            if (login.equalsIgnoreCase("admin") && password == 1234) {
                System.out.println("Добро пожаловать!");
                break; // УСПЕХ — выходим из основного цикла
            } else {
                System.out.println("Ошибка авторизации. Попробуйте ещё раз.\n");
            }
        }
    }
}
