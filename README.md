# Creational Design Patterns in Java

This repository contains comprehensive examples and explanations of the Creational Design Patterns as described in the Gang of Four (GoF) book "Design Patterns: Elements of Reusable Object-Oriented Software". The creational patterns covered are:

- Factory Method
- Abstract Factory
- Builder
- Prototype
- Singleton

Each pattern is implemented with practical, real-world examples to demonstrate their applicability and benefits in software development.

## Table of Contents

1. Introduction
2. Patterns
   a. Factory Method
   b. Abstract Factory
   c. Builder
   d. Prototype
   e. Singleton
3. Getting Started
4. Contributing

## Introduction

Creational Design Patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code. They abstract the instantiation process, making a system independent of how its objects are created, composed, and represented.

## Patterns

### 1. Factory Method

Purpose: Defines an interface for creating an object but lets subclasses decide which class to instantiate.

Use Case: When a class can't anticipate the class of objects it needs to create.

Example: `Vehicle Factory`
A VehicleFactory that creates different types of vehicles based on input parameters.

- Product Interface: `Vehicle`
- Concrete Products: `Car`, `Bike`, `Truck`
- Factory Class: `VehicleFactory`

Benefits:

- Loose Coupling: Eliminates the need to bind application-specific classes into your code.
- Scalability: New vehicle types can be added with minimal changes.

Location in Codebase: See the `FactoryMethodPattern` directory for the full implementation.

### 2. Abstract Factory

Purpose: Creates families of related or dependent objects without specifying their concrete classes.

Use Case: When a system needs to be independent of how its products are created, composed, and represented.

Example: Cross-Platform GUI Components
Creating GUI components for different operating systems (Windows, macOS).

- Abstract Products: `Button`, `Checkbox`
- Concrete Products:
  - Windows: `WindowsButton`, `WindowsCheckbox`
  - macOS: `MacButton`, `MacCheckbox`
- Abstract Factory: `GUIFactory`
- Concrete Factories: `WindowsFactory`,

Benefits:

- Consistency: Ensures that products of a family are used together.
- Ease of Exchange: Makes swapping product families easy.

Location in Codebase: See the `AbstractFactoryPattern` directory for the full implementation.

### 3. Builder

Purpose: Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.

Use Case: When creating complex objects step by step is necessary.

Example: Meal Ordering System
Building a `Computer` component system

Product: `Computer component`
Builder: `Computer.Builder`

Benefits:

- Control: Provides finer control over the construction process.
- Flexibility: Allows for the creation of different representations of an object.

Location in Codebase: See the `BuilderPattern` directory for the full implementation.

### 4. Prototype

Purpose: Creates new objects by copying an existing object, known as the prototype.

Use Case: When the cost of creating a new object is expensive or complicated.

Example: Shape Cloning System
Cloning shapes like `Circle` and `Rectangle`.

Prototype Interface: `Shape`
Concrete Prototypes: `Circle`, `Rectangle`
Prototype Manager: `ShapeCache`

Benefits:

- Performance: Reduces the need for expensive object creation.
- Simplicity: Hides the complexities of creating new instances.

Location in Codebase: See the `PrototypePattern` directory for the full implementation.

### 5. Singleton

Purpose: Ensures a class has only one instance and provides a global point of access to it.

Use Case: When exactly one instance of a class is needed to coordinate actions across the system.

Example: Configuration Manager
A `Singleton` class that manages configuration settings.

Benefits:

- Controlled Access: Ensures only one instance is used.
- Namespace Management: Avoids the use of global variables.

Location in Codebase: See the `SingletonPattern` directory for the full implementation.

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Installation and Running

1. Clone the repository:
   ```bash
   git clone https://github.com/Amotekun/java-design-patterns
   ```

2. Navigate to the project directory:
   ```bash
   cd java-design-patterns
   ```

3. Build the project:
   ```bash
   mvn clean compile
   ```

4. Run all design pattern examples:
   ```bash
   mvn exec:java
   ```

5. Run specific pattern examples:
   ```bash
   # Run only creational patterns
   mvn exec:java -Dexec.mainClass="creationdesignpattern.singleton.SingletonApp"
   
   # Run only factory method patterns
   mvn exec:java -Dexec.mainClass="creationdesignpattern.factormethod.inheritance.with_interface.InheritanceWithInterfaceApp"
   ```

6. Run tests:
   ```bash
   mvn test
   ```

### IDE Setup
- **IntelliJ IDEA**: Import as Maven project
- **Eclipse**: Import as existing Maven project
- **VS Code**: Install Java Extension Pack and open the project folder

## Contributing

Contributions are welcome! If you'd like to enhance the examples or add new patterns:

- Fork the repository.
- Create a new branch: `git checkout -b feature/YourFeature`
- Commit your changes: `git commit -m 'Add some feature'`
- Push to the branch: `git push origin feature/YourFeature`
- Open a Pull Request.

## Additional Resources

- **Design Patterns:** \*Elements of Reusable Object-Oriented Software by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides
- **Refactoring Guru - Design Patterns:** [here] (https://refactoring.guru/design-patterns)
- **Oracle Java Documentation:** [here] (https://docs.oracle.com/javase/tutorial/)

`Note`: This repository currently focuses on `Creational Design Patterns`. Future updates will include `Structural` and `Behavioral Design Patterns`. Stay tuned!
