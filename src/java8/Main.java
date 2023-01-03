package java8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static final Random rn = new Random();

    public static void main(String[] args) {
        System.out.println("Оюнду баштоо учун start деп жазыныз");
        String start = sc.nextLine();
        int counterUser = 0;
        int counterComputer = 0;
        while (true) {
            if (start.equals("start")) {
                System.err.println("1-таш 2-кагаз 3 кайчы");
                System.out.println("Сиз кайсыны тандайсыз 1 жана 2 жана 3 сандарын гана тандасаныз болот");
                int numberUser = sc.nextInt();
                if (numberUser > 3||numberUser<0) {
                    System.out.println("0дон кичине жана 3тон чон сан бербен");
                    continue;
                }
                int numberComputer = rn.nextInt(1, 4);
                System.out.printf("User тандаган сан %d\n", numberUser);
                System.out.printf("Компютер тандаган сан %d\n", numberComputer);
                if (numberUser == numberComputer) {
                    System.out.printf("Компютер тандаган сан бул %d  ал эми user тандаган сан %d бири бирине барабар\n", numberComputer, numberUser);

                } else if ((numberUser == 1 && numberComputer == 2) || (numberUser == 2 && numberComputer == 3) || (numberUser == 3 && numberComputer == 1)) {
                    System.out.printf("Computer тандаган сан %d саны болду жана женди\n", numberComputer);
                    counterComputer++;
                } else if ((numberUser == 2 && numberComputer == 1) || (numberUser == 3 && numberComputer == 2) || (numberUser == 1 && numberComputer == 3)) {
                    System.out.printf("User женди тандаган балы %d \n", numberUser);
                    counterUser++;
                } else if (numberUser == 0) {
                    if (counterComputer > counterUser) {
                        System.err.printf("Компютердин балы %d жана женди\n", counterComputer);
                    } else if (counterComputer < counterUser) {
                        System.err.printf("User балы %d жана женди\n", counterUser);
                    } else {
                        System.err.printf("Компютердин балы %d жана женди\n", counterComputer);
                        System.err.printf("User балы %d жана женди\n", counterUser);
                    }
                } else {
                    System.out.println("Сиз башка соз жазып койдунуз оюнду баштоо start созун жазыш керек сураныч кайра тууралап жазып корунуз");
                    break;
                }

            }

        }
    }
}



