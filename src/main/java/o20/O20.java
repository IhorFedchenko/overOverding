package o20;

public class O20 {
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
        System.out.println(new C().first());
    }
}