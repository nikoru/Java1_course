package home_work_6;

public class Animal {
    protected String name;
    protected int runLimit;
    protected float jumpLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, float jumpLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    public Animal(String name, int runLimit){
        this.name = name;
        this.runLimit = runLimit;
    }

    public boolean run(int distance){
        if (this.runLimit >= distance) {
            System.out.println("run:true");
            return true;
        }
        else {
            System.out.println("run:false");
            return false;
        }
    }

    public boolean swim(int distance){
        if (this.swimLimit >= distance) {
            System.out.println("swim:true");
            return true;
        }
        else {
            System.out.println("swim:false");
            return false;
        }
    }

    public boolean jump(float height){
        if (this.jumpLimit >= height) {
            System.out.println("jump:true");
            return true;
        }
        else {
            System.out.println("jump:false");
            return false;
        }
    }
}
