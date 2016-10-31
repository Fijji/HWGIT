package hw7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> listA = new ArrayList<>();
        List<Integer> listA1 = new ArrayList<>();

        List<String> listL = new LinkedList<>();
        List<Integer> listL1 = new LinkedList<>();

        add(listA);
        add(listL);

        set(listA);
        set(listL);

        get(listA);
        get(listL);

        remove(listA);
        remove(listL);


    }

    private static void remove(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(System.currentTimeMillis() -start);
    }

    private static void get(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.println(System.currentTimeMillis() -start);
    }

    private static void set(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "");
        }
        System.out.println(System.currentTimeMillis() -start);
    }

    static void add(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add("string");
        }
        System.out.println(System.currentTimeMillis() -start);
    }



}