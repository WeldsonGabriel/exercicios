package nivelmedio10;

import java.util.Scanner;

public class BooleanLogicChallenge07 {
    // User boolean and logic operators.
    // given two boolean variables
    // javaCopiarEditarboolean hasLicense = true;  boolean hasCar = false;  boolean isSober = true;
    // Print if the person is allowed to drive based on these conditions.


    public static void main(String[] args) {
        //as variaveis vao receber um imput com Scaner, mas como não é necessário, vamos inicializar as variáveis diretamente.
        System.out.println("Digite se você tem carteira de motorista (true/false): ");
        var Scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.
        boolean hasLicense = Scanner.nextBoolean(); // Lê se o usuário tem carteira de motorista.
        System.out.println("Digite se você tem carro (true/false): ");
        boolean hasCar = Scanner.nextBoolean(); // Lê se o usuário tem carro.
        System.out.println("Digite se você está sóbrio (true/false): ");
        boolean isSober = Scanner.nextBoolean(); // Lê se o usuário está sóbrio.
        // Verifica se o usuário pode dirigir
        if (hasLicense && hasCar && isSober) { // Se o usuário tem carteira, carro e está sóbrio
            System.out.println("Você pode dirigir.");
        } else { // Caso contrário, não pode dirigir
            System.out.println("Você não pode dirigir.");
        }
        Scanner.close(); // Fecha o Scanner para evitar vazamento de recursos.
    }
}
