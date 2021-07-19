package main.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class LambdaFunction2 {


    private static Function<List<Student>, Map<String,Double>> listMapFunction = (students)->{
        Map<String,Double> stringDoubleMap = new HashMap<>();

        students.forEach(student -> {
            stringDoubleMap.put(student.getName(),student.getGpa());

        });

        return stringDoubleMap;
    };

    public static void main(String[] args) {
        System.out.println(listMapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
