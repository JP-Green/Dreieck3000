import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserInteraction userInteraction = new UserInteraction();
        Calculator calculator = new Calculator();
        String repeat;
        
        do {
            int[] sides = userInteraction.readValues();

            String result = calculator.determineTriangleType(sides);

            System.out.println("Das Dreieck ist " + result);

            repeat = userInteraction.restart();

        } while (repeat.equalsIgnoreCase("y"));

        System.out.println("Vielen Dank für die Nutzung!");

    }
}