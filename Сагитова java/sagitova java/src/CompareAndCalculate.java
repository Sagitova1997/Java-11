import java.util.Scanner;

public class CompareAndCalculate {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое целое число (a): ");
            int a = scanner.nextInt();
            System.out.print("Введите второе целое число (b): ");
            int b = scanner.nextInt();

            // Сравнение чисел
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            // Операции
            System.out.println("Сложение: " + (a + b));
            System.out.println("Вычитание: " + (a - b));
            System.out.println("Умножение: " + (a * b));

            if (b != 0) {
                System.out.println("Деление: " + ((double) a / b));
            } else {
                System.out.println("Деление на ноль невозможно.");
            }
        }
    }
}