package main.java;

import java.util.Locale;

public class UnaryOperator {

    static java.util.function.UnaryOperator<String> stringUnaryOperator = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(stringUnaryOperator.apply("ramesh"));

    }
}
