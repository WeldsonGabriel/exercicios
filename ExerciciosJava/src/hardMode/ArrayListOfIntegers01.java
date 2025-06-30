package hardMode;

public class ArrayListOfIntegers01 {
    //pratice basic arraylist operations.
    //Create an ArrayList<Integer>
    //Add 10 random numbers
    //Remove numbers less than 5
    //Print the updated list
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>(); // criação de um ArrayList de inteiros

        // Add 10 random numbers between 0 and 10
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 11); //gerar número aleatório entre 0 e 10
            numbers.add(randomNumber); // adiciona o número aleatório ao ArrayList
        }

        System.out.println("Original list: " + numbers); // printa a lista original

        // Remove numbers less than 5
        numbers.removeIf(number -> number < 5);// essa expressão lambda torna operações como remoção de
        // elementos em coleções mais simples e legíveis, evitando laços ou iteradores manuais.

        System.out.println("Updated list after removing numbers less than 5: " + numbers);
        // printa a lista atualizada após a remoção dos números menores que 5
    }
}
