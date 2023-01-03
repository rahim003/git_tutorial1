import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Session5 {
    public static void main(String[] args) {

        //♦♦TASK2♦♦
        //♦♦TASK2♦♦
        //♦♦TASK2♦♦
//        2. Напишите класс, который генерирует 20 рандомных целых чисел
//        из диапазона -50 до +50, и определяет наименьшее число и
//        наибольшее число.
//        ☻☻☻☻
//        Random random = new Random();
//        int min = 0;
//        int max = 0;
//        for (int i = 0; i < 20; i++) {
//            int summa = random.nextInt(-50, 50);
//            System.out.print(summa + " ");
//            if (min > summa) {
//                min= summa;
//            } else {
//                max=Math.max(max,summa);
//            }
//        }
//        System.out.println();
//        System.out.println("min number" + min);
//        System.out.println("max number" + max);

        //TASK3
        //TASK3
        //TASK3
        //☺☻☻☺☺☺
        //Напишите класс, который принимает с консоли для переменной X
        //целое положительное число, а затем дополнительно будет
        //спрашивать ещё числа, эти числа будут должны вычитаться из
        //переменной x, вы будете вводить числа до тех пор пока X не будет
        //отрицательным или равен 0.
        //☺☺☺☺☺☺☺☺
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Write number one");
//            int numberOne = scanner.nextInt();
//            System.out.println("Write number two");
//            int numberTwo = scanner.nextInt();
//            int counter = numberOne - numberTwo;
//            if (counter < 0) {
//                System.out.println("number in Zero");
//                break;
//            }
//
//        }
        //☺☺☺☺
        //TASK4
        //Напишите класс, который принимает с клавиатуры две
        //переменный это два числа, пока не будет введено две одинаковых
        //чисел.
        //Класс должен выводить на экран сумму всех первых чисел и сумму
        //всех вторых чисел (не считая чисел, введенных одинаковыми).
//        Scanner scanner = new Scanner(System.in);
//        int countNumberOne = 0;
//        int countNumberTwo = 0;
//        while (true) {
//            System.out.print("Write numberOne  :");
//            int numberOne = scanner.nextInt();
//            System.out.print("Write numberTwo  :");
//            int numberTwo = scanner.nextInt();
//            countNumberOne += numberOne;
//            countNumberTwo += numberTwo;
//            if (numberOne == numberTwo) {
//                System.out.printf("Result summa numberOne %d:", countNumberOne);
//                System.out.printf("Result summa numberOne %d:", countNumberTwo);
//                break;
//            }
//
//        }
        //☺☺☺☺☺☺
        //TASK 5
        //TASK 5
        //TASK 5
        //☺1☺☺☺1☺
        //Напишите класс, который принимает с клавиатуры целое число
        //любой длины и выводит на экран:
        //● в первой строке - все четные цифры этого числа, через пробел
        //● во второй строке - все нечетные цифры этого числа, через
        //пробел
        //Например, для числа 765873 в первой строке будет выведены числа
        //6 8, а во второй строке 7 5 7 3
//        Scanner scanner = new Scanner(System.in);
//        int numberScanner = scanner.nextInt();
//        int number = 0;
//
//
//        while (numberScanner != 0) {
//            numberScanner /= 10;
//            number++;
//            System.out.print(numberScanner + " ");
//        }
//        System.out.println();
//        System.out.print(numberScanner + " ");
//
        //☺☺☺☺☺☺☺☺☺
        //TASK6
        //Напишите класс, который принимает с клавиатуры целое
        //положительное число любой длины, а затем выводит его первую
        //цифру.
        //Например, для числа 7659 на экран будет выведено 7.
        //☺☺☺☺☺☺☺☺☺
//        Scanner scanner = new Scanner(System.in);
//        int numberScanner = scanner.nextInt();
//        String s = String.valueOf(numberScanner);
//        System.out.println(s.charAt(0));
        //☺☺☺☺☺☺☺☺☺
        //TASK7
        //TASK7
        //TASK7
        //Напишите класс, который принимает с клавиатуры целое число
        //любой длины и строит из него число с обратным порядком цифр.
        //Новое значение следует вывести в консоль.
        //☺☺☺☺☺☺♂☺♦
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int result = 0;
//        int lastDigit;
//        while (x != 0) {
//            lastDigit = x % 10;
//            result = result * 10 + lastDigit;
//            x = x / 10;
//        }
//        System.out.println(result);
        //☺☺☺☺☺☺☺☺☺☺☺
        //TASK8
        //TASK8
        //TASK8
        //☺☺☺☺☺☺☺☺☺1☺
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ti");
        int numberOfTickets = scanner.nextInt();


    }

}
