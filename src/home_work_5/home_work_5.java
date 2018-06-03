package home_work_5;

public class home_work_5 {
    public static void main(String[] args) {
    Employee[] listEm = new Employee[5];

    listEm[0] = new Employee("Ivanov Ivan","director", "ivanov@company.com", 899,40 );
    listEm[1] = new Employee("Petrov Petr","accountant", "petrov@company.com", 700,34 );
    listEm[2] = new Employee("Sidorova Alexandra","CFO", "sidorov@company.com", 860,44 );
    listEm[3] = new Employee("Novikova Inna","developer", "novikova@company.com", 550,24 );
    listEm[4] = new Employee("Nikolaev Nikolay","senior developer", "nikolaev@company.com", 650,27 );

        for (Employee i: listEm){
            if (i.getAge()>=40) i.printData();
        }

    }

}
