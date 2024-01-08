package MethodAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package MethodAnnotation
 * @project_Name Java_Annotation_Basics
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunImmediatelyTimes {
    int times();
    boolean isLimit() default false; // we can use default keyword to add default value if there are no arguments to this parameter.
}
