package IndependentWork;

import java.util.Random;
import java.util.Scanner;

public class WorkFoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int counter = 0;
        int counterTwo = 0;
        while (true) {
            System.out.println("Enter first number");
            int numberOne = scanner.nextInt();
            System.out.println("Enter second number");
            int numberTwo = scanner.nextInt();
            if (numberOne != numberTwo) {

                counter += numberOne;
                counterTwo += numberTwo;
            } else {
                System.err.println("two number equals");
                System.out.print("one numbers counter  " + counter);
                System.out.println();
                System.out.print("two numbers counter   " + counterTwo);
                break;

            }


        }


    }
}
