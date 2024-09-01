public class Calculator {
    public String determineTriangleType(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        if ((a + b <= c)
                || (a + c <= b)
                || (b + c <= a)) {
            return "kein Dreieck";
        }

        if (a == b && b == c) {
            return "ein gleichseitiges Dreieck";
        } else if (a == b || b == c || a == c) {
            return "ein gleichschenkliges Dreieck";
        } else {
            return "ein unregelmäßiges Dreieck";
        }
    }
}

