package o14;

public class O14 {
}
class Parent {
    static String first() {
        return second;
    }
    static String second = "Parent";
}
class Child extends Parent {
    static String second = "Child";
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}