package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//using filter and map 
public class Mapdemo4 {
    public static void main(String[] args) {
        List<Employee> emplist = Arrays.asList(
                new Employee(101, "alex", 10000),
                new Employee(102, "Brian", 20000),
                new Employee(103, "Charles", 30000),
                new Employee(104, "David", 40000),
                new Employee(105, "Edward", 50000)

        );

        // Requirement: filter the employees with sal>20000 and collect them into other
        // collection
        List<Integer> salList = emplist.stream().filter(s -> s.salary > 20000)
                .map(e -> e.salary).collect(Collectors.toList());
        
        System.out.println(salList);
    }
}

class Employee {
    int empid;
    String ename;
    int salary;

    Employee(int id, String name, int sal) {
        this.empid = id;
        this.ename = name;
        this.salary = sal;
    }
}