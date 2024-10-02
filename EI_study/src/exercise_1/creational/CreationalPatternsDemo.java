package exercise_1.creational;

import exercise_1.creational.factory.*;
import exercise_1.creational.singleton.*;

public class CreationalPatternsDemo {
    public static void runDemo() {
        System.out.println("Creational Patterns Demo");
        System.out.println("------------------------");
        
        demonstrateFactoryPattern();
        demonstrateSingletonPattern();
    }

    private static void demonstrateFactoryPattern() {
        System.out.println("\nFactory Pattern:");
        Document pdfDoc = DocumentFactory.createDocument("pdf");
        pdfDoc.create();

        Document wordDoc = DocumentFactory.createDocument("word");
        wordDoc.create();
    }

    private static void demonstrateSingletonPattern() {
        System.out.println("\nSingleton Pattern:");
        ConfigManager cm1 = ConfigManager.getInstance();
        cm1.setConfig("Config 1");

        ConfigManager cm2 = ConfigManager.getInstance();
        System.out.println("Config from cm2: " + cm2.getConfig());
    }
}