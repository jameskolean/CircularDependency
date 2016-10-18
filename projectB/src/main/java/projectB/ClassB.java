package projectB;

import projectA.ClassA;

public class ClassB {
	public ClassA classA;
	 public ClassB () {
	 }
	@Override
	public String toString() {
		return "ClassB [classA is null = " + (classA == null) + "]";
	}
	 
}
