# Java Optional Input Check

This is a simple Java program that demonstrates how to use `Optional` for input validation.  
It asks the user to enter their name, ensures the input is not empty, and prints it.  
If the user presses Enter without typing anything, an error message is shown and the program keeps asking until a valid name is entered.

## Features
- Uses `Optional` to handle empty input safely.
- Validates mandatory input using a `do-while` loop.
- Demonstrates practical use of `Optional.ofNullable()`.

## How to Run
```bash
javac print.java
java print
