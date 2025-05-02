import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первую строку (a): ");
            String a = scanner.nextLine();
            System.out.print("Введите вторую строку (b): ");
            String b = scanner.nextLine();

            // Сравнение строк
            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        }
    }
}