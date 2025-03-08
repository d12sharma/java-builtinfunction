import java.util.Scanner;

class MaximumOfThreeNumbers {
	

    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a; // Assume a is the maximum initially
        if (b > max) {
            max = b; // Update max if b is greater
        }
        if (c > max) {
            max = c; // Update max if c is greater
        }
        return max;
	}
	
}