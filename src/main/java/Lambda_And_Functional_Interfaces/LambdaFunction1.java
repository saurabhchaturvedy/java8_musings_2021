package main.java;

import java.io.StringReader;
import java.util.function.Function;

public class LambdaFunction1 {

    private static Function<String,String> stringFunction = (s)->s.toUpperCase();

    private static Function<String,String> stringFunction2 = (s)->s.concat(" digital");

    public static void main(String[] args) {

        System.out.println(stringFunction.apply("siemens"));
        System.out.println(stringFunction2.apply("data"));

    }
}
