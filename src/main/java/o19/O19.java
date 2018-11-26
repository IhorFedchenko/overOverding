package o19;

public class O19 {
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
        A ref = new B();
        System.out.println(ref.first());
    }
}