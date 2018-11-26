package o12;

public class O12 {
}
class Parent {
    static String first() {
        return second;
    }
    String second = "Parent";
}
class Child extends Parent {
    String second = "Child";
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}