import java.util.Scanner;

public class FibonacciGenerator {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        
        if (numTerms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            generateFibonacci(numTerms);
        }
        scanner.close();
    }
}
