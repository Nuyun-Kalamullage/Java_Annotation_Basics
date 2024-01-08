package FieldAnnotation;

import MethodAnnotation.RunImmediately;
import MethodAnnotation.RunImmediatelyTimes;
import TestCase.Animal;
import TestCase.Cat;
import TestCase.Dog;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package FieldAnnotation
 * @project_Name Java_Annotation_Basics
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Animal myCat = new Cat("Tom",6);
        Dog myDog = new Dog("Tifin", 8);
        List<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(myCat);
        myAnimals.add(myDog);
        for (Animal animal : myAnimals) {
            animal.print();
            for (Field field : animal.getClass().getDeclaredFields()) {
                Object object = field.get(animal);
                if (object instanceof String stringValue){
                    System.out.println("Important Animal String is : " + stringValue.toUpperCase());
                }
            }
        }
    }
}
