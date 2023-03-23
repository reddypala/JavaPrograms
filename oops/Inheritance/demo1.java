package oops.Inheritance;

public class demo1 {
    public static void main(String[] args) {
        // Create an object of the derived class.
        DerivedClass d = new DerivedClass();

        // Call features() method from the derived class using object reference variable
        // d.
        d.features(); // Call ownFeature() method using reference variable d.
        d.ownFeature();
    }
}

class BaseClass {

    void features() {
        System.out.println("Feature A");
        System.out.println("Feature B");
    }
}

class DerivedClass extends BaseClass {
    void ownFeature() {
        System.out.println("Feature C");
    }
}
