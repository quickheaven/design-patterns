#  Design Patterns using Java and Python
Design patterns review project.



# Java to Python OOP: Bridge the Gap for Java Developers
## 1. Introduction to Object-Oriented Programing Concepts

Class - a blueprint needed to create an object. Contains attributes and behaviors.\
Object - created from a class (instance of the class)
* Attributes - characteristics that describe an object
* Methods - operations that can be performed on the object.

Object variable - The variable used when creating an object (instance variable) \
Overloading - only available on Java not Python \
Encapsulation - The ability to hide the data stored in an object. \
Abstraction - Information hiding - details are hidden \
\
Inheritance \
Base class/superclass - A class from which another class inherits its attributes and behaviors \
Derived class/subclass - derived from a base class \
Is-a relationship \
Composition - has-a relationship \
Overriding methods - The ability of a subclass to re-implement a method inherit from a super class \
Polymorphism - Means "many forms". This feature allows the implementation to have the same method but behave differently depending which class is instantiated. Also referred as dynamic binding. \
Interfaces - only contains declaration of methods and properties. (Not supported on Python) \
Abstract classes - a base class where at least one method is not implemented. \
Method defines the behavior of an object that belongs to the class. \
Three types of methods: Constructors, Accessors, Modifiers. 

Class Design Principles
1. Design so that objects can interact with other objects.
2. Keep reuse in mind.
3. Keep the scope as minimal as possible.
4. Keep maintainability in mind.

Public
In Python all instance variables are public.

Private
In Python - encapsulation preference is indicated.
'__' - indicates the variable is private
Directly accessing this variables will result to error.

Objects Aid in Abstraction
An object is an instance of a class
In Python, the _init_() is used as the constructor of the class

Inheritance Design Principles
1. Design classes, methods/functions so that they can be inherited (extended).
2. Design interaction between parent and child using UML diagrams (association)
3. Design for simplicity - one functionality per class.

## 2. Class Design


Difference: Python and Java
Everything is an object \
There is a reserved word "__init__" to initialize class (dunder method)  \
Encapsulation is not strictly implemented (Object can directly access the instnace variables) \
There is no private reserved word. \
There is __ symbol that implements encapsulation but is not widely used. \
Every method in a class has a self-parameter as the first parameter \
There is no concept of overloaded methods of constructs. The compiler used the latest version of the method. \



## 3. Inheritance

Differences Implementing Inheritance: Python and Java
Python does not use extends as reserved word
class Sphere(Circle)

Python does not have super() method
ClassName.methodName()
super().methodName()

Abstract classes are implemented using decorator methods in Python; in Java they are implemented using abstract reserved word.

Python does not have interfaces; Java implements interface.
Python has multiple interfaces; Java supports only singular inheritance.

Method Resolution Order (MRO) multiple inheritance.

Implementation of Abstract classes:
from abc import ABC, abstractmethod
@abstractmethod
