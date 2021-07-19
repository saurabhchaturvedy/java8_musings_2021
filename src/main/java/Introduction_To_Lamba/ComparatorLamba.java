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

        Comparator<Integer> comparator1 = (a,b) -> b.compareTo(a);   // Comparator.naturalOrder && Comparator.reverseOrder()


        System.out.printf("comparison result 2 is : %d ",comparator1.compare(6,4));
    }
}
