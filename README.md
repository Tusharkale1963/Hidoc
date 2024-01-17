# Compiling and Running a Java Class from the Command Line

This guide provides step-by-step instructions on how to compile and run a Java class using the command line.

## Prerequisites

Before you begin, ensure that you have Java Development Kit (JDK) installed on your system. You can download it from the official Oracle website or use an open-source alternative like OpenJDK.

## Compilation

1. Open a terminal or command prompt.

2. Navigate to the directory containing your Java source file (`YourClass.java`).

3. Use the `javac` command to compile the Java source file. Replace `YourClass.java` with the actual name of your Java source file.

    ```bash
    javac YourClass.java
    ```

   This command will generate a bytecode file (`YourClass.class`) if there are no compilation errors.

## Running the Compiled Java Program

1. Once the compilation is successful, use the `java` command to run the compiled Java program. Again, replace `YourClass` with the actual name of your class (without the `.class` extension).

    ```bash
    java YourClass
    ```

   This command executes the `main` method in the specified class.

## Example

Suppose you have a Java source file named `HelloWorld.java` containing the following code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
 
javac HelloWorld.java

java HelloWorld




