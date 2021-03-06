package ar.com.job.java8.features.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ClassType(role = MVC.MODEL)
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ ElementType.TYPE })
public @interface Version {

	int major();

	int minor() default 0;

	String[] authors() default {};

}
