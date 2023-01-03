package dice;

import java.util.Random;
import java.util.Scanner;

public class stage2 {
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
            int userNumbers = scanner.nextInt();
            System.out.println();
            if (userNumbers > 12 || userNumbers < 0) {
                System.out.print("Predict amount of points(1...12)");
                continue;
            }
            System.out.println("user rolls the dices....");

            int numberRandom = random.nextInt(1, 7);
            int numberRandom2 = random.nextInt(1, 7);

            int i = dice(numberRandom) + dice(numberRandom2);
            System.out.printf("one the dice feel %d points \n", i);
            int result = Math.abs(i - Math.abs(i - userNumbers) * 2);
            System.out.printf("Results is %d - abc(%d-%d)*%d :  %d\n", i, i, userNumbers, 2, result);
            System.out.println("User win☺");
            playComputer();


        }
    }

    public static int playComputer() {
        Random random = new Random();
        int computerNumbers = random.nextInt(1, 13);
        int numberRandom = random.nextInt(1, 7);
        int numberRandom2 = random.nextInt(1, 7);
        int i = dice(numberRandom) + dice(numberRandom2);
        System.out.printf("computer predicted %s points \n", i);
        int result = Math.abs(i - Math.abs(i - computerNumbers) * 2);
        System.out.printf("Results is %d - abc(%d-%d)*%d :  %d\n", i, i, computerNumbers, 2, result);
        System.out.println("Computer  win☺");
        return result;
    }

}



