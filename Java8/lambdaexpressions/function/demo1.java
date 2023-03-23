package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/** this "function" functional interface has method "apply" */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("John", 50000, 5));
        al.add(new Employee("david", 30000, 4));
        al.add(new Employee("scott", 40000, 6));
        al.add(new Employee("annae", 34000, 3));
        al.add(new Employee("maria", 32000, 3));
        // lambda expression
        Function<Employee, Integer> fn = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000) {
                return (sal * 10 / 100);
            } else if (sal >= 20000 && sal <= 30000) {
                return (sal * 20 / 100);
            } else if (sal >= 30000 && sal <= 50000) {
                return (sal * 30 / 100);
            } else {
                return (sal * 40 / 100);
            }
        };

        Predicate<Integer> pr = b -> b > 10000;

        for (Employee emp : al) {
            int bonus = fn.apply(emp);
            if (pr.test(bonus)) {
                System.out.println(emp.ename + " " + emp.salary);
                System.out.println("bonus is:" + " " + bonus);
            }

        }
    }
}

class Employee {
    String ename;
    int salary;
    int experience;

    Employee(String name, int sal, int exp) {
        this.ename = name;
        this.salary = sal;
        this.experience = exp;
    }
}