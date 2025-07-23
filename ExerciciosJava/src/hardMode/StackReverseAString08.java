package hardMode;

public class StackReverseAString08 {
    public static void main(String[] args) {
        //Objective: Use Stack<Character>.
        //Push all characters of a string into a Stack
        //Pop each character and build the reversed string
        //Print both original and reversed strings
        java.util.Stack<Character> stack = new java.util.Stack<>(); // Cria uma pilha para armazenar caracteres
        String originalString = "Hello, World!"; // String original a ser invertida
        System.out.println("Original String: " + originalString); // Exibe a string original
        // Adiciona cada caractere da string original à pilha
        for (char c : originalString.toCharArray()) {
            stack.push(c); // Adiciona o caractere à pilha
        }
        StringBuilder reversedString = new StringBuilder(); // Cria um StringBuilder para construir a string invertida
        // Remove cada caractere da pilha e adiciona ao StringBuilder
        while (!stack.isEmpty()) { // Enquanto a pilha não estiver vazia
            reversedString.append(stack.pop()); // Remove o caractere do topo da pilha e adiciona ao StringBuilder
        }
        // Exibe a string invertida
        System.out.println("Reversed String: " + reversedString.toString()); // Converte o StringBuilder para String e exibe
        // Exibe o estado final da pilha
        System.out.println("Final state of the Stack: " + stack); // Exibe o estado final da pilha (deve estar vazia)
        System.out.println("End of the program."); // Mensagem de fim de programa
    }
}
