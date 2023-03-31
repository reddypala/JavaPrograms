package oops.ClassesRelationships;

public class testonetoone {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("John");
        Person p2 = new Person();
        p2.setName("som");

        Passport pp1 = new Passport();
        pp1.setPassportNum(12345678);
        Passport pp2 = new Passport();
        pp2.setPassportNum(54543656);

        // Association between two classes in the main method.
        System.out.println(p1.getName() + " has a US passport whose passport no is: " + pp1.getPassportNum());
        System.out.println(p2.getName() + " has an Indian passport whose passport no is: " + pp2.getPassportNum());

    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Passport {
    private int passportno;

    public int getPassportNum() {
        return passportno;
    }

    public void setPassportNum(int num) {
        this.passportno = num;
    }
}
