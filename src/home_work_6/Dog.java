package home_work_6;

public class Dog extends Animal {
    public Dog(String  name){
        super(name, 500, 0.5f, 10);
    }

    public Dog(String name, int runLimit){
        super(name, runLimit);
    }
}
