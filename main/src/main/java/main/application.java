package main;

import projectA.ClassA;
import projectB.ClassB;

public class Application {

	public static void main(String[] args) {
		System.out.println("Starting Test");
		ClassA classA = new ClassA();

		classA.classB = new ClassB();
		System.out.println(classA);
	}

}
