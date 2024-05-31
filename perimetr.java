public class perimetr {
    public static void main(String[] args) {
        double x1 = 0, y1 = 0;
        double x2 = 1, y2 = 0;
        double x3 = 0, y3 = 1;
        System.out.println("Периментр треугольника: " + trianglePerimeter(x1, y1, x2, y2, x3, y3));
    }

    public static double segmentLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double trianglePerimeter(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = segmentLength(x1, y1, x2, y2);
        double b = segmentLength(x2, y2, x3, y3);
        double c = segmentLength(x3, y3, x1, y1);
        return a + b + c;
    }
}

