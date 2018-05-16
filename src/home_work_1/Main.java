package home_work_1;

public class Main {

    public static void main(String[] args) {
	    int a = 0;
	    long k = 19999999;
	    float b = 1.0f;
	    double c = 90000012d;
	    char ch ='a';
	    boolean isTrue = false;
	    byte exByte = 123;
	    short sh = 100;

	    //Homework tests
		a = calculation(1,3,10,5);
		System.out.println(a);

		isTrue = check_sum(4,3);
		System.out.println(isTrue);

		printSignOfInteger(6);

		isTrue = isNegative(1);
		System.out.println(isTrue);

		helloMate("Николай");

		isIntercalary(2100);
    }

    public static int calculation(int a, int b, int c, int d){
    	return a*(b+(c/d));
	}

	public static boolean check_sum(int a, int b){
    	if ((a+b>=10) && (a+b<=20)){
    		return true;
		} else return false;
	}

	public static void printSignOfInteger(int a){
    	if (a>=0){
    		System.out.println(a + " -число положительное");
		} else System.out.println(a + " -число отрицательное");
	}

	public static boolean isNegative(int a){
    	if (a<0) return true;
    	else return false;
	}

	public static void helloMate(String name){
    	System.out.println("Привет,"+name+"!");
	}

	public static void isIntercalary(int year){
    	if (year<0) System.out.println("Неверно введен год");
    	else if (year%4==0){
    		if ((year%100==0)&&(year%400!=0)) System.out.println(year +"- год НЕ високосный");
    		else System.out.println(year +"- год високосный");
		} else System.out.println(year +"- год НЕ високосный");
	}
}
