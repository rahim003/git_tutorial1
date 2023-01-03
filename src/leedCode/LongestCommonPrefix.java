package leedCode;

import java.util.Arrays;
import java.util.Random;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Random random=new Random();
        int num1= random.nextInt(1,100);
        for (int i = 1; i <= 100; i++) {
            System.out.print(num1 + "->");
            int num2 = random.nextInt(1, 100);
            if (num2 % num1 == 0) {
                System.out.println(num2 + "/" + num1 + "=0");
            } else {
                System.out.println();
            }
        }
    }

    public static String longestCommonPrefix(String[] str) {
        if (str.length == 0) {
            return "longestCommonPrefix";
        }
        String s = str[0];
        for (int i = 0; i < str.length; i++) {
            while (str[i].indexOf(s) != 0) {
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

    public int[] findErrorNums(int[] nums) {
        int[] array = new int[nums.length];
        int[] result = new int[2];
        for (int num : nums) {
            array[num - 1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (array[i] == 2) {
                result[0] = i + 1;
            }
            if (array[i] == 1) {
                result[1] = i + 1;
            }
        }
        return result;
    }

    public static int reverse(int x) {
        int result = 0;
        int lastDigit;
        while (x != 0) {
            lastDigit = x % 10;
            result = result * 10 + lastDigit;
            x = x / 10;
        }
        return result;
    }

    public static int[] array(int[] arrays) {
        Arrays.sort(arrays);
        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.print(arrays[i] + " ");
        }
        return arrays;
    }

    public static void minMaxNumber() {

    }

}
