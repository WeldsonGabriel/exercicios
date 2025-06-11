package primeiros10;

public class SimpleLoop {
    public static void main(String[] args) {
        // Write a program that prints numbers from 1 to 10 using a loop.
        for (int i = 99; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}