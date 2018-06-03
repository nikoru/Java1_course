package home_work_5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private float salary;
    private int age;

    public Employee(String fio, String position, String email, float salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }
    public void printData(){
        System.out.println("Сотрудник: " + fio + " Позиция: " + position + " email: " + email + " ЗП:" + salary + " Возраст:" + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
