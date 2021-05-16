package animal;

import editble.Editble;

public class Chicken extends Animal implements Editble {

    @Override
    public String makeSound() {
        return "Chicken: ruck-ruck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
