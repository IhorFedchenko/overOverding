package o23;

public class O23 {
}
class Parent {
    static String first() {
        return second();
    }
    static String second() {
        return "Parent";
    }
}

class Child extends Parent {
    static String first() {
        return second();
    }
    static String second() {
        return "Child";
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}