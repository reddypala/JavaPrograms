package wrapperclasses;

public class demo1 {
    public static void main(String[] args) {
        int a = 50;
        Integer i = a; // autoboxing
        System.out.println(i);

        char ch = 'a'; // char data type.
        Character chrobj = Character.valueOf(ch); // Wrapping char type value into Character object.

        byte b = 10; // byte data type value.
        Byte byteobj = Byte.valueOf(b); // Wrapping byte type value into Byte object.

        int i1 = 20;
        Integer intobj = Integer.valueOf(i1); // wrapping int type value into Integer Object.

        float c = 18.6f; // float type value.
        Float floatobj = Float.valueOf(c); // Wrapping float type value into Float object.

        double d = 250.5; // double data type value.
        Double doubleobj = Double.valueOf(d); // Wrapping double data type value into Double object.

        // Displaying the values from wrapper class objects.
        System.out.println("Displaying values of Wrapper class objects:");
        System.out.println("Character object:  " + chrobj);

        System.out.println("Byte object:  " + byteobj);
        System.out.println("Integer object:  " + intobj);

        System.out.println("Float object:  " + floatobj);
        System.out.println("Double object:  " + doubleobj);

        System.out.println("\n");

        // Retrieving primitive data type values from objects.
        // Unwrapping objects to primitive data type values.
        char chr = chrobj;         
        byte by = byteobj;
        int in = intobj;     //  Unboxing is happening. Java compiler will write intobj.intValue() internally.
        float fl = floatobj;
        double db = doubleobj;

        // Displaying the values of data types.
        System.out.println("Displaying unwrapped values: ");

        System.out.println("char value: " + chr);
        System.out.println("byte value: " + by);

        System.out.println("int value: " + in);
        System.out.println("float value: " + fl);
        System.out.println("double value: " + db);
    }
}
