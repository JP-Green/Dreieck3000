public class Main {
    public static void main(String[] args) {

        UserInteraction userInteraction = new UserInteraction();
        Calculator calculator = new Calculator();
        boolean repeat;
        
        do {
            int[] sides = userInteraction.readSideLengthsForTriangle();

            String result = calculator.determineTriangleType(sides);

            System.out.println("Das Dreieck ist " + result);

            repeat = userInteraction.restart();

        } while (repeat);

        System.out.println("Vielen Dank für die Nutzung!");

    }
}