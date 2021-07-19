package main.java;

import java.util.function.BiConsumer;

public class LambdaBiconsumer {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> add = (a,b) -> {
            System.out.println("a+b = "+(a+b));
        };

        BiConsumer<Integer,Integer> minus = (a,b) -> {
            System.out.println("a+b = "+(a-b));
        };

        BiConsumer<Integer,Integer> mul = (a,b) -> {
            System.out.println("a+b = "+(a*b));
        };

        BiConsumer<Integer,Integer> divide = (a,b) -> {
            System.out.println("a+b = "+(a/b));
        };

     //   add.accept(6,8);

    //    minus.accept(5,5);

        mul.andThen(divide).accept(8,5);
    }
}
