package home_work_7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
 //       plate.info();
        cat.eat(plate);
 //       plate.info();

        Plate plate2 = new Plate(50);

        Cat[] cats = new Cat[5];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(("Barsik"+i), 20);
            cats[i].eat(plate2);
            if (cats[i].isFullness()) System.out.println(cats[i].getName()+ " Сыт");
            else System.out.println(cats[i].getName()+ " Голоден");
        }
        plate2.info();
    }
}
