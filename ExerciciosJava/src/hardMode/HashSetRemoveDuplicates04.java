package hardMode;

public class HashSetRemoveDuplicates04 {
    public static void main(String[] args) {
        // Objective: Learn uniqueness property of Set.
        // Task:
        //	Create a List with duplicate integers
        //	Use a HashSet to remove duplicates
        //	Print unique values

        java.util.List<Integer> listWithDuplicates = new java.util.ArrayList<>(); // criação de uma lista com duplicatas
        // adiciona números inteiros à lista, incluindo duplicatas
        listWithDuplicates.add(1);
        listWithDuplicates.add(3);
        listWithDuplicates.add(4);
        listWithDuplicates.add(4);
        listWithDuplicates.add(5);

        System.out.println("List with duplicates: " + listWithDuplicates); // printa a lista com duplicatas
        java.util.HashSet<Integer> uniqueSet = new java.util.HashSet<>(listWithDuplicates); // cria um HashSet a partir da lista, removendo duplicatas automaticamente
        System.out.println("Unique values: " + uniqueSet); // Display the unique values
        System.out.println("Final state of the HashSet: " + uniqueSet);
    }
}
