package main.java;

import java.util.function.Consumer;

public class LambdaConsumer1 {

    public static void main(String[] args) {

        Consumer<String> consumer = (x)-> System.out.println(x.toUpperCase());
        consumer.accept("sachin tendulkar");
    }
}
