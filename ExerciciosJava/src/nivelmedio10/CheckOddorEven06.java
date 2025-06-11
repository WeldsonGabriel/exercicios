package nivelmedio10;


import java.util.Scanner;

public class CheckOddorEven06 {
    // Use Modulo operator and conditional logic.
    // check if a number is odd or even and print the result.
    public static void main(String[] args) {
        //vai ser um imput de número inteiro.
        Scanner Scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.
        System.out.print("Digite um número inteiro: "); // Solicita ao usuário que digite um número inteiro.
        int number = Scanner.nextInt();// Lê um número inteiro do usuário.

        if (number % 2 == 0) { // Se o resto da divisão por 2 for igual a zero, é par.
            System.out.println(number + " é um número par.");
        } else { // Caso contrário, é ímpar.
            System.out.println(number + " é um número ímpar.");
        }
    }
}