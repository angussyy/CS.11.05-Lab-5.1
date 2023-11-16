import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {
        String result = "";
        for (int i = 0;i<array.length;i++) {
            result += array[i];
        }
        System.out.println(result);
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0;i<array.length;i++) {
            result += array[i];
        }
        return result;
    }

    public static double average(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        BigDecimal bd = new BigDecimal(result/array.length).setScale(2, RoundingMode.DOWN);
        double newNum = bd.doubleValue();
        return newNum;
    }

    public static int minimum(int[] array) {
        int num = 0;
        for (int i = 0; i<array.length;i++) {
            if (i==0) {
                num = array[0];
            }
            else {
                if (array[i]<num) {
                    num = array[i];
                }
            }
        }
        return num;
    }

    public static int maximum(int[] array) {
        int num = 0;
        for (int i = 0; i<array.length;i++) {
            if (i==0) {
                num = array[0];
            }
            else {
                if (array[i]>num) {
                    num = array[i];
                }
            }
        }
        return num;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i = 0; i<array.length;i++) {
            if (array[i]%2==0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i<array.length;i++) {
            result[i] = array[array.length-i-1];
        }
        return result;
    }

    public static void reverseTwo(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array[length - i - 1];
        }
        for (int i = 0; i < length; i++) {
            array[i] = result[i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i<array.length;i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i<array.length;i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i<array.length;i++){
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i<array.length;i++){
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i< array.length-1;i++) {
            result = result + array[i] + ", ";
        }
        result = result + array[array.length-1];
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void shiftRight(int[] array) {
        int[] abc = new int[array.length];
        abc[0] = array[array.length-1];
        for (int i = 0; i<array.length-1;i++) {
            abc[i+1] = array[i];
        }
        for (int i = 0; i< array.length;i++) {
            array[i] = abc[i];
        }
    }

    public static void shiftLeft(int[] array) {
        int[] abc = new int[array.length];
        abc[array.length-1] = array[0];
        for (int i = 0; i<array.length-1;i++) {
            abc[i] = array[i+1];
        }
        for (int i = 0; i< array.length;i++) {
            array[i] = abc[i];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int length = array.length;
        n = n % length;

        for (int i = 0; i < n; i++) {
            int hold = array[length - 1];
            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = hold;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int length = array.length;
        n = n % length;

        for (int i = 0; i < n; i++) {
            int holder = array[0];
            for (int j = 0; j < length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[length - 1] = holder;
        }
    }


}