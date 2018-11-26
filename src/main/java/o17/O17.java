package o17;

public class O17 {
}
abstract class Parent {
    String first() {
        return second();
    }
    abstract String second();
    static String third() {
        return "Parent";
    }
}

class Child extends Parent {
    String second() {
        return third();
    }
    static String third() {
        return "Child";
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}