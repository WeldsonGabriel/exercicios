package hardMode;
import java.util.TreeSet;

public class TreeSetSortedCollection05 {
    public static void main(String[] args) {
        // Objective: Maintain elements in sorted order.
        //	Add 10 random integers to a TreeSet
        //	Print the elements
        //	Display smallest and largest using first() and last()
        java.util.TreeSet<Integer> sortedSet = new TreeSet<>(); // Cria um TreeSet para armazenar inteiros em ordem crescente
        // Adiciona 10 números inteiros aleatórios ao TreeSet
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 100); // Gera um número aleatório entre 0 e 99
            sortedSet.add(randomNumber); // Adiciona o número ao TreeSet
        }
        System.out.println("Sorted Set: " + sortedSet); // Exibe os elementos do TreeSet
        // Exibe o menor e o maior elemento do TreeSet
        if (!sortedSet.isEmpty()) {
            System.out.println("Smallest element: " + sortedSet.first()); // Exibe o menor elemento
            System.out.println("Largest element: " + sortedSet.last()); // Exibe o maior elemento
        } else {
            System.out.println("The set is empty."); // Mensagem caso o TreeSet esteja vazio
        }
        System.out.println("End of the program."); // Mensagem de fim de programa

    }
}
