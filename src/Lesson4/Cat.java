package Lesson4;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        this.satiety = false;
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Plate plate, int foodAmount) {
        if (plate.decreaseFood(foodAmount)) {
            satiety = true;
            System.out.println(name + " покушал "  + foodAmount + " еды.");
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