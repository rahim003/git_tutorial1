package java8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeWork {
    public static final Random rn = new Random();
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random random=new Random();
        int[] massive=new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(10, 50);


        }
        System.out.println(Arrays.toString(massive));

    }



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//☺Mohammed bike homework
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        for (int i = 8; i >=1 ; i--) {
//            for (int j = 1; i >j; j++) {
//                System.out.print(j+"");
//            }
//            System.out.println();
//        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//☺Myhammed baike homework 2
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        int[] array = new int[5];
//        int[] array1 = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rn.nextInt(1, 5);
//            array1[i] = rn.nextInt(1, 5);
//        }
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array));
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//☻Айжамал эже берген задание
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        System.out.println("Биринчи ишкердин зарплатасын жазыныз");
//        int customerOne = sc.nextInt();
//        System.out.println("Экинчи ишкерин зарплатасын жазыныз");
//        int customerTwo = sc.nextInt();
//        System.out.println("Учунчу ишкердин зарплатасын жазыныз");
//        int customerThree = sc.nextInt();
//        if (customerOne > customerTwo && customerOne > customerThree) {
//            System.out.printf("Самый высокий сумма это  %d ", customerTwo);
//        } else if (customerTwo > customerOne && customerTwo > customerThree) {
//            System.out.printf("Самый высокий сумма это  %d ", customerTwo);
//        } else {
//            System.out.printf("Самый высокий сумма это  %d ", customerThree);
//        }
//☻♦♦Myhammed baike bergen zadania


public static void counter(){
        int[]array=new int[10];
        int counter=0;
        for(int i=0;i<array.length;i++){
        array[i]=rn.nextInt(1,10);
        if(array[i]%2!=0){
        counter++;
        }
        }
        System.out.println(Arrays.toString(array));

        int[]arrayOne=new int[counter];
        int index=0;
        for(int i=0;i<array.length;i++){
        if(array[i]%2!=0){
        arrayOne[index]=array[i];
        index++;
        }

        }
        System.out.println(Arrays.toString(arrayOne));
        }
        }
