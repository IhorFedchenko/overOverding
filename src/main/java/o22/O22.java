package o22;

public class O22 {
}
abstract class A {
    String first() {return second();}
    abstract String second();
    static String third() {return "A";}
}
class B extends A {
    String second() {return third();}
}
class C extends B {
    static String third() {return "C";}
}
class Test {
    public static void main(String[] args) {
        System.out.println(new C().first());
    }
}