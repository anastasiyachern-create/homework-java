package Lesson4;

public class MainFigures {public static void main(String[] args) {
    Figure circle = new Circle(5, "Красный", "Черный");
    Figure rectangle = new Rectangle(
            4,
            6,
            "Синий",
            "Белый"
    );
    Figure triangle = new Triangle(
            3,
            4,
            5,
            "Зеленый",
            "Желтый"
    );
    circle.printInfo();
    rectangle.printInfo();
    triangle.printInfo();
}
}

