package ar.com.job.java8.features.annotations;

import java.lang.annotation.ElementType;

@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
public @ interface ClassType {

	public MVC role();
}
