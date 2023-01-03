package java8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);

        }
        System.out.println(Arrays.toString(array));
        int number = scanner.nextInt();
        int counter = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                counter = array[i];
                index = i;
                System.out.println(i);
            }

        }
        if (counter == number) {
            System.out.println(index);
        } else {
            System.out.println("Myndai san jok");
        }
    }

}

