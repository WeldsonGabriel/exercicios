package primeiros10;

public class SwapTwoNumbers10 {
    public static void main(String[] args) {
        // Swap two numbers using a temporary variable and print the result.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        // Swapping the numbers
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("After swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        scanner.close();


        /*System.out.print("Enter first number: ");
        int firstNumberU = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumberU = scanner.nextInt();

        // Verifica se o primeiro número é par
        if (firstNumberU % 2 == 0) {
            // Swapping the numbers
            int tempU = firstNumberU;
            firstNumberU = secondNumberU;
            secondNumberU = tempU;
            System.out.println("O primeiro número era par, valores trocados:");
        } else {
            System.out.println("O primeiro número não é par, valores mantidos:");
        }

        System.out.println("First number: " + firstNumberU);
        System.out.println("Second number: " + secondNumberU);
        scanner.close();*/
    }
}
