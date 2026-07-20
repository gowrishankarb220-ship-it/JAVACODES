import java.util.Scanner;

public class Calculator {

    // Addition Method
    static int add(int a, int b) {
        return a + b;
    }

    // Subtraction Method
    static int sub(int a, int b) {
        return a - b;
    }

    // Multiplication Method
    static int mul(int a, int b) {
        return a * b;
    }

    // Division Method
    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose Option: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Answer = " + add(num1, num2));
                break;

            case 2:
                System.out.println("Answer = " + sub(num1, num2));
                break;

            case 3:
                System.out.println("Answer = " + mul(num1, num2));
                break;

            case 4:
                System.out.println("Answer = " + div(num1, num2));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
