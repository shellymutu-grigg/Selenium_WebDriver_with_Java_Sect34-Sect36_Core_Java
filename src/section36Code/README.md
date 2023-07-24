# Selenium_WebDriver_with_Java_Sect34-Sect36_Core_Java_Concepts Section 36

Set git remote:
git remote add origin https://github.com/shellymutu-grigg/Selenium_WebDriver_with
_Java_Sect34-Sect36_Core_Java_Concepts.git
	
Java Collections

	Lesson 314:
	## Differences between Arrays and ArrayLists:
	- Classes that implement List interface can duplicate values
	- Examples of implementation of List interface: ArrayList, LinkedList, Vector
	- Arrays have a fixed memory size that has to be defined
	- ArrayList can grow or shrink dynamically
	- Can insert and access any value at any index in an ArrayList
	
	Lesson 316:
	## Differences between List vs Set interface
	- Set will not allow duplicate values
	- Set cannot rely on new objects being added in a sequential order
	- HashSet TreeSet, LinkedHasSet implement the Set interface
	
	Lesson 320:
	## Differences between a HaspMap and a HashTable
	- HashMap is NOT synchronised and is nNOT threadsafe
	- HashTable IS synchronised and IS threadsafe
	- When to use a HashMap?: When your application is not implementing threads
	- When to use a HashTable?: When your application IS implementing threads
	- HashMap permits null values in keys and values
	- HashTable will not allow null values in keys or values
	- HashMap are able to be iterated through using its iterator.
	- HashTable is the only other class apart from Vector that uses an enumerator 
	  to iterate values of HashTable instead
	  
	Lesson 323:
	## OOPS Interview Questions
	### What are the core concepts of OOPS?
	- OOPS core concepts are;
		- Abstraction
		- Encapsulation
		- Polymorphism
		- Inheritance
		- Composition
		- Association
		- Aggregation

	### What is Abstraction?
	- Abstraction is an OOPS concept to construct the structure of the real world 
	  objects. During this construction only the general states and behaviors are 
	  taken and more specific states and behaviors are left aside for the implementers.

	### What is Encapsulation?
	- Encapsulation is an OOPS concept to create and define the permissions and 
	  restrictions of an object and its member variables and methods. A very simple 
	  example to explain the concept is to make the member variables of a class 
	  private and providing public getter and setter methods. Java provides four 
	  types of access level modifiers: public, protected, no modifier and private.

	### What is the difference between Abstraction and Encapsulation?
	- “Program to interfaces, not implementations” is the principle for Abstraction 
	  and “Encapsulate what varies” is the OO principle for Encapsulation.
	  Abstraction provides a general structure of a class and leaves the details for 
	  the implementers. Encapsulation is to create and define the permissions and 
	  restrictions of an object and its member variables and methods.
	  Abstraction is implemented in Java using interface and abstract class while 
	  Encapsulation is implemented using four types of access level 
	  modifiers: public, protected, no modifier and private.

	### What is Polymorphism?
	- Polymorphism is the occurrence of something in various forms. Java supports 
	  various forms of polymorphism like polymorphic reference variables, polymorphic 
	  method, polymorphic return types and polymorphic argument types.
	  e.g. 
	  class Animal {
	  	public void eat(){}
	  }
	  class Dog extends Animal {
	  	public void eat(){}
	  }
	  class Husky extends Dog {
	  	public void eat(){}
	  }
	  

	### What is Inheritance?
	- A subclass can inherit the states and behaviors of it’s super class is known 
	  as inheritance.

	### What is multiple inheritance?
	- A child class inheriting states and behaviors from multiple parent classes 
	  is known as multiple inheritance.

	### What is the diamond problem in inheritance?
	- In case of multiple inheritance, suppose class A has two subclasses B and C, 
	  and a class D has two super classes B and C.  If a method present in A is 
	  overridden by both B and C but not by D then from which class D will inherit 
	  that method B or C? This problem is known as diamond problem.

	### Why Java does not support multiple inheritance?
	- Java was designed to be a simple language and multiple inheritance introduces 
	  complexities like diamond problem. Inheriting states or behaviors from two 
	  different type of classes is a case which in reality very rare and it can be 
	  achieved easily through an object association.

	### What is Static Binding and Dynamic Binding?
	- Static or early binding is resolved at compile time. Method overloading is an 
	  example of static binding.

	  Dynamic or late or virtual binding is resolved at run time. Method overriding 
	  is an example of dynamic binding.

	### What is a Class?
	- A class is the specification or template of an object.

	### What is an Object?
	- Object is instance of class.  
	
	Lesson 324 
	## Java Interview Questions:
	### What is Runtime Polymorphism?
	- Runtime polymorphism or dynamic method dispatch is a process in which a call 
	  to an overridden method is resolved at runtime rather than at compile-time.

	  In this process, an overridden method is called through the reference variable 
	  of a super class.

	### What is the difference between abstraction and encapsulation?
	- Abstraction hides the implementation details whereas encapsulation wraps code 
	  and data into a single unit.

	### What is abstract class?
	- A class that is declared as abstract is known as abstract class. It needs to 
	  be extended and its method implemented. It cannot be instantiated.

	### Can there be any abstract method without abstract class?
	- No, if there is any abstract method in a class, that class must be abstract.

	### Can you use abstract and final both with a method?
	- No, because abstract method needs to be overridden whereas you can't override 
	final method.

	### Is it possible to instantiate the abstract class?
	- No, abstract class can never be instantiated.

	### What is interface?
	- Interface is a blueprint of a class that have static constants and abstract 
	  methods.It can be used to achieve fully abstraction and multiple inheritance.

	### Can you declare an interface method static?
	- No, because methods of an interface are abstract by default, and static and 
	  abstract keywords can't be used together.

	### Can an Interface be final?
	- No, because its implementation is provided by another class.

	### What is marker interface?
	- An interface that has no data member or method is known as a marker interface.
	  For example Serializable, Cloneable etc.

	### What is difference between abstract class and interface?
	- Abstract class	
	  1) An abstract class can have method body (non-abstract methods).	
	  2) An abstract class can have instance variables.	
	  3) An abstract class can have constructor.	
	  4) An abstract class can have static methods.	
	  5) You can extend only one abstract class.	

	- Interface
	  1) Interface have only abstract methods.
	  2) An interface cannot have instance variables.
	  3) Interface cannot have constructor.
	  4) Interface cannot have static methods.
	  5) You can implement multiple interfaces.
	  
	### Can we define private and protected modifiers for variables in interfaces?
	- No, they are implicitly public.

	### When can an object reference be cast to an interface reference?
	- An object reference can be cast to an interface reference when the object 
	  implements the referenced interface.
