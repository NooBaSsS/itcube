import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки
        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();

        // Ввод второй строки
        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();

        // Сравнение строк и вывод результата
        if (firstString.equals(secondString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
