package TestCase;

import FieldAnnotation.ImportantString;
import MethodAnnotation.RunImmediately;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package PACKAGE_NAME
 * @project_Name Java_Annotation_Basics
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public abstract void BasicSound();
    public abstract void print();
}
