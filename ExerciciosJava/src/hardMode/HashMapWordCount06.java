package hardMode;
import java.util.*;
public class HashMapWordCount06 {
    public static void main(String[] args) {
        //Objective: Use HashMap to store and count words.
        //Input a sentence
        //Count the frequency of each word using a HashMap<String, Integer>
        //Print word frequencies
        Scanner scanner = new Scanner(System.in); // Cria um scanner para ler a entrada do usuário
        System.out.println("Enter a sentence: "); // Solicita ao usuário que insira uma frase
        String input = scanner.nextLine(); // Lê a linha inteira inserida pelo usuário
        String[] words = input.split("\\s+"); // Divide a frase em palavras usando espaço como delimitador
        Map<String, Integer> wordCountMap = new HashMap<>(); // Cria um HashMap para armazenar palavras e suas contagens
        for (String word : words) { // Itera sobre cada palavra na matriz de palavras
            word = word.toLowerCase(); // Converte a palavra para minúsculas para evitar distinção entre maiúsculas e minúsculas
            if (wordCountMap.containsKey(word)) { // Verifica se a palavra já está no mapa
                wordCountMap.put(word, wordCountMap.get(word) + 1); // Incrementa a contagem da palavra
            } else {
                wordCountMap.put(word, 1); // Adiciona a palavra com contagem inicial de 1
            }
        }
        System.out.println("Word Frequencies:"); // Exibe o título da tabela de frequências
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) { // Itera sobre as entradas do mapa
            System.out.println(entry.getKey() + ": " + entry.getValue()); // Imprime a palavra e sua contagem
        }
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
        System.out.println("End of the program."); // Mensagem de fim de programa
    }
}
