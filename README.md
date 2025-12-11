# 🌊 Java Lambdas & Streams API

## 📄 Description
This repository contains a set of practical Java exercises designed to master **Functional Programming** features introduced in Java 8. The goal is to write code that is concise, expressive, and declarative using **Lambda Expressions** and the **Streams API**.

These exercises focus on transforming, filtering, and sorting collections efficiently, moving away from traditional imperative loops toward a modern functional approach.



### 🧠 Key Concepts
The exercises rely heavily on the `java.util.function` package. You will practice using:
* **`Consumer<T>`**: Accepts an argument and returns nothing (e.g., printing).
* **`Supplier<T>`**: Accepts nothing but returns a result (e.g., lazy generation).
* **`Function<T, R>`**: Transforms input `T` to output `R`.
* **`Predicate<T>`**: Evaluates a condition on `T` and returns a boolean (used for filtering).

## 📚 Exercise Details

### Level 1: Lambdas & Streams Basics
The objective is to become fluent with Lambda syntax and basic Stream operations.

**Exercises 1 & 2: Filtering**
* Given a list of Strings, implement a method to return a list containing only strings with the letter **'o'**.
* Extend the previous logic to filter strings that contain **'o'** AND have **more than 5 letters**.

**Exercises 3 & 4: Iteration & Method References**
* Create a list with the months of the year.
* Print all elements using a **Lambda Expression**.
* Print all elements using a **Method Reference** (`System.out::println`).

**Exercises 6 & 7: Sorting**
* Create a list containing numbers and text strings.
* Sort the list by string length: **Shortest to Longest**.
* Sort the list in reverse: **Longest to Shortest**.

**Exercises 5 & 8: Custom Functional Interfaces**
* **Pi Value:** Create a Functional Interface with a method `getPiValue()`. Instantiate it to return `3.1415` and print the result.
* **String Reverser:** Create a Functional Interface with a method `reverse()`. Inject the logic via a Lambda to return a reversed string (e.g., "Java" -> "avaJ") and test it.

### Level 2: Functional Data Manipulation
The goal is to perform complex transformations, arithmetic operations, and chained stream processing.

**Exercise 1: Specific Filtering**
* Create a list of proper names.
* Return a list of strings that start with **'A'** (uppercase) and have exactly **3 letters**.

**Exercise 2: Mapping & Formatting**
* Process a list of `Integers`.
* Return a single String with elements separated by commas.
* **Logic:** Prepend "e" if the number is even, and "o" if it is odd (e.g., `[3, 44]` becomes `"o3, e44"`).

**Exercise 3: Arithmetic Functional Interface**
* Create an interface with a method `operation()` returning a `float`.
* Implement this interface using Lambdas to perform **Addition**, **Subtraction**, **Multiplication**, and **Division**.

**Exercise 4: Complex Stream Chain**
* Create a list containing mixed strings and numbers (as Strings).
* Perform the following operations:
    1.  **Sort** alphabetically by the first character.
    2.  **Sort** so that strings containing "e" appear first.
    3.  **Map/Modify:** Replace all occurrences of 'a' with '4'.
    4.  **Filter:** Display only the elements that are numeric.

## 💻 Technologies Used
* **Java 21** - Core language.
* **java.util.stream** - For data processing pipelines.
* **java.util.function** - For functional interfaces.
* **IDE** (IntelliJ IDEA / Eclipse) - Development environment.
* **Git** - Version control.

## 📋 Requirements
* **Java SDK 1.8** or higher (Java 17+ recommended).
* Basic understanding of:
    * Java Interfaces.
    * Collections (`List`, `ArrayList`).
    * The difference between Imperative (Loops) and Declarative (Streams) programming.

## 🛠️ Installation
1.  Clone this repository:
    ```bash
    git clone https://github.com/federicopratico/1.8-Lambdas_and_Streams-Level2.git
    ```
    or with SSH:
    ```bash
    git clone git@github.com:federicopratico/1.8-Lambdas_and_Streams-Level2.git
    ```

2.  Navigate to the project directory:
    ```bash
    cd 1.8-Lambdas_and_Streams-Level2
    ```
3.  Open the project in your preferred IDE.

## 🚀 Execute
Each level is separated into its own package. To run the exercises:

1.  **Compile the project** using your IDE or terminal.
2.  **Run Level 1:**
    Find the `Main` class in the `Level1` package. This will execute the basic sorting, filtering, and Pi calculation exercises.
3.  **Run Level 2:**
    Find the `Main` class in the `Level2` package. This will trigger the advanced stream chaining and arithmetic operations.

## 🤝 Contributions
Contributions are welcome! If you find a bug or want to add a new complexity level:

1.  **Fork** the repository.
2.  Create a **branch** for your feature:
    ```bash
    git checkout -b feature/NewStreamExercise
    ```
3.  **Commit** your changes:
    ```bash
    git commit -m "feat: Added reduce operation example"
    ```
4.  **Push** to the branch:
    ```bash
    git push origin feature/NewStreamExercise
    ```
5.  Open a **Pull Request**.
