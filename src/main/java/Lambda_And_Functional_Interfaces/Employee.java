package main.java;

import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 20, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(collect);


        List<String> collect1 = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

        System.out.println(collect1);


        Map<String, Double> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(collect2);


        Optional<Employee> collect3 = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(collect3.get());


        List<Employee> collect4 = employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).collect(Collectors.toList());

        System.out.println(collect4);


        Map<String, Long> collect5 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(collect5);

        Map<String, Double> collect6 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));

        System.out.println(collect6);

        Optional<Employee> min = employeeList.stream().filter(employee -> employee.getDepartment().equals("Product Development")).min(Comparator.comparing(Employee::getAge));

        System.out.println(min);


        Optional<Employee> first = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        System.out.println(first);


        Map<String, Long> sales_and_marketing = employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(sales_and_marketing);


        Map<String, Double> collect7 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collect7);


        Map<String, List<Employee>> collect8 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for(Map.Entry<String,List<Employee>> entry : collect8.entrySet())
        {
            System.out.println(entry.getKey()+" "+collect8.get(entry.getKey()));


        }


        DoubleSummaryStatistics collect9 = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(collect9);

        Map<Boolean, List<Employee>> collect10 = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() <= 25));

        System.out.println(collect10);


        Optional<Employee> min1 = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

        System.out.println(min1);


    }
    
    
    
}
