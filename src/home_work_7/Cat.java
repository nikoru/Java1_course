package home_work_7;

public class Cat {
    public String getName() {
        return name;
    }

    private String name;
    private int appetite;

    public boolean isFullness() {
        return fullness;
    }

    private boolean fullness;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    public void eat(Plate p) {
        if (p.getFood()>appetite) {
            p.decreaseFood(appetite);
            fullness = true;
        }
        else {
            fullness = false;
        }
    }
}