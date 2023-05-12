package Task1_id9184.Animal;

import Task1_id9184.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Toktok";
    }

    @Override
    public String howToEat(){
        return "Fry";
    }
}
