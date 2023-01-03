package IndependentWork;

import com.sun.source.tree.ReturnTree;
import java8.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Work24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int[]array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(-10,10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(oddNumbers(array));

    }
    public static boolean oddNumbers(int[]array){
        for (int j : array) {
            return j > 0;
        }
        return false;
    }

}
