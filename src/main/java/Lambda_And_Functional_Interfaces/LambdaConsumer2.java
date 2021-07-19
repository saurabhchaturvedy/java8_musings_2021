package main.java;

import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer2 {


    static Consumer<Student> studentConsumer = (student) -> System.out.println(student.getName());
    static Consumer<Student> studentConsumer2 = (student) -> System.out.println(student.getActivities());


    private static void printStudents()
    {


        List<Student> allStudents = StudentDataBase.getAllStudents();

        allStudents.forEach(studentConsumer);
    }


    private static void printAllStudentNamesAndActivities()
    {
        

        List<Student> allStudents = StudentDataBase.getAllStudents();

        allStudents.forEach(studentConsumer.andThen(studentConsumer2));
    }


    private static void printAllStudentNamesAndActivitiesUsingCondition()
    {
       

        List<Student> allStudents = StudentDataBase.getAllStudents();

        allStudents.forEach(student -> {

            if(student.getGradeLevel()>=4)
            {
                System.out.println(student.getName());
            }
        });

    }

    public static void main(String[] args) {

        printStudents();
        printAllStudentNamesAndActivities();
        System.out.println("filtering ::");
        printAllStudentNamesAndActivitiesUsingCondition();
    }
}
