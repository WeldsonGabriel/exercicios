package primeiros10;

public class WhileLoop07 {
    public static void main(String[] args) {
        // Use a while loop to print number from 5 to 1. caso queira imprimir o 0 use --i antes da impressão
        var i = 5;
        while (i >= 1){
            System.out.println(i); // --i vai decrementar antes da impressão mostrando o 0
            i--;
        }
        // Use a while loop to print number from 1 to 5. caso queira imprimir o 6 use ++j antes da impressão
        var j = 1;
        while (j <= 5){
            System.out.println(j); // ++j vai incrementar antes da impressão mostrando o 6
            j++;
        }
    }
}
