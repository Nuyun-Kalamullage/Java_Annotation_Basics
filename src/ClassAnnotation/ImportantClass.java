package ClassAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 08/01/2024
 * @package ClassAnnotation
 * @project_Name Java_Annotation_Basics
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantClass {
}
