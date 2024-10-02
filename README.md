Overview
This repository contains two programming exercises implemented in Java, focusing on design patterns and building a console-based application for managing a smart office facility.## Exercise 1: Design Patterns Demonstration

This exercise implements six different software design patterns, demonstrating their use through various practical scenarios:

### Behavioral Patterns

1. **Observer Pattern**
   - Use Case: Weather Station System
   - Description: Implements a weather station that notifies multiple display units when weather data changes.
   - Key Components: `WeatherData` (Subject), `WeatherObserver` (Observer interface), `CurrentConditionsDisplay` (Concrete Observer)

2. **Strategy Pattern**
   - Use Case: Payment Processing System
   - Description: Allows dynamic selection of payment methods in an e-commerce application.
   - Key Components: `PaymentStrategy` (Strategy interface), `CreditCardPayment` and `PayPalPayment` (Concrete Strategies), `PaymentContext` (Context)

### Creational Patterns

3. **Singleton Pattern**
   - Use Case: Configuration Manager
   - Description: Ensures a single instance of the configuration manager throughout the application.
   - Key Component: `ConfigManager` (Singleton)

4. **Factory Pattern**
   - Use Case: Document Creator
   - Description: Creates different types of documents (PDF, Word) without specifying their exact classes.
   - Key Components: `Document` (Product interface), `PDFDocument` and `WordDocument` (Concrete Products), `DocumentFactory` (Factory)

### Structural Patterns

5. **Adapter Pattern**
   - Use Case: Legacy User System Integration
   - Description: Adapts a legacy user system to work with a new user interface.
   - Key Components: `User` (Target interface), `LegacyUser` (Adaptee), `LegacyUserAdapter` (Adapter)

6. **Decorator Pattern**
   - Use Case: Coffee Ordering System
   - Description: Dynamically adds additional ingredients (milk, sugar) to a base coffee order.
   - Key Components: `Coffee` (Component interface), `SimpleCoffee` (Concrete Component), `CoffeeDecorator` (Decorator), `Milk` and `Sugar` (Concrete Decorators)

Each pattern is implemented in Java, demonstrating how these design principles can be applied to solve common software design problems and improve code flexibility, maintainability, and reusability.

Exercise 2: Smart Office Facility Programming
This console-based application allows users to manage a smart office facility with the following functionalities:

Configure Meeting Rooms: Users can specify the number of meeting rooms in the facility.
Room Booking: Users can book and cancel bookings for conference rooms.
Occupancy Detection: The system detects occupancy using sensors, requiring at least two people to occupy a room.
Automatic Booking Release: Unoccupied rooms automatically release their bookings if not occupied within 5 minutes.
AC and Lights Control: The system automatically turns off air conditioning and lights when a room is unoccupied.
