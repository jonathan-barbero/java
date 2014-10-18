package ar.com.job.java8.features.annotations;

@Version(major = 1, minor = 0)
public class TargetClass {

	@Version(major=1,minor=1)
	public String method() {
		return "stg";
	}
}
