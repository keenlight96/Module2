package Task1_id9184;

import Task1_id9184.Animal.Animal;
import Task1_id9184.Animal.Chicken;
import Task1_id9184.Animal.Tiger;
import Task1_id9184.fruit.Apple;
import Task1_id9184.fruit.Fruit;
import Task1_id9184.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();

        Chicken a2 = new Chicken();
        System.out.println(a2.howToEat());

        for (Animal a :
                animals) {
            System.out.println(a.makeSound());;
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit f :
                fruits) {
            System.out.println(f.howToEat());
        }
    }
}
