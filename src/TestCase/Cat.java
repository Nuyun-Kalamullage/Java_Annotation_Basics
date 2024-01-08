package TestCase;

import MethodAnnotation.RunImmediately;
import MethodAnnotation.RunImmediatelyTimes;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package PACKAGE_NAME
 * @project_Name Java_Annotation_Basics
 */
public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    @RunImmediately
    @RunImmediatelyTimes(times = 2)
    public void BasicSound(){
        System.out.println("purrs purrs");
    }
    @Override
    public void print() {
        System.out.println("Cat Name : " + super.getName());
    }
}
