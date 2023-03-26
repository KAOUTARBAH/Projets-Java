import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text: ");
        while (!scanner.hasNext("quit")) {
            System.out.println(
                    scanner.hasNextInt() ? "The Input text is int: " + scanner.nextInt() :
                            scanner.hasNextLong() ? "The Input text is long: " + scanner.nextLong() :
                                    scanner.hasNextDouble() ? "The Input text is double: " + scanner.nextDouble() :
                                            scanner.hasNextBoolean() ? "The Input text is boolean: " + scanner.nextBoolean() :
                                                    "The Input text is String: " + scanner.next());
        }
    }
}