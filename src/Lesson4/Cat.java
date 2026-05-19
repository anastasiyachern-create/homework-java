package Lesson4;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety;
    private int appetite;
    public Cat(String name, int appetite) {
        super(name, 200, 0);
        this.appetite = appetite;
        this.satiety = false;
        catCount++;
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satiety = true;
            System.out.println(name + " покушал.");
        } else {
            System.out.println(name + " не смог покушать.");
        }
    }
    public void info() {
        System.out.println("Кот: " + name + ", сытость: " + satiety);
    }
    public static int getCatCount() {
        return catCount;
    }
}