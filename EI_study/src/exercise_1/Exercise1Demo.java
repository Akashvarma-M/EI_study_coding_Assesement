package exercise_1;

import exercise_1.behavioral.BehavioralPatternsDemo;
import exercise_1.creational.CreationalPatternsDemo;
import exercise_1.structural.StructuralPatternsDemo;

public class Exercise1Demo {
    public static void main(String[] args) {
        System.out.println("Design Patterns Demo - Exercise 1");
        System.out.println("=================================");

        BehavioralPatternsDemo.runDemo();
        System.out.println();
        CreationalPatternsDemo.runDemo();
        System.out.println();
        StructuralPatternsDemo.runDemo();
    }
}