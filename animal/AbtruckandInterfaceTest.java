package animal;

import editble.Editble;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class AbtruckandInterfaceTest {
    public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal: animals){
                animal.makeSound();
                System.out.println(animal.makeSound());

                if (animal instanceof Chicken){
                    Editble edibler = (Chicken)animal;
                    System.out.println(edibler.howToEat());
                }
                Fruit fruits[] = new Fruit[2];
                fruits[0] = new Orange();
                fruits[1] = new Apple();
                for (Fruit fruit : fruits){
                    System.out.println(fruit.howToEat());
                }

            }
    }
}
