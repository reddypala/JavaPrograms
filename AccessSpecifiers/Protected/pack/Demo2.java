package AccessSpecifiers.Protected.pack;

import AccessSpecifiers.Protected.mypack.demo1;
//outside the package, subclass to class in another package( extending class)
public class Demo2 extends demo1 {
    public static void main(String[] args) {
        Demo2 D2 = new Demo2();
        D2.msg();
        D2.msg2();
       
        
    }

    void msg2(){
        System.out.println("I am method from Demo2 class");
    }
}

