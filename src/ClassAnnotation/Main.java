package ClassAnnotation;

import TestCase.Animal;
import TestCase.Cat;
import TestCase.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package ClassAnnotation
 * @project_Name Java_Annotation_Basics
 */
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Tom",6);
        Dog myDog = new Dog("Tifin", 8);
        List<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(myCat);
        myAnimals.add(myDog);
        for (Animal animal : myAnimals) {
            animal.print();
            if (animal.getClass().isAnnotationPresent(ImportantClass.class)){
                System.out.println("This Class is Very Important :)");
            } else {
                System.out.println("This Class is not Very Important :(");
            }
        }
    }
}
