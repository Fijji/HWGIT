package hw2;

import java.util.concurrent.ThreadLocalRandom;

public class WorkOne {
    public static void main(String[] args) {
        int[] msI=new int[10];
        for(int i:msI){
            msI[i]= ThreadLocalRandom.current().nextInt(-5, 25);
        }
        double[] msD= {12.25, 14.12, 11.00, 5.5, -2.6, 0.5, 13.56, 10.1, 45.2, 22.6};
        modulus(msD);

    }

    public static int sum(int[] ms) {  //Найти сумму всеx элементов в массиве
        int sum = 0;
        for(int t=0; t<ms.length; t++){
            sum+=ms[t];}
        System.out.println("sum= "+sum);
        return sum;
    }
    public static double sum(double[] ms) {  //Найти сумму всеx элементов в массиве
        double sum = 0;
        for(int t=0; t<ms.length; t++){
            sum+=ms[t];}
        System.out.println("sum= "+sum);
        return sum;
    }
    public static int min(int[] ms){
        int min = ms[0];
        for (int i1 = 1; i1 < ms.length; i1++) {                                     //Найти минимальное число в массиве

            if (ms[i1] < min) {
                min = ms[i1]; }}
        System.out.println("min= "+min);
        return min;
    }
    public static double min(double[] ms){
        double min = ms[0];
        for (int i1 = 1; i1 < ms.length; i1++) {                                     //Найти минимальное число в массиве

            if (ms[i1] < min) {
                min = ms[i1]; }}
        System.out.println("min= "+min);
        return min;
    }
    public static int max(int[] ms){
        int max = ms[0];
        for (int i1 = 1; i1 < ms.length; i1++) {                                     //Найти максимальное число в массиве

            if (ms[i1] > max) {
                max = ms[i1]; }}
        return max;
    }
    public static double max(double[] ms){
        double max = ms[0];
        for (int i1 = 1; i1 < ms.length; i1++) {                                     //Найти максимальное число в массиве

            if (ms[i1] > max) {
                max = ms[i1]; }}
        return max;
    }
    public static int maxPositive(int[] ms){
        int max = ms[0];
        for (int i1 = 1; i1 < ms.length; i1++) {                                     //Найти максимальное число в массиве

            if (ms[i1] > max && ms[i1]>0) {

                max = ms[i1]; }}
        return max;
    }
    public static double maxPositive(double[] ms){
        double max = ms[0];
        for (int i1 = 1; i1 < ms.length; i1++) {                                     //Найти максимальное число в массиве

            if (ms[i1] > max && ms[i1]>0) {
                max = ms[i1]; }}
        System.out.println("maxPositive= "+max);
        return max;
    }
    public static int multiplication(int[] ms) {  //Найти произведение всеx элементов в массиве
        int total = ms[0];
        for(int t=1; t<ms.length; t++){
            total*=ms[t];}
        return total;
    }
    public static double multiplication(double[] ms) {   //Найти произведение всеx элементов в массиве
        double total = ms[0];
        for(int t=1; t<ms.length; t++){
            total*=ms[t];}
        System.out.println("multi= "+total);
        return total;
    }
    public static int secondLargest(int[] ms) {  //Найти второе по значению после max
        int x=0;
        int prev;
        int max = max(ms);
        for (int i = 0; i < ms.length; i++) {
            prev=ms[i];
            if ( prev<max)
                x=prev;}
        System.out.println("2e naibolshee chislo v massive- "+x);
        return x;
    }
    public static double secondLargest(double[] ms) {   //Найти второе по значению после max
        double x=0;
        double prev;
        double max = max(ms);
        for (int i = 0; i < ms.length; i++) {
            prev=ms[i];
            if ( prev<max)
                x=prev;}
        System.out.println("2e naibolshee chislo v massive- "+x);
        return x;
    }
    public static int modulus(int[] ms) {
        int result = Math.abs(ms[0]/ms[ms.length-1]);
        System.out.println(result);
        return result;
    }
    public static double modulus(double[] ms) {
        double result = Math.abs(ms[0]/ms[ms.length-1]);
        System.out.println(result);
        return result;
    }
}

