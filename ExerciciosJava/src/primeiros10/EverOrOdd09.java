package primeiros10;

public class EverOrOdd09 {
    public static void main(String[] args) {
        // check ifa number is even or odd.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close();
    }
}
