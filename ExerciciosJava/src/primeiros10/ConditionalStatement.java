package primeiros10;

public class ConditionalStatement {
    public static void main(String[] args) {
        // Writ a program that checks if a number is positivi, negative, or zero.
        var number = 10; // You can change this value to test different cases // tradução: Escreva um programa que verifique se um número é positivo, negativo ou zero.
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // testando com temperatura
        var temperatura = -12; // You can change this value to test different cases
        if (temperatura > 0) {
            System.out.println(temperatura +" Positivo"); // tradução: positivo
        } else if (temperatura < 0) {
            System.out.println(temperatura +" Negatio"); // tradução: negativo
        } else {
            System.out.println("0 Graus.");
        }

        // vogal ou consuante
        var letra = 'a'; // You can change this value to test different cases
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {// || utilizando o operador lógico OR
            System.out.println(letra + " é uma vogal."); // tradução: é uma vogal
        } else {
            System.out.println(letra + " é uma consoante."); // tradução: é uma consoante
        }
    }
}
