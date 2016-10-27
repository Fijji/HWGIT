package hw6;

public final class ArraysUtils {
//    public static void main(String[] args) {
//        int[] x = {1, 2, 3, 4, 5, 6};
//        findEvenElements(x);
//    }

    public static int sum(int[] array) {  //Найти сумму всеx элементов в массиве
        int sum = 0;
        for (int t = 0; t < array.length; t++) {
            sum += array[t];
        }
        System.out.println("sum= " + sum);
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i1 = 1; i1 < array.length; i1++) {     //Найти минимальное число в массиве

            if (array[i1] < min) {
                min = array[i1];
            }
        }
        System.out.println("min= " + min);
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i1 = 1; i1 < array.length; i1++) {    //Найти максимальное число в массиве

            if (array[i1] > max) {
                max = array[i1];
            }
        }
        return max;
    }

    public static int multiplication(int[] array) {  //Найти произведение всеx элементов в массиве
        int total = array[0];
        for (int t = 1; t < array.length; t++) {
            total *= array[t];
        }
        return total;
    }

    public static int modulus(int[] array) {
        int result = Math.abs(array[0] / array[array.length - 1]);
        System.out.println(result);
        return result;
    }

    public static int secondLargest(int[] array) {  //Найти второе по значению после max
        int x = 0;
        int prev;
        int max = max(array);
        for (int i = 0; i < array.length; i++) {
            prev = array[i];
            if (prev < max)
                x = prev;
        }
        System.out.println("2e naibolshee chislo v massive- " + x);
        return x;
    }

    public static int[] reverse(int[] array) {
        int[] arrtemp = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            arrtemp[(array.length - 1) - i] = array[i];
        }
        array = arrtemp;
        return array;
    }

    public static  int[] findEvenElements(int[] array) {
        int[] arrtemp = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
//                System.out.println(i + " element = " + array[i]);
                arrtemp[count] = array[i]; //нет необходимости но все же
                count++;
            }
        }
        array = new int[count];
        for (int i = 0; i < arrtemp.length; i++) {
            if (arrtemp[i] != 0) {
                array[i] = arrtemp[i];
            }
        }
//        System.out.println(Arrays.toString(array));
        return array;
    }
}



