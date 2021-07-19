package main.java;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaBipredicate {


    static Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s)-> s.getGpa()>=3.2;

    static BiConsumer<String, List<String>> stringListBiConsumer = (student, activities) -> {
        System.out.println(student+" "+activities);
    };

    static BiPredicate<Integer,Double> integerDoubleBiPredicate = (gradeLevel,gpa)-> gradeLevel>=3 && gpa>=3.0;

    static Consumer<Student> studentConsumer = (student) -> {

        if(integerDoubleBiPredicate.test(student.getGradeLevel(),student.getGpa()))
        {
            stringListBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public static void main(String[] args) {

        List<Student> allStudents = StudentDataBase.getAllStudents();

        allStudents.forEach(studentConsumer);

    }
}
