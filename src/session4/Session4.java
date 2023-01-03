package session4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Session4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] zar = new int[3];
        for (int i = 0; i < zar.length; i++) {
            count++;
            System.out.print("Zarplata "+count+": ");
            zar [i] = scan.nextInt();
        }
        Arrays.sort(zar);
        if (zar[0] == 0) {
            System.out.println("Oklad ne mojet byt' = 0");
        }else {
            System.out.println("Samaya vysokaya zarplata: "+zar[2]);
            System.out.println("Samaya nijnaya zarplata: "+zar[0]);
            System.out.println("Raznitsa: "+(zar[2] - zar[0]));
        }



    }

    public static void myMethod(int[] name) {
        int couter = name[0];
        for (int i = 0; i < name.length; i++) {
            if (name[i] > couter) {
                couter = name[i];
            }
        }
        System.out.println("max number "+couter);

    }

    public static void yourMethod(int[] numbers) {
        int couter = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < couter) {
                couter = numbers[i];
            }
        }
        System.out.println("min number"+couter);
    }
    public static void clas(int a,int b){
        System.out.println(a);
        if (a<b){
            System.out.println("oturguch jetet");
        }else {
            System.out.println("oturguch jetpeit");
        }
    }
    public static void num(int a,int b){
        System.out.println((a+b)/2d);

    }
    public static void metod(){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        long factorial=1;
        for (int i = 1; i <=num; ++i) {
            factorial*=i;

        }
        System.out.println(factorial);

    }


}