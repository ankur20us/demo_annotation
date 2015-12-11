package com.av.demo.example;

import com.av.demo.annotation.TestAnnotation;

public class TestClassWithAnnotationUsed {
	
	@TestAnnotation(name="ACCEPTED_VALUE")
	public void functionWithAnnotationApplied_1(){
		System.out.println("I have applied the annotation TestAnnotation with value ACCEPTED_VALUE");
	}
	
	
	@TestAnnotation(name="NON_ACCEPTED_VALUE")
	public void functionWithAnnotationApplied_2(){
		System.out.println("I have applied the annotation TestAnnotation with value NON_ACCEPTED_VALUE");
	}
}
