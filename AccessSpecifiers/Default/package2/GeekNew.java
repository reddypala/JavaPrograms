package AccessSpecifiers.Default.package2;
import AccessSpecifiers.Default.package1.Geek;
// different package non-subclass
class GeekNew extends Geek {
    public static void main(String[] args) {
         Geek g = new Geek(); // compile time error
         g.display(); // outside the package default members are not accaesible and even in subclass also not accesible.
    }    
}
