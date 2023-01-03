package IndependentWork;

import java.util.Scanner;

public class WorkTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :  ");
        int number = scanner.nextInt();
        int result = 0;//resultatty beret
        int lastDigit;//akyrky sanyn shyl peremenneiga berip jatat
        while (number != 0) {
            lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(result);
    }

    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();


    }
}
