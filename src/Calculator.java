import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Simple Calculator ");
        System.out.print("Choose an operation: +, -, *, /");
        char operation = sc.next().charAt(0);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result = 0.0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
               if (num2 == 0) {
                   System.out.println("The number is zero");
               } else {
                   result = num1 / num2;
               }
                break;
            default:
                System.out.println("Error! Invalid operation");
                return;
        }
        System.out.println("The result is: " + result);
        sc.close();

    }
}
