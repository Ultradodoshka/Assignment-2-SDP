import app.DeliveryApplication;
import gui.GUIFactory;
import gui.macOS.MacOSFactory;
import gui.windows.WindowsFactory;
import transport.Logistics;
import transport.RoadLogistics;
import transport.SeaLogistics;

import java.util.Scanner;

public class Main {
    private static Logistics configuredLogistics(String mode){
        switch (mode){
            case "ROAD":
                return new RoadLogistics();
            case "SEA":
                return new SeaLogistics();
        }
        return null;
    }

    private static GUIFactory configuredGUIFactory(String mode){
        switch (mode){
            case "WINDOWS":
                return new WindowsFactory();
            case "MACOS":
                return new MacOSFactory();
        }
        return null;
    }

    private static boolean isValid(String mode, String platform) {
        boolean isModeValid = "ROAD".equals(mode) || "SEA".equals(mode);
        boolean isPlatformValid = "WINDOWS".equals(platform) || "MACOS".equals(platform);
        if (!isModeValid && !isPlatformValid) {
            System.out.println("Error: Unsupported delivery mode and unsupported platform.");
            return false;
        } else if (!isModeValid) {
            System.out.println("Error: Unsupported delivery mode with a valid platform.");
            return false;
        } else if (!isPlatformValid) {
            System.out.println("Error: Unsupported platform with a valid delivery mode.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Delivery mode (write ROAD or SEA): ");
        String mode = input.nextLine().trim().toUpperCase();
        System.out.print("Your platform (write WINDOWS or MACOS): ");
        String platform = input.nextLine().trim().toUpperCase();
        if (!isValid(mode, platform)) {
            return;
        }
        Logistics logistics = configuredLogistics(mode);
        GUIFactory guiFactory = configuredGUIFactory(platform);
        DeliveryApplication deliveryApplication = new DeliveryApplication(guiFactory, logistics);

        System.out.print("Enter cargo: ");
        String cargo = input.nextLine();
        System.out.print("Enter destination: ");
        String destination = input.nextLine();


        System.out.println();
        System.out.println("Delivery mode: " + mode);
        System.out.println("UI platform: " + platform);
        deliveryApplication.launch(cargo, destination);
    }
}