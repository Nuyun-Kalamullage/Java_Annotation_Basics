import ClassAnnotation.ImportantClass;
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
 * @package
 * @project_Name Default (Template) Project
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
            //Class Annotation Implementation
            if (animal.getClass().isAnnotationPresent(ImportantClass.class)){
                System.out.println("This Class is Very Important :)");
            } else {
                System.out.println("This Class is not Very Important :(");
            }

            //Method Annotation Implementation
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

            //Field Annotation Implementation
            for (Field field : animal.getClass().getDeclaredFields()) {
                Object object = field.get(animal);
                if (object instanceof String stringValue){
                    System.out.println("Important Animal String is : " + stringValue.toUpperCase());
                }
            }

        }

    }
}