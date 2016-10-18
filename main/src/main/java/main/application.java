package main;

import projectA.ClassA;
import projectB.ClassB;

public class application {

	public static void main(String[] args) {
		System.out.println("1");
		ClassA classA = new ClassA();

		classA.classB = new ClassB();
		 System.out.println(classA);
	}

}
