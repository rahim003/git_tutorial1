package java8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Session5 {
    public static final Scanner sc = new Scanner(System.in);
    public static final Random rn = new Random();

    public static void main(String[] args) {

//
//        String[] names = {
//                "Абдиразак\n",
//                "Абдулфаттох\n",
//                "Абдували\n",
//                "Агахан\n",
//                "Адил\n",
//                "Адилет\n",
//                "Айгерим\n",
//                "Айпери\n",
//                "Алибек\n",
//                "Арабидин\n",
//                "Артём\n",
//                "Арун\n",
//                "Байэл\n",
//                "Бакас\n",
//                "Бек\n",
//                "Бектур\n",
//                "Давлатбек\n",
//                "Дастан\n",
//                "Жайлообек\n",
//                "Жанышбек\n",
//                "Жийдегул\n",
//                "Жумантай\n",
//                "Исхак\n",
//                "Кайратбек\n",
//                "Каныкей\n",
//                "Канымгүл\n",
//                "Кубан\n",
//                "Кутман\n",
//                "Мадина\n",
//                "Милана\n",
//                "Мирлан\n",
//                "Мирлан\n",
//                "Мээрим\n",
//                "Нурали\n",
//                "Нуржигит\n",
//                "Нуриза\n",
//                "Нурия\n",
//                "Нурсейит\n",
//                "Нурсултан\n",
//                "Нурсултан\n",
//                "Осмон\n",
//                "Санжар\n",
//                "Сыймык\n",
//                "Чынгыз\n",
//                "Чынгыз\n",
//                "Ынтымак\n",
//                "Элиза\n",
//                "Эрболот\n",
//                "Эрлан\n",
//                "Кутман"
//        };
//        Random random = new Random();
//        int randomNumber = random.nextInt(names.length);
//        System.out.println(names[randomNumber]);
        //☻☻☻☻☻☻☻☻☻☻TASK 2☻☻☻☻☻☻☻☻☻☻☻☻☻
//        Random random = new Random();
//        int[] array = new int[15];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(1, 100);
//        }
        minNumber(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

    }

    //  public static void addNumber(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+"  ");
//
//        }
//        System.out.println();
//        Arrays.sort(array);
//        System.out.print("array in min value " + array[0]);
//        System.out.println();
//        System.out.print("array in max value " + array[14]);


    //    }
    public static void minNumber(double number, double numberTwo, double numberThree) {
        System.out.println(Math.min(Math.min(number, numberTwo), numberThree));
    }

}