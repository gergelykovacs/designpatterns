Design Patterns
===============

**Simple implementations of GoF Design Patterns.**

Intention of the current repository is to collect the implementations of 
the patterns presented in the *Gang of Four* book through easy *(dummy)* examples.

Patterns are not miexed to work together as it would be in a real life situation like 
Strategy is commonly used with Factory and so on. The intention is to understand the key ideas behind 
the scenes. That is the reason why *Generics*, *Collections*, *Reflection API* or the other powerful Java 
tools and language features are tied to be avoided to let focus on the structure of the patterns themselves.

Eclipse is used for implementation hence DesignPatterns direcory can be imported to an Eclipse workspace. 
EGit is also used however it is not necessary at all.

In the default package `DesignPatterns/src/` there will be `Main*.java` named files *(so called wrappers for each 
of the patterns)* and in Eclips pick one, right-click on it and `Run As > Java Application` will execute it 
*(and check out the Console tab for output)*.

The language is used: *Java*

If a pattern is implemented it will be checked *(implemented: 14/23)*.

The *UML* diagram collection is available here: [GoF Design Pattern UMLs](https://www.evernote.com/shard/s391/sh/71a97ec4-a15d-4c1e-9b78-0cc32d5fced5/9108677f96380fe4074717d53f968be0 "GoF Design Pattern UMLs").

List of GoF patterns by types
-----------------------------

### Creational

*Creational patterns are ones that create objects for you, rather than having you instantiate objects directly. 
This gives your program more flexibility in deciding which objects need to be created for a given case.*

- [x] **Abstract Factory** groups object factories that have a common theme.
- [ ] **Builder** constructs complex objects by separating construction and representation.
- [x] **Factory Method** creates objects without specifying the exact class to create.
- [ ] **Prototype** creates objects by cloning an existing object.
- [x] **Singleton** restricts object creation for a class to only one instance.

### Structural

*These concern class and object composition. 
They use inheritance to compose interfaces and define ways to compose objects to obtain new functionality.*

- [x] **Adapter** allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
- [x] **Bridge** decouples an abstraction from its implementation so that the two can vary independently.
- [ ] **Composite** composes zero-or-more similar objects so that they can be manipulated as one object.
- [x] **Decorator** dynamically adds/overrides behaviour in an existing method of an object.
- [x] **Facade** provides a simplified interface to a large body of code.
- [ ] **Flyweight** reduces the cost of creating and manipulating a large number of similar objects.
- [ ] **Proxy** provides a placeholder for another object to control access, reduce cost, and reduce complexity.

### Behavioral

*Most of these design patterns are specifically concerned with communication between objects.*

- [x] **Chain Of Responsibility** delegates commands to a chain of processing objects.
- [x] **Command** creates objects which encapsulate actions and parameters.
- [ ] **Interpreter** implements a specialized language.
- [x] **Iterator** accesses the elements of an object sequentially without exposing its underlying representation.
- [ ] **Mediator** allows loose coupling between classes by being the only class that has detailed knowledge of their methods.
- [x] **Memento** provides the ability to restore an object to its previous state (undo).
- [x] **Observer** is a publish/subscribe pattern which allows a number of observer objects to see an event.
- [ ] **State** allows an object to alter its behavior when its internal state changes.
- [x] **Strategy** allows one of a family of algorithms to be selected on-the-fly at runtime.
- [x] **Template Method** defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
- [ ] **Visitor** separates an algorithm from an object structure by moving the hierarchy of methods into one object.

