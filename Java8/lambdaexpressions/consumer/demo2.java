package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Honey", 20000, "female"));
        empList.add(new Employee("kavi", 15000, "female"));
        empList.add(new Employee("johny", 33000, "male"));
        empList.add(new Employee("kumark", 40000, "male"));
        empList.add(new Employee("Ashok", 50000, "male"));
        empList.add(new Employee("Ramya", 25000, "female"));

        Function<Employee, Integer> f = emp -> (emp.salary * 10) / 100;
        Predicate<Integer> pr = b -> b >= 5000;
        Consumer<Employee> c = emp -> {
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };

        for (Employee e : empList) {
            int bonus = f.apply(e);
            if (pr.test(bonus)) {
                c.accept(e);
                System.out.println("bonus value is:" + " " + bonus);
            }
        }
    }
}

class Employee {
    String ename;
    int salary;
    String gender;

    Employee(String name, int sal, String gen) {
        this.ename = name;
        this.salary = sal;
        this.gender = gen;
    }
}
