package consumer;

import java.util.function.Consumer;

/** consumer functional interface takes one parameter as input and returns nothing. */
public class demo1 {
    public static void main(String[] args) {
        Consumer<String> c = s->System.out.println(s);
        c.accept("welcome");
    }
}
