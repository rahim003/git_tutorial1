package dice;

import java.util.Random;
import java.util.Scanner;

public class stage4 {
    public static void main(String[] args) {
        resultGame();

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
        int counterUser = 0;
        int counterComputer = 0;
        int counterGame = 0;

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

    public static void resultGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("<<<<<<<<<<Start game>>>>>>>>>>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int counterGame = 0;
        int counterUserResult = 0;
        int counterComputerResult = 0;
        while (true) {
            System.out.print("Predict amount of points(1.....12) :");
            int userNumbers = scanner.nextInt();
            System.out.println();
            if (userNumbers > 12 || userNumbers < 0) {
                System.out.print("Predict amount of points(1...12)");
                continue;
            }
            System.out.println("user rolls the dices....");

            int diceNumbers = random.nextInt(1, 7);
            int diceNumbers2 = random.nextInt(1, 7);
            int sumDiceNumber = dice(diceNumbers) + dice(diceNumbers2);
            System.out.printf("one the dice feel %d points \n", sumDiceNumber);
            int userResult = Math.abs(sumDiceNumber - Math.abs(sumDiceNumber - userNumbers) * 2);
            System.out.printf("Results is %d - abc(%d-%d)*%d :  %d\n", sumDiceNumber, sumDiceNumber, userNumbers, 2, userResult);
            System.out.println("User win☺");
            counterUserResult++;
            int computerNumbers = random.nextInt(1, 13);
            int numberRandom = random.nextInt(1, 7);
            int numberRandom2 = random.nextInt(1, 7);
            int i = dice(numberRandom) + dice(numberRandom2);
            System.out.println("choose computer numbers" + computerNumbers);
            System.out.printf("computer predicted %s points \n", i);
            int result = Math.abs(i - Math.abs(i - computerNumbers) * 2);
            System.out.printf("Results is %d - abc(%d-%d)*%d :  %d\n", i, i, computerNumbers, 2, result);
            System.out.println("Computer  win☺");

            if (userResult > result) {
                int resultUser1 = userResult - result;
                System.out.printf("""
                        -------------Current score--------------------
                        User :  %d points    
                        Computer : %d points
                                           
                        %s  id  ahead  by %d points    
                                                
                        +-------------------------------------------+                
                        """, userResult, result, "User", resultUser1);
                counterUserResult++;
            } else if (result == userResult) {
                System.out.printf("""
                        -------------Current score--------------------
                        User :  %d points    
                        Computer : %d points
                                           
                        %s  id  ahead  by %s points      
                                                
                        +----------------------------------------------+              
                        """, userResult, result, "User ", "Computer");


            } else {
                int resultComputer1 = result - userResult;
                System.out.printf("""
                        -------------Current score--------------------
                        User :  %d points    
                        Computer : %d points
                                           
                        %s  id  ahead  by %d points      
                                                
                        +----------------------------------------------+              
                        """, userResult, result, "Computer", resultComputer1);
                counterComputerResult++;
            }
            counterGame++;
            if (counterGame == 3) {
                System.out.println("""
                        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                        <<<<<<<<<<<Finish game>>>>>>>>>>>>>>>>
                        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                        """);
                System.out.printf("""

                        Round |          User |          Computer
                        ------+---------------+------------------
                              |Predicted: %d  |Predicted:  %d
                        """, userNumbers, computerNumbers);
                System.out.printf("""
                        -%d    |Dice : %d      |Dice : %d
                        """, 1, sumDiceNumber, i);
                System.out.printf("""
                              |Result: %d     |Result : %d
                        """, userResult, result);
            }
        }
    }
}
