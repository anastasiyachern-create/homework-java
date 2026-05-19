package Lesson4;

    public class MainAnimals {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Бобик");
            Dog dog2 = new Dog("Шарик");
            Cat cat1 = new Cat("Мурзик", 10);
            Cat cat2 = new Cat("Барсик", 15);
            Cat cat3 = new Cat("Снежок", 20);
            dog1.run(150);
            dog1.swim(5);
            cat1.run(100);
            cat1.swim(2);
            System.out.println();
            System.out.println("Животных: " + Animal.getAnimalCount());
            System.out.println("Собак: " + Dog.getDogCount());
            System.out.println("Котов: " + Cat.getCatCount());
            System.out.println();
            Plate plate = new Plate(30);
            plate.info();
            Cat[] cats = {cat1, cat2, cat3};
            for (Cat cat : cats) {
                cat.eat(plate);
            }
            System.out.println();
            plate.info();
            System.out.println();
            for (Cat cat : cats) {
                cat.info();
            }
            System.out.println();
            plate.addFood(20);
            plate.info();
        }
    }
