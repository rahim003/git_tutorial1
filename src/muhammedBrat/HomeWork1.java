package muhammedBrat;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {


//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-128, 127);
//        }
//        System.out.println("array = " + Arrays.toString(array));
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int number = scanner.nextInt();
//        System.out.println("task12(array,number) = " + task12(array, number));
        String[] names = {"Rahim", "Aijama", "Maksat", "Muhammed"};
        System.out.println(Arrays.toString(names));
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(workOne(names, name));

    }

    ///TASK
    public static boolean workOne(String[] names, String name) {
        boolean haveName = false;
        int index = 1;
        if (names.length == 0) {
            return false;
        }
        for (String s : names) {
            index++;
            if (s.equals(name)) {
                if (index % 2 == 0) {
                    haveName = true;
                    break;
                }
            }
        }
        return haveName;
    }

    /**Создайте не возвращающий метод в параметры которого, вы
   даете массив из целых чисел и еще целое число n.
    Метод должен проверить есть ли в массиве число большее или
     **/

    public static boolean task12(int[] array, int number) {
        boolean isTrue = false;
        for (int i : array) {
            if (i >= number) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }


}