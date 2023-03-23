package AccessSpecifiers.Protected.pack;

import AccessSpecifiers.Protected.mypack.demo1;

// outside the package non-subclass(no extends)
public class Demo1 {
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        d1.msg(); // In the non subclass,outside the package,protected methods are not visible from another package.
    }
}
