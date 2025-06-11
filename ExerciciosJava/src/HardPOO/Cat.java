package HardPOO;

import interfaces.IAnimal;

public class Cat implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Gato mia");
    }
}