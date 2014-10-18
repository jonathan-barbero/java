package ar.com.job.java8.features.annotations;

@ClassType(role = MVC.MODEL)

public @interface Version {

	int major();

	int minor() default 0;

	String[] authors() default {};

}
