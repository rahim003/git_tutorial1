package TasksJava8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayElementInIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] masiv = {1, 2, 4, 3, 2, 1, 2, 3, 4};
        System.out.println(Arrays.toString(masiv));
        boolean[] booleans = {true, false, true, false};
        task1(booleans);
        task3(masiv, scanner.nextInt());

    }

    public static void summaArray(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (number != array[i]) {
                counter += array[i];
            } else {
                break;
            }
        }
        System.out.println(counter);
    }

    public static void arrayBoolean(boolean[] booleans) {
        boolean isTrue = false;
        for (int i = 1; i < booleans.length; i++) {
            if (booleans[i] == isTrue) {
                isTrue = true;
            }
            System.out.println(booleans[i]);
        }

    }

    public static void task1(boolean[] massiveBoolean) {
        int counter = 0;

    }


    public static void task3(int[] array, int counter) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == counter) {
                number++;
            }
        }
        System.out.println(number);
    }


}
