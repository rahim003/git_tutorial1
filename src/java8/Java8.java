package java8;

import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        reverseNumber(number);
    }
    public static void otherMethod(int i){
        System.out.println(i/10+i%10*10+8);
    }
    public static void reverseNumber(int number){
        int reverseNumber = 0;
        while(number != 0){
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        System.out.println(reverseNumber);
    }

}
