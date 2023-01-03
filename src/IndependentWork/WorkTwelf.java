package IndependentWork;

import java.util.Random;
import java.util.Scanner;

public class WorkTwelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
            System.out.print(array[i] + " ");
        }
        int number = scanner.nextInt();
        massiveSum(array, number);
    }

    public static void massiveSum(int[] massive, int index) {
        boolean isTrue = false;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i]>=index){
                isTrue=true;
            }else {
                isTrue=false;
            }
        }
        System.out.println(isTrue);
    }
}

