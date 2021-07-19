package main.java;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaConsumer {


    static Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
   static Predicate<Student> p2 = (s)-> s.getGpa()>=3.2;

    static BiConsumer<String, List<String>> stringListBiConsumer = (student, activities) -> {
        System.out.println(student+" "+activities);
    };

    static Consumer<Student> studentConsumer = (student) -> {

        if(p1.and(p2).test(student))
        {
            stringListBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public static void main(String[] args) {

        List<Student> allStudents = StudentDataBase.getAllStudents();

        allStudents.forEach(studentConsumer);

    }
}
