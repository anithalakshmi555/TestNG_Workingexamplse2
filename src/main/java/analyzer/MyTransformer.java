package analyzer;

import java.text.Annotation;
import org.testng.IRetryAnalyzer;
import org.testng.IAnnotationTransformer;


import java.lang.reflect.Constructor;
import  java.lang.reflect.Method;


import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements org.testng.IAnnotationTransformer {
	public void transform(ITestAnnotation annotaion,Class testClass, Constructor testConstructor, Method testMethod)
	{
		annotaion.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
