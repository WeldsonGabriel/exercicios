package objetos;

import java.util.Scanner;
import interfaces.IAnimal;
import HardPOO.Dog;
import HardPOO.Cat;
import HardPOO.Cow;

public class Animais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o animal (dog, cat, cow): ");
        String tipo = scanner.nextLine().toLowerCase();

        IAnimal animal;
        switch (tipo) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            case "cow":
                animal = new Cow();
                break;
            default:
                System.out.println("Animal inválido");
                scanner.close();
                return;
        }

        animal.makeSound();
        scanner.close();
    }
}
//Interface (IAnimal): Define um contrato comum para todos os animais, garantindo que todos tenham o método makeSound().
//Classes concretas (Dog, Cat, Cow): Cada animal implementa a interface e define seu próprio som.
//Classe principal (Animais): Lê a entrada do usuário, escolhe qual animal criar e executa o método correspondente.