package org.example;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, Checkstyle!");
    }

    // Intentional Checkstyle violations:
    // 1. Missing Javadoc comment for the class
    // 2. Missing Javadoc comment for the main method
    // 3. System.out.println should be avoided in favor of a logger
}
