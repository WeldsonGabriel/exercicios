package nivelmedio10;

public class SwapTwoNumbers05 {
    //apply aritmatic operation // tradução: aplicar operações aritméticas
    //Write a program that swaps the values of two variables without using a third variable.
    //tradução: Escreva um programa que troque os valores de duas variáveis sem usar uma terceira variável.
    public static void main(String[] args) {
        // Declare two variables
        var firstNumber = 10;
        var secondNumber = 20;

        // Print original values
        System.out.println("Before swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Swap the values without using a third variable
        firstNumber = firstNumber + secondNumber; // Step 1: Add both numbers
        secondNumber = firstNumber - secondNumber; // Step 2: Subtract the new value of firstNumber by secondNumber to get the original firstNumber
        firstNumber = firstNumber - secondNumber; // Step 3: Subtract the new value of secondNumber from the new value of firstNumber to get the original secondNumber

        // Print swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}

//Exatamente! Você soma os dois valores, depois usa subtrações para "isolar" cada valor original em variáveis diferentes. Assim, consegue trocar os valores sem precisar de uma variável extra. É uma técnica comum em lógica de programação para economizar memória em situações simples.
