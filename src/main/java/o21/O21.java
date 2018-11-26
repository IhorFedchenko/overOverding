package o21;

public class O21 {
}
abstract class A {
    String first() {return second();}
    abstract String second();
    String third() {return "A";}
}
class B extends A {
    String second() {return third();}
}
class C extends B {
    String third() {return "C";}
}
class Test {
    public static void main(String[] args) {
        B ref = new C();
        System.out.println(ref.first());
    }
}