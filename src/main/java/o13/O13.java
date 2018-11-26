package o13;

public class O13 {
}
class Parent {
    static String first() {
        return second();
    }
    String second() {
        return "Parent";
    }
}
class Child extends Parent {
    String second() {
        return "Child";
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}