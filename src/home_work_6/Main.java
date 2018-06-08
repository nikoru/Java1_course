package home_work_6;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        Cat cat1;
        Dog dog1, dog2, dog3;

        animal = new Animal("Horse", 1000, 0.3f, 100);
        animal.jump(0.5f);

        cat1 = new Cat("Barsik");
        cat1.swim(1);

        dog1 = new Dog("Luke");
        dog2 = new Dog("Pit", 400);
        dog3 = new Dog("Hek", 600);

        dog1.run(505);
        dog2.run(450);
        dog3.run(550);

    }
}
