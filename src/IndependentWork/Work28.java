package IndependentWork;

public class Work28 {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 23, 1, 2, 3};
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(equalsNumber(array));
    }

    public static boolean equalsNumber(int[] array) {
        boolean isTrue = false;
        for (int i : array) {
            if (i < 0) {
                return false;
            }
        }
        int index = array[0];
        for (int i = 0; i < array.length; i++) {
            if (index != array.length - 1) {
                if (2 == array[i] && 3 == array[++i]) {
                    isTrue = true;
                    break;
                } else {
                    index = array[i];
                }
            }
        }

        return isTrue;
    }

    public static boolean arraysNumber(int[] array) {
        boolean trueOrFalse = false;
        for (int j : array) {
            if (j < 0) {
                return false;
            }
        }
        int indexZero = array[0];
        for (int i = 1; i < array.length; i++) {
            if (indexZero != array.length - 1) {
                if (indexZero == array[i] && indexZero == array[++i]) {
                    trueOrFalse = true;
                    break;
                } else {
                    indexZero = array[i];

                }

            }

        }
        return trueOrFalse;
    }
}