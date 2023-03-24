import java.util.Scanner;

public class MenuUtil {
    public static void calculator(){
        System.out.print("Enter first number : ");

        Scanner scan = new Scanner(System.in);
        double firstNumber = scan.nextDouble();

        System.out.print("Enter second number : ");
        double secondNumber = scan.nextDouble();

        System.out.println("Which operation do you want to make?" +
                "\nTouch 1 for '+'" +
                "\nTouch 2 for '-'" +
                "\nTouch 3 for '*'" +
                "\nTouch 4 for '/'");

        Scanner scanner = new Scanner(System.in);
        double operation = scanner.nextDouble();

        double result = 0;

        if (operation == 1) {
            result = Operations.plus(firstNumber, secondNumber);
        } else if (operation == 2) {
            result = Operations.minus(firstNumber, secondNumber);
        } else if (operation == 3) {
            result = Operations.multiply(firstNumber, secondNumber);
        } else if (operation == 4) {
            result = Operations.divide(firstNumber, secondNumber);
        }
        System.out.println(result);
    }
}
