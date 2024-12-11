
import java.util.Scanner;

import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();

        while (true) {
            System.out.println("? ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("Quit")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                database.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                if (!database.addObservation(name)) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equalsIgnoreCase("All")) {
                database.printAll();
            } else if (command.equalsIgnoreCase("One")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                database.printOne(name);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
