package main.java;

import java.util.function.Consumer;

public class MethodReference2 {


    static Consumer<Student> studentConsumer = System.out::println;

    static Consumer<Student> studentConsumer2 = Student::printActivities;


    public static void main(String[] args) {


        StudentDataBase.getAllStudents().forEach(studentConsumer);
        System.out.println("Print student activities");
        StudentDataBase.getAllStudents().forEach(studentConsumer2);

    }
}
