package java8;

import java.util.Arrays;
import java.util.Scanner;

public class myCode {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] zarplaty= new int [3];
        for (int i = 0; i < zarplaty.length; i++) {
            zarplaty[i] = scanner.nextInt();}
        int razniza = zarplaty[2] -zarplaty[0];
        Arrays.sort(zarplaty);
        System.out.println(Arrays.toString(zarplaty) );
        System.out.println(zarplaty[0]  + " Zarplata ne mojet bit = 0");
    }
}
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write number:");
//        int number = scanner.nextInt();
//        System.out.print(number + "!=");
//        int numberOne = 1;
//        for (int numberTwo = 1; numberTwo <= number; numberTwo++) {
//            numberOne *= numberTwo;
//            System.out.print(numberTwo);
//            if (numberTwo < number) {
//                System.out.print("*");
//            }
//        }
//        System.out.println("=" + numberOne);
//    }
//}
//        int counter=0;
//        while (true){
//            System.out.print("write number");
//            int number= sc.nextInt();
//            if (number>0) {
//                counter += number;
//            }
//            if (number<0){
//                System.out.println(counter);
//                break;
//            }
//        }
//    }
//    }
//        int counter = 0;
//        double arif = 0d;
//        for (; ; ) {
//            int number = sc.nextInt();
//            counter += number;
//            if (number > 0) {
//                arif++;
//            }
//            if (number == 0) {
//                System.out.println("arifmeticasy" + counter / arif);
//                break;
//            }
//        }
//    }
//}

//№1
//Сканнерден сан бериниз ошол сандардын ичинен жуп сандарды чыгарып
//суммасын чыгарсын
//        Scanner scanner = new Scanner(System.in);
//        int scannerNumber = scanner.nextInt();
//        int summa = 0;
//        int counter = 0;
//        for (int i = 1; i <= scannerNumber; i++) {
//            summa += i;
//            counter++;
//            if (i < counter) {
//                {
//                    System.out.print(i + "=");
//                }
//            } else {
//                System.out.print(i + "+");
//            }
//        }
//        System.out.printf("%s", summa);
// }
//}
//№2
//Cканнерден сан бериниз ал санды 10 чейинки квадратын чыгарсын
//        int number = sc.nextInt();
//        for (int i = 1; i <= 5; i++) {
//            System.out.println((int) Math.pow(number, i));
//        }
//    }
//}

//№3
// деген санды жазмайынча консолдон сан ала
//бериңиз.
//0 деп жазгандан кийин, канча сан жазган болсоңуз
//консолго көлөмүн(количествосун), алардын суммасын
//жана орточо арифметикалык санын чыгышы керек.
//
//}
//№4
//Секунданы саатка минутка секундка айландырчуу кун жазыныз

//        int number = sc.nextInt();
//        int hour, minut, second;
//        hour = number / 3600;
//        minut = (number / 60) % 60;
//        second = number % 60;
//        System.out.printf("%d:%d:%d", hour, minut, second);
//    }
//}
//Озум берген тапшырма окшош сан бир жерде жазылганбы текшериниз
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b;
//        int c;
//        while (a >= 10) {
//            b = a % 10;
//            a /= 10;
//            c = a % 10;
//            a /= 10;
//            if (b == c) {
//                System.out.println(true);
//                break;
//            }
//        }
//    }
//}
