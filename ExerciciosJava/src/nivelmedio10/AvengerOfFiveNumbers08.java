package nivelmedio10;

public class AvengerOfFiveNumbers08 {
    // Work with float or double.
    // Read five double values, compute their average, and print the result rounded to two decimal places.
    public static void main(String[] args) {
        double[] numbers = new double[5]; // lista para armazenar os números
        var sum = 0.0D; // variável para armazenar a soma dos números

        // Read five double values from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numbers[i] = new java.util.Scanner(System.in).nextDouble();
            sum += numbers[i]; // Add the number to the sum
        }

        // Calculate the average
        var average = sum / (double) 5;// casting para padronizar a classes double

        // Print the result rounded to two decimal places
        System.out.printf("A média dos números é: %.2f%n", average);
    }
}
