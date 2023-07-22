# Selenium_WebDriver_with_Java_Sect34-Sect36_Core_Java_Concepts

Set git remote:
git remote add origin https://github.com/shellymutu-grigg/Selenium_WebDriver_with
_Java_Sect34-Sect36_Core_Java_Concepts.git

OOPS: Object Oriented Programming Structure

Interfaces:
- Interface contains only abstract methods
- Access specifiers for methods in interfaces must be public
- Variables defined must be public, static or final
- Interfaces are implemented using implements keyword

Abstract Class:
- Definition: If a class has any methods that do not have body defined (un-implemented) then the 
method itself will be "Abstract" and by proxy the class will also be "Abstract".  
- Abstract Class can also have concrete methods (implemented).
- You cannot instantiate Abstract classes
- You cannot have private methods in Abstract Classes as they need to be exposed to 
inheritance.
- You can have protected methods in Abstract Classes
- Abstract classes are implemented using extends keyword.
- Can only extend class once

class A {
	int i = 10;
}

class B extends A {
	int i = 20;
} 

public class Lesson281 {

	public static void main(String[] args) {
	
		A a = new B();
		
		// Will print out 10
		System.out.println(MessageFormat.format("Implementation of a.i: {0} ", a.i));
		
		B b = new B();
		
		// Will print out 20
		System.out.println(MessageFormat.format("Implementation of b.i: {0} ", b.i));

	}