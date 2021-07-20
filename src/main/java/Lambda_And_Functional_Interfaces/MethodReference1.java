package main.java;

import java.util.function.Function;

public class MethodReference1 {


    static Function<String,String> toUpperCase = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCase.apply("hello"));
    }
}
