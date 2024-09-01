import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInteraction userInteraction = new UserInteraction();
        Calculator calculator = new Calculator();

        do {
            int[] sides = userInteraction.readSideLengthsForTriangle();
            String result = calculator.determineTriangleType(sides);

            System.out.println("Das Dreieck ist: " + result);

        } while (userInteraction.restart());

        System.out.println("Vielen Dank für die Nutzung!");
    }
}