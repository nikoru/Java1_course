package home_work_3;

import java.util.Random;
import java.util.Scanner;

public class home_work_3 {

    public static void main(String[] args) {
        System.out.println("----task 1-----");
        guessNumber();
        System.out.println("----task 2-----");
        guessWord();
    }

//        Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
//        попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
//        указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
//        выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    private static void guessNumber() {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int inValue;
        boolean isWin = false;
        boolean toBeContinued = true;

        while (toBeContinued){
            int target = rand.nextInt(9)+1;
            for (int i = 0; i < 3 ; i++) {
                System.out.println("Введите число. Это попытка № - " + (i+1));
                inValue = sc.nextInt();

                if (inValue == target) {
                    System.out.println(":-) Вы угадали!. Загаданное число - " + target);
                    isWin = true;
                    break;
                }

                if (inValue < target) {
                    System.out.println("Загаданное число больше ;-) ");
                } else {
                    System.out.println("Загаданное число меньше ;-) ");
                }

            }

            if (!isWin) {
                System.out.println("Увы :-( Попытки кончились!. Загаданное число - " + target);
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            inValue = sc.nextInt();
            switch (inValue){
                case 1 :
                    toBeContinued = true;
                    break;
                case 2 :
                    toBeContinued = false;
                    break;
                default :
                    toBeContinued = false;
            }
        }
    }


//    Создать массив из слов
//    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если
//    слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//    apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно, можно пользоваться:
//    String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгад

    private static void guessWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        String inWord;
        Random rand = new Random();
        String target = words[rand.nextInt(words.length)];

        while (true){
            System.out.println("Введите слово");
            inWord = sc.nextLine();

            if (inWord.equals(target)){
                System.out.println("Вы угадали слово - " + target);
                break;
            }

            for (int i = 0; i < 15 ; i++) {
                if (i >= inWord.length() | i >= inWord.length()) System.out.print("#");
                else if (inWord.charAt(i) == target.charAt(i)) System.out.print(inWord.charAt(i));
                    else System.out.print("#");
            }
            System.out.println(" ");
        }

    }
}
