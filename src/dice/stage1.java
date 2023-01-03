package dice;

import java.util.Random;
import java.util.Scanner;

public class stage1 {
    public static void main(String[] args) {
        startGame();


    }

    public static int dice(int numberRandom) {
        switch (numberRandom) {
            case 1 -> System.out.println("""
                    +-------+
                    |       |
                    |   #   |
                    |       |
                    +-------+
                             
                    """);
            case 2 -> System.out.println("""
                    +-------+
                    |#      |
                    |       |
                    |      #|
                    +-------+
                             
                    """);
            case 3 -> System.out.println("""
                    +-------+
                    |#      |
                    |   #   |
                    |      #|
                    +-------+
                             
                    """);
            case 4 -> System.out.println("""
                    +-------+
                    |#     #|
                    |       |
                    |#     #|
                    +-------+
                             
                    """);
            case 5 -> System.out.println("""
                    +-------+
                    |#     #|
                    |   #   |
                    |#     #|
                    +-------+
                             
                    """);
            case 6 -> System.out.println("""
                    +-------+
                    |#  #  #|
                    |#  #  #|
                    |#  #  #|
                    +-------+
                             
                    """);
        }
        return numberRandom;
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("---------Start game-----------");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Predict amount of points(1.....12) :");
            int numberScanner = scanner.nextInt();
            System.out.println();
            if (numberScanner>12||numberScanner<0){
                System.out.println();
            }
            System.out.println("user rolls the dices....");

            int numberRandom = random.nextInt(1, 7);
            int numberRandom2 = random.nextInt(1, 7);

            int i = dice(numberRandom) + dice(numberRandom2);
            System.out.printf("one the dice feel %d points \n", i);
            int result = Math.abs(numberRandom - Math.abs(numberRandom - numberScanner) * 2);
            System.out.printf("Results is %d - abc(%d-%d)*%d :  %d\n", i, i, numberScanner, 2, result);
            System.out.println("User win☺");
        }
    }
}
