# Logistics Application (Assignment 2)

## Purpose of the Project
This project is a Java console application that demonstrates the implementation and integration of the **Factory Method** and **Abstract Factory** design patterns. 
The application simulates a logistics system capable of planning road and sea deliveries while rendering a user interface matching the specified OS platform (Windows or macOS). It allows the independent combination of any delivery mode and UI platform without modifying the source code.

## Prerequisites
- **Java Development Kit (JDK):** Version 17 is strictly required.
- **IDE (Optional):** IntelliJ IDEA, Eclipse, or any other Java IDE.
- **Terminal/Command Prompt:** To run the compiled `.class` files.

## Package Structure
The project is organized into clear domain packages:
- `Default Package (src root)`: Contains the entry point (`Main.java`) with input validation and startup logic.
- `app`: Contains the client logic (`DeliveryApplication.java`) that combines both patterns.
- `transport`: Contains the **Factory Method** implementation. It includes the `Transport` interface, concrete products (`Truck`, `Ship`), the abstract creator (`Logistics`), and concrete creators (`RoadLogistics`, `SeaLogistics`).
- `gui`: Contains the base **Abstract Factory** interfaces (`GUIFactory`, `Button`, and `CheckBox`).
  - `gui.macOS`: Contains the macOS concrete implementations (`MacOSFactory`, `MacOSButton`, `MacOSCheckBox`).
  - `gui.windows`: Contains the Windows concrete implementations (`WindowsFactory`, `WindowsButton`, `WindowsCheckBox`).

## Build and Run Instructions

### Using Command Line (Terminal)
1. Open your terminal and navigate to the `src` folder of your project (where `Main.java` is located).
2. Compile the Java files using the following command:
   ```bash
   javac Main.java app/*.java gui/*.java gui/macOS/*.java gui/windows/*.java transport/*.java
