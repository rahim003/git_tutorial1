package session;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {

        Random random = new Random();
        int [] a= new int[10];
        for (int i = 0; i < a.length; i++) {
            int b= random.nextInt(1,20);
            a[i]=b;
        }
        System.out.println();
  }


    public static boolean array1(int[] array) {

        for (int n : array) {
            if (n < 0) {
                return false;
            }
        }
        return true;
    }

}
