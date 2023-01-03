package java8;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println(method(scanner.nextInt()));

    }

    public static int method(int number){
        int sum=0;
        for (int i = 0; i < number; i++) {
            sum=sum+i;
        }
        return sum;
    }
}

