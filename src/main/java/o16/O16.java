package o16;

public class O16 {
}
abstract class Parent {
    String first() {
        return second();
    }
    abstract String second();
    String third() {
        return "Parent";
    }
}
class Child extends Parent {
    String second() {
        return third();
    }
    String third() {
        return "Child";
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}