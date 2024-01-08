package TestCase;

import ClassAnnotation.ImportantClass;
import FieldAnnotation.ImportantString;
import MethodAnnotation.RunImmediately;
import MethodAnnotation.RunImmediatelyTimes;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package PACKAGE_NAME
 * @project_Name Java_Annotation_Basics
 */

@ImportantClass
public class Dog extends Animal{
    @ImportantString
    public String name; // I have made the variable public to access the dog name outside this package through this annotation
    public Dog(String name, int age) {
        super(name, age);
        this.name = name;
    }

    @Override
    @RunImmediatelyTimes(times = 7, isLimit = true)
    public void BasicSound() {
        System.out.println("bow wow");
    }

    @Override
    public void print() {
        System.out.println("Dog Name : " + super.getName());
    }
}
