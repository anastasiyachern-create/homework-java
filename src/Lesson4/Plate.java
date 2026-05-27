package Lesson4;

public class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("Еды в миске: " + food);
    }
}
