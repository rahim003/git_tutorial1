package IndependentWork;

import java.util.Scanner;

public class WorkSixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("="+returnNumber(scanner.nextInt()));
    }

    public static int returnNumber(int number) {
        int counter = 0;
        for (int i = 1; i <=number; i++) {
            System.out.print(" "+i);
            counter += i;
        }
        return counter;
    }
}
