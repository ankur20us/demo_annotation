package com.av.demo.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.av.demo.annotation.TestAnnotation;

public class ClassThatReadsAnnotation {

	
	public static void main(String[] args) {
		System.out.println("Lets first create a normal object of the TestClassWithAnnotationUsed class");
		TestClassWithAnnotationUsed obj = new TestClassWithAnnotationUsed();
		System.out.println("Now call the method and see whether it works or not");
		obj.functionWithAnnotationApplied_1();
		System.out.println("Now we read the annotation and try to get the value that is passed in for the string. "
				+ "\nThis is usually done by reading the annotation in the runtime. "
				+ "\nAnd this is done by the concept called Reflection of Java. "
				+ "\nBy the we can actually manipulate the classes and objects in runtime, "
				+ "\nwhich is internally by the apis like spring and hibernate. ");
		
		//Getting the reference of the class Object
		Class<TestClassWithAnnotationUsed> testClassWithAnnotationUsedClass = TestClassWithAnnotationUsed.class;
		
		for (Method method : testClassWithAnnotationUsedClass.getDeclaredMethods()) {
			//Checking for the presence of the Annotation we have made
			if(method.isAnnotationPresent(TestAnnotation.class)){
				Annotation annotation = method.getAnnotation(TestAnnotation.class);
				TestAnnotation test = (TestAnnotation) annotation;
				System.out.println(test.name());
			}
		}
		
	}
	
}
