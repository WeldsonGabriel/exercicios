package nivelmedio10;

public class IncrementAndDecrementPratice09 {
    //Objective: Understand ++ and -- operators.
    //Demonstrate the difference between prefix (++x) and postfix (x++) increment by printing values before and after the operation.
    public static void main(String[] args) {
        var x = 2; // inicia x com 2
        var y = 1; // inicia y com 1

        // Postfix increment
        System.out.println("Postfix increment:"); // printa "Postfix increment:"
        System.out.println("x before increment: " + x); // Prints 2
        System.out.println("x after increment: " + x++); // Prints 2, then increments x to 3
        System.out.println("x now: " + x); // Prints 3

        // Prefix increment
        System.out.println("\nPrefix increment:"); // printa "Prefix increment:"
        System.out.println("y before increment: " + y); // printa 1
        System.out.println("y after increment: " + ++y); // incrementa y to 2, then prints 2
        System.out.println("y now: " + y); // printa 2

    // Objective: Understand -- operator.
    // Demonstrate the difference between prefix (--x) and postfix (x--) decrement by printing values before and after the operation.

        var a = 5; // inicia "a" com 5
        var b = 4; // inicia "b" com 4

        // Postfix decrement
        System.out.println("Postfix decrement:"); // printa "Postfix decrement:"
        System.out.println("a before decrement: " + a); // Prints 5
        System.out.println("a after decrement: " + a--); // Prints 5, then decrements a to 4
        System.out.println("a now: " + a); // Prints 4

        // Prefix decrement
        System.out.println("\nPrefix decrement:"); // printa "Prefix decrement:"
        System.out.println("b before decrement: " + b); // printa 4
        System.out.println("b after decrement: " + --b); // decrements b to 3, then prints 3
        System.out.println("b now: " + b); // printa 3
    }
}
