package nivelmedio10;

public class AritimetcOperations01 {
    // pratice using arithimat operation with primitives.
    public static void main(String[] args) {
        // sum of two numbers // tradução: soma de dois números
        var fistNumber = 10;
        var secondNumber = 20;
        var terceiroNumber = 220;
        var quartoNumber= -210;
        var quintoNumber = 30;
        var sextoNumber = 12;

        var sum = fistNumber + secondNumber; // tradução: soma de dois números
        System.out.println("Sum of " + fistNumber + " and " + secondNumber + " is: " + sum);

        // difference of two numbers // tradução: diferença de dois números
        var difference = secondNumber - fistNumber;
        System.out.println("Difference of " + secondNumber + " and " + fistNumber + " is: " + difference);

        // product of two numbers // tradução: multiplicação de dois números
        var product = fistNumber * terceiroNumber;
        System.out.println("Product of " + fistNumber + " and " + secondNumber + " is: " + product);

        // quotient of two numbers // tradução: divisão de dois números
        if (secondNumber != 0 && quartoNumber != 0) { // check to avoid division by zero // verificação para evitar divisão por zero
            var quotient = (double) quartoNumber / secondNumber; // casting to double for accurate division
            System.out.println("Quotient of " + fistNumber + " and " + secondNumber + " is: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
        //Remainder of two numbers // tradução: resto da divisão de dois números
        if (sextoNumber != 0 && quintoNumber != 0) { // check to avoid division by zero // verificação para evitar divisão por zero
            var remainder = quintoNumber % sextoNumber;
            System.out.println("Remainder of " + fistNumber + " divided by " + secondNumber + " is: " + remainder);
        } else {
            System.out.println("Cannot calculate remainder with zero as divisor.");
        }
    }
}
