package main.java;

import java.util.function.Predicate;

public class LambdaPredicate1 {

    public static void main(String[] args) {

        Predicate<Integer> integerPredicate = (x)->x%5==0;
        Predicate<Integer> integerPredicate1 = (x)->x%2==1;


        System.out.println(" test1 "+integerPredicate.and(integerPredicate1).test(15));
        System.out.println(" test1 "+integerPredicate.or(integerPredicate1).test(10));
        System.out.println(" test1 "+integerPredicate.or(integerPredicate1).negate().test(10));

    }
}
