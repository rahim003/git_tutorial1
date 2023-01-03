package joma;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Tasks30Joma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(array));
        task17(array, scanner.nextInt());

    }

    /**
     * Напишите класс, который создает 20 случайных чисел диапазона
     * 1 - 99. Следует вывести в консоль только те числа которые делятся
     * на 1-ое рандомное число без остатка
     **/
    public static void task1() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(1, 99);
            if (number % 2 == 0) {
                System.out.println("на 1-ое рандомное число без остатка");
                System.out.println(number + " ");
            }
        }

    }

    /**
     * Напишите класс, который генерирует 20 рандомных целых чисел
     * из диапазона -50 до +50, и определяет наименьшее число и
     * наибольшее число.
     **/
    public static void task2() {
        Random random = new Random();
        int minNumber = 0;
        int maxNumber = 0;
        for (int i = 0; i <= 20; i++) {
            int number = random.nextInt(-50, 50);
            System.out.print(number + "  ");
            if (number < minNumber) {
                minNumber = number;
            } else {
                maxNumber = Math.max(maxNumber, number);
            }
        }
        System.out.println();
        System.out.print("min number:  " + minNumber);
        System.out.println();
        System.out.print("max number:  " + maxNumber);

    }

    /**
     * Напишите класс, который принимает с консоли для переменной X
     * целое положительное число, а затем дополнительно будет
     * спрашивать ещё числа, эти числа будут должны вычитаться из
     * переменной x, вы будете вводить числа до тех пор пока X не будет
     * отрицательным или равен 0
     **/
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = scanner.nextInt();
        while (true) {
            System.out.print("enter two number ");
            int scannerNumber = scanner.nextInt();
            number -= scannerNumber;
            System.out.printf("result : %d ", number);
            System.out.println();
            if (number < 0) {
                System.err.print("scanner number zero ");
                break;
            }

        }
    }

    /**
     * Напишите класс, который принимает с клавиатуры две
     * переменный это два числа, пока не будет введено две одинаковых
     * чисел.
     * Класс должен выводить на экран сумму всех первых чисел и сумму
     * всех вторых чисел (не считая чисел, введенных одинаковыми).
     **/
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int firstCompound = 0;
        int secondCompound = 0;
        while (true) {
            System.out.print("enter first number : ");
            int numberOne = scanner.nextInt();
            System.out.print("enter second number : ");
            int numberTwo = scanner.nextInt();
            if (numberOne != numberTwo) {
                firstCompound += numberOne;
                secondCompound += numberTwo;
            }
            if (numberOne == numberTwo) {
                System.out.print("compound first numbers " + firstCompound);
                System.out.println();
                System.out.print("compound second numbers " + secondCompound);
                break;
            }
        }
    }

    /**
     * Напишите класс, который принимает с клавиатуры целое число
     * любой длины и выводит на экран:
     * ● в первой строке - все четные цифры этого числа, через пробел
     * ● во второй строке - все нечетные цифры этого числа, через
     * пробел
     * Например, для числа 765873 в первой строке будет выведены числа
     * 6 8, а во второй строке 7 5 7 3
     **/
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number : ");
        int numberOne = scanner.nextInt();
        String s = String.valueOf(numberOne);
        char c = s.charAt(numberOne);
    }

    /**
     * Напишите класс, который принимает с клавиатуры целое
     * положительное число любой длины, а затем выводит его первую
     * цифру.
     * Например, для числа 7659 на экран будет выведено 7.
     **/
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String s = String.valueOf(number);
        System.out.println(s.charAt(0));
    }

    /**
     * Напишите класс, который принимает с клавиатуры целое число
     * любой длины и строит из него число с обратным порядком цифр.
     * Новое значение следует вывести в консол
     */
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = scanner.nextInt();
        int result = 0;
        int lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            result = result * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(result);
    }

    /**
     * На спектакль в кассу театра было выделено определенное
     * количество билетов, и продажа осуществлялась до тех пор, пока не
     * были проданы все билеты.
     * Напишите класс, который сначала принимает с клавиатуры
     * количество билетов, переданных в кассу. Затем класс принимает с
     * клавиатуры серию чисел, каждое из которых указывает на число
     * билетов, которое желает приобрести покупатель.
     * Если нет возможности продать очередному покупателю требуемое
     * им число билетов, принимается заказ от следующего покупателя.
     * Класс должен вывести в консоль:
     * ● Какое число покупателей приобрели билеты
     * ● Какому числу покупателей было отказано в продаже билетов
     */
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write number of tickets : ");
        int tickets = scanner.nextInt();
        int counterTicketsError = 0;
        int counterTickets = 0;
        while (true) {
            System.out.println("pay");
            int pay = scanner.nextInt();
            tickets -= pay;
            if (tickets > pay) {
                counterTickets++;
            }
            if (tickets < pay) {
                counterTicketsError++;
            }
            if (tickets < 0) {
                System.out.println(counterTickets);
                System.out.println(counterTicketsError);
                break;
            }
        }
    }

    /**
     * Напишите класс, который заполняет случайными
     * четырехзначными числами массив, размер которого вводится с
     * клавиатуры.
     * После заполнения класс должен вывести на экран значения
     * массива в одной строке, начиная с конца массива ( с последнего
     * индекса).
     */
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Give the size of the array : ");
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(999, 9999);
        }
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.print(arrays[i] + " ");
        }

    }

    /**
     * Напишите класс, который заполняет случайными двузначными
     * числами массив, размер которого вводится с клавиатуры.
     * После заполнения класс должен вывести на экран значения
     * массива следующим образом:
     * ● в первой строке - первую половину массива
     * ● во второй строке - вторую половину массива
     */
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Give the size of the array : ");
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(999, 9999);
        }
        double last = arrays.length / 2d;
        System.out.println("first array");
        for (int i = 0; i < last; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
        System.out.println("second array");
        double first = arrays.length / 2d;
        for (int i = 0; i < first; i++) {
            System.out.print(arrays[i] + "  ");
        }
    }

    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Give the size of the array : ");
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(1, 20);
            if (arrays[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }
        for (int array : arrays) {
            System.out.print(array + "  ");
        }
        System.out.println();
        int[] oddNumbers = new int[odd];
        int[] evenNumbers = new int[even];
        int index = 0;
        int index1 = 0;
        for (int array : arrays) {
            if (array % 2 != 0) {
                oddNumbers[index] = array;
                index++;
            } else {
                evenNumbers[index1] = array;
                index1++;
            }
        }
        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }
        System.out.println();
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }


    }

    /**
     * 12. Создайте не возвращающий метод в параметры которого, вы
     * даете массив из целых чисел и еще целое число n.
     * Метод должен проверить есть ли в массиве число большее или
     * равное n.
     * Если есть такое число вывести в консоль true, в другом случае false
     *
     * @param array
     * @param number
     */

    public static void task12(int[] array, int number) {
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= number) {
                isTrue = true;
            } else {
                isTrue = false;
            }
        }
        System.out.println(isTrue);
    }

    /**
     * Напишите не возвращающий метод, который берет в параметры
     * массив из boolean типа, и выводит в консоль количество true
     * элементов массива.
     */

    public static void task13() {
        int counter = 0;
        boolean[] booleans = {true, false, true, false, true, false, false};
        for (boolean aBoolean : booleans) {
            if (aBoolean) {
                counter++;
            }
        }
        System.out.println(counter);

    }

    /**
     * . Напишите не возвращающий метод который в параметры берет
     * массив из рандомных чисел от 1 до 50 и выводит в консоль только
     * те числа что больше 20.
     */
    public static void task14() {
        Random random = new Random();
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(1, 50);
            if (arrays[i] > 20) {
                System.out.print(arrays[i] + " ");
            }
        }
    }

    /**
     * Напишите не возвращающий метод, который берет массив из
     * рандомных чисел от 1 до 50 и еще одно целое число n.
     * Нужно вывести в консоль сколько раз число n повторялось в
     * массиве.
     *
     * @param array
     * @param index
     */

    public static void task15(int[] array, int index) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                number++;
            }
        }
        System.out.println(number);
    }

    /**
     * Напишите метод возвращающий тип int, вы должны в параметры
     * метода дать целое положительное число n.
     * А метод нам вернёт сумму всех цифр от 0 до n.
     */
    public static int task16(int number) {
        int counter = 0;
        for (int i = 0; i <= number; i++) {
            counter += i;
        }
        return counter;
    }

    /**
     * Напишите метод, который принимает в качестве параметра
     * массив целых чисел и число К, число К это индекс в массиве.
     * Нам нужно вывести сумму всех чисел до индекса K массива
     *
     * @param array
     * @param number
     */
    public static void task17(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == number) {
                break;
            } else counter += array[i];

        }
        System.out.println(counter);
    }

    public static int[] task18(int[] array) {
        int counter = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                counter++;
            }

        }
        int[] even = new int[counter];
        int index = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even[index] = j;
                index++;
            }
        }
        return even;

    }
}

