package nivelmedio10;

public class TypeCastingBetweenPrimitives02 {
    // Lean explicit and implicit type casting
    public static void main(String[] args) {
        // Declare a double variable and convert it toint, float, and byte.
        //Print all result and observe what charges.
        // tradução: Declare uma variável do tipo double e converta para int, float e byte.
        double doubleValue = 128.456;

        var intValue = (int) doubleValue; // explicit casting // no caso de int, o valor será truncado se for maior que 2.147483647E9 ou menor que -2.147483648E9
        float floatValue = (float) doubleValue; // explicit casting // no caso de float, o valor será truncado se for maior que 3.4028235E38 ou menor que -3.4028235E38
        byte byteValue = (byte) doubleValue; // explicit casting // no caso de byte, o valor será truncado se for maior que 127 ou menor que -128

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to byte: " + byteValue);

    }
}
