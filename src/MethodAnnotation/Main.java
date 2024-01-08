package MethodAnnotation;

import ClassAnnotation.ImportantClass;
import TestCase.Animal;
import TestCase.Cat;
import TestCase.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package MethodAnnotation
 * @project_Name Java_Annotation_Basics
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Tom",6);
        Dog myDog = new Dog("Tifin", 8);
        List<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(myCat);
        myAnimals.add(myDog);
        for (Animal animal : myAnimals) {
            animal.print();
            for (Method method : animal.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(RunImmediately.class)){
                    method.invoke(animal);
                }
                if (method.isAnnotationPresent(RunImmediatelyTimes.class)){
                    RunImmediatelyTimes runImmediatelyTimes = method.getAnnotation(RunImmediatelyTimes.class);
                    int length = runImmediatelyTimes.times();
                    if (runImmediatelyTimes.isLimit())
                        length = 5;
                    for (int i = 0 ; i< length; i++){
                        method.invoke(animal);
                    }
                }
            }
        }
    }
}
