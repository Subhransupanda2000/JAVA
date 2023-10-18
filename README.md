# JAVA
# constructor
* Constructor have same name that of class.
* Constructor do not have any return type.
* When no constructor is defined explicitly in the class, compiler implicitly provides no-argument constructor (no-arg constructor) in class.
* Constructor chaining - whenever the object of class is created, implicitly default no-arg constructor of class and its super class constructor is called.
  Q. But how constructor of superclass is called?
  A. Implicitly first statement of constructor is super(), [that means by default first statement of constructor super() is called, super() calls implicit/explicit no-arg constructor of superclass].
* Instance variables cannot be accessed in constructor until superclass constructors have been called - Because, as mentioned in above point, superclass constructors are called before constructor of class is executed.
* If superclass does not contain no-arg constructor but contain argument constructor.
Than compiler won’t provide no-arg constructor. To avoid compilation error >
Solution 1 > subclass must call super(argument) or
Solution 2 > declare no-arg constructor explicitly.
* First line in constructor can either be super() or this(). But, super() and this() cannot be used in same constructor. (Please ensure that super() or this() whichever is used must be be first line of constructor, else you will face compilation error)
We read in above points that compiler implicitly adds super() as first line of constructor, but if we add this() explicitly than compiler doesn’t add super()

Program to understand usage of this() and super() in constructor and also to show this() and super() cannot be used in same constructor 
