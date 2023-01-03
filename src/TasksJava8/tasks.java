package TasksJava8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            int numberScanner = scanner.nextInt();
            if (numberScanner == 0) {
                System.out.println("zero number not enter");
                break;
            } else {
                array[i] = numberScanner;
            }
        }
        Arrays.sort(array);
        System.out.println("max money " + array[2]);
        System.out.println("min money " + array[0]);
        System.out.println("min money " + (array[2] - array[0]));
    }
}

