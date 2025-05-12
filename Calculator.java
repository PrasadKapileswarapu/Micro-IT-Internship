import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int operator, n1, n2;
            System.out.println("Choose an operator: \n 1. Add \n 2. Subtract \n 3. Multiplication \n 4. Division");
            System.out.print("Enter an operator (1-4), or 0 to exit: ");
            operator = sc.nextInt();

            if (operator == 0) {
                System.out.println("Exit the calculator.");  
                break;
            }

            if (operator < 1 || operator > 4) {
                System.out.println("Invalid Choice!! Please enter a number between 1 and 4.");
                continue;
            }

            System.out.print("Enter first number: ");
            n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            n2 = sc.nextInt();

            int result = 0;

            switch (operator) {
                case 1:
                    result = n1 + n2;
                    break;
                case 2:
                    result = n1 - n2;
                    break;
                case 3:
                    result = n1 * n2;
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = n1 / n2;
                    break;
            }

            System.out.println("Result is: " + result);
        }

        sc.close();
    }
}
