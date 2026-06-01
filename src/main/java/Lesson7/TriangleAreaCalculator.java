package Lesson7;

public class TriangleAreaCalculator {
    public double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Стороны должны быть > 0");
        }
        return 0.5 * base * height;
    }
}
