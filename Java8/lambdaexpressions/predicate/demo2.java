package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class demo2 {
    public static void main(String[] args) {
        
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("John", 50000, 5));
        al.add(new Employee("david", 30000, 4));
        al.add(new Employee("scott", 40000, 6));
        al.add(new Employee("annae", 34000, 3));
        al.add(new Employee("maria", 32000, 3));
        // write predicate
        Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 3);
        for(Employee e:al){
            if(pr.test(e)){
                System.out.println(e.ename+"  "+e.salary);
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
