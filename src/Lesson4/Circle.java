package Lesson4;

public class Circle extends FigureColor implements Figure {

    private double radius;

        public Circle(double radius, String fillColor, String borderColor) {
            super(fillColor, borderColor);
            this.radius = radius;
        }
        @Override
        public double getArea() {

            return Math.PI * radius * radius;
        }
        @Override
        public double getPerimeter() {

            return 2 * Math.PI * radius;
        }
    }
