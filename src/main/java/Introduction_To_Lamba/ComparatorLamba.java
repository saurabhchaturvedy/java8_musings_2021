package main.java;

import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.printf("comparison result is : %d ",comparator.compare(4,5));
    }
}
