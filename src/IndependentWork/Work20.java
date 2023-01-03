package IndependentWork;

import java.util.Random;
import java.util.Scanner;

public class Work20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int []array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(10,100);
        }
        arraysNumber(array);
    }
    public static void arraysNumber(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

}

