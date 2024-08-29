import java.util.Scanner;

public class UserInteraction {

    private int[] sides = new int[3];

    public int[] readValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie drei Ganzzahlen zwischen 1 und 99 ein:");

        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.print("Geben Sie die Länge der Seite " + (i+1) + " ein: ");
                    int value = scanner.nextInt();
                    if (value >= 1 && value <= 99) {
                        sides[i] = value;
                        break;
                    } else {
                        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 99 ein.");
                    }
                } catch (Exception e) {
                    System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein."+ e.getMessage());
                    scanner.next();
                }
            }
        }
        return sides;
    }

    public String restart() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Möchten Sie ein weiteres Dreieck prüfen? (y/n): ");
        return scanner.next();
    }
}
