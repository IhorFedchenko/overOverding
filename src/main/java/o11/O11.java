package o11;

public class O11 {
}
class Parent {
    String first() {
        return second();
    }
    static String second() {
        return "Parent";
    }
}
class Child extends Parent {
    static String second() {
        return "Child";
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}