package nivelmedio10;

public class FindTheMaxOfThreeNumbers10 {
    //Objective: Use conditionals with int types.
    //Given three integers, print the maximum value using only if statements (no built-in Math.max()).
    public static void main(String[] args) {
        var a = 10; // First number
        var b = 20; // Second number
        var c = 15; // Third number

        var max = a; // assume o primeiro número como o máximo inicial
        if (b > max) {// se o segundo número for maior que o máximo atual
            max = b;
        } else if (c > max) {// se o terceiro número for maior que o máximo atual
            max = c;
        }
        System.out.println("O maior número é: " + max); // printa o maior número encontrado
        // Objective: Use arrays and loops to find the maximum number and search for a specific number.
        int[] numeros = {10, 20, 15, 50, 7, 30};

        // Encontrar o maior número
        int maxU = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maxU) {
                maxU = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maxU);

        // Procurar um número específico
        int numeroProcurado = 100;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                System.out.println("Número " + numeroProcurado + " encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Número " + numeroProcurado + " não encontrado.");
        }
    }
}
