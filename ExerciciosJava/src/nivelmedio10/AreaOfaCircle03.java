package nivelmedio10;

public class AreaOfaCircle03 {
    // Use double and final for calculations
    // Calculate the area of a cicle given the radius using the formula: area = pi * radius ao quadrado
    //Use final double PI = 3.14159;
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 25; // Example radius
        double area = PI * Math.pow(radius, 2); // O método Math.pow(a, b) em Java retorna o valor de a elevado à potência b.
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area); // Placeholders for radius and area
    }
}
