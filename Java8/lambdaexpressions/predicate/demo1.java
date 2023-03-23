//print strings whose length is greater than 4
//predicate interface contains only single abstract method called "test" returns boolena value
package predicate;

import java.util.function.Predicate;

public class demo1 {
    public static void main(String[] args) {
        String[] names = {"david","scott","smith","john","marry"};
        Predicate<String> pr = p->p.length()>4;
        boolean value =pr.test("welcome");
        System.out.println(value);
        for (String name : names) {
            if(pr.test(name)){
                System.out.println(name);
            }
        }
    }
}
