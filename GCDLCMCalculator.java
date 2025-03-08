import java.util.Scanner;

public class GCDLCMCalculator {
    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Function to get user input
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        return new int[]{num1, num2};
    }

    // Main function
    public static void main(String[] args) {
        int[] numbers = getInput();
        int num1 = numbers[0];
        int num2 = numbers[1];
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }
}
