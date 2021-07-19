package main.java;

import java.util.List;

public class Supplier {

    static java.util.function.Supplier<List<Student>> listSupplier = StudentDataBase::getAllStudents;

    public static void main(String[] args) {

        System.out.println(listSupplier.get());
    }
}
