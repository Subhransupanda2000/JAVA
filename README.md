# JAVA
# constructor
* Constructor have same name that of class.
* Constructor do not have any return type.
* When no constructor is defined explicitly in the class, compiler implicitly provides no-argument constructor (no-arg constructor) in class.
* Constructor chaining - whenever the object of class is created, implicitly default no-arg constructor of class and its super class constructor is called.
  Q. But how constructor of superclass is called?
  A. Implicitly first statement of constructor is super(), [that means by default first statement of constructor super() is called, super() calls implicit/explicit no-arg 
  constructor of superclass].
* Instance variables cannot be accessed in constructor until superclass constructors have been called - Because, as mentioned in above point, superclass constructors are 
  called before constructor of class is executed.
* If superclass does not contain no-arg constructor but contain argument constructor.
  Than compiler won’t provide no-arg constructor. To avoid compilation error >
  Solution 1 > subclass must call super(argument) or
  Solution 2 > declare no-arg constructor explicitly.
* First line in constructor can either be super() or this(). But, super() and this() cannot be used in same constructor. (Please ensure that super() or this() whichever is 
  used must be be first line of constructor, else you will face compilation error)
  We read in above points that compiler implicitly adds super() as first line of constructor, but if we add this() explicitly than compiler doesn’t add super()

  Program to understand usage of this() and super() in constructor and also to show this() and super() cannot be used in same constructor 
* Constructor can use access modifiers like - private, protected and public. If no access modifier is defined than its default.
  private constructor can be used in Singleton classes where object of the class cannot be created outside class.
  class with protected constructor cannot be instantiated in other package. Though constructor can be called through inheritance.
* Constructor is not a keyword in java.
* Interface does not have constructor in java.
  Constructors are never inherited and hence cannot be overridden.
* Constructors can be overloaded.
* Abstract class also have constructor, and those constructors are called when object of concrete subclass is created, because abstract class cannot be instantiated directly.
* If constructor throws >
  RuntimeException/unchecked - Its fine even if not handled.

  CompileTime/checked Exception - It must be caught at time of object creation, or method in which object is created must throw appropriate Exception.
# static variable
* static variables are also known as class variables.
* We need not to create instance of class for accessing static variables.
* static variables will remain same for different instance/objects of class but for every new object instance variables will be initialized to new value.
* Static variables can be used inside constructor.
* Static variables are not serialized in java.
* It's important to know that only the static variables and their values (primitives or references) are stored in PermGen space.
* If static variable is a reference to an object that which is stored in the normal sections of the heap (string pool, young/old generation or survivor space). Those objects 
  are not stored in PermGen space.
* We must use ClassName.staticVariableName
# static method
* 





