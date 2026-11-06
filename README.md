# WorkoutSessionVisitor

## Description
This project demonstrates the Visitor design pattern in Java.
It is designed to analyze different types of workout exercises
without changing their original classes.

## Project Components

### Elements
- Exercise — interface that declares the accept() method.
- StrengthExercise — represents strength exercises.
- CardioExercise — represents cardio exercises.

### Visitors
- ExerciseVisitor — interface that declares visit methods
  for each exercise type.
- CalorieCalculatorVisitor — calculates estimated calories
  burned during exercises.
- WorkoutReportVisitor — displays detailed information
  about each exercise.

## How It Works
The Main class creates a collection of strength and cardio exercises.

Each exercise accepts a Visitor through the accept() method.
The concrete element calls the matching visit method,
passing itself as an argument.

This mechanism is called Double Dispatch.
It allows different operations to be performed on the same
objects without using instanceof or modifying element classes.

## Clean Code Principles
- Meaningful names for classes and methods.
- Single Responsibility Principle.
- Encapsulation through private fields.
- No instanceof type-checking chains.
- Open/Closed Principle: new visitors can be added
  without modifying existing element classes.

## Technologies
- Java
- IntelliJ IDEA
- Git and GitHub

## How to Run
Run the Main.java file to see the calorie calculations
and workout reports for all exercises.
