package o24;

public class O24 {
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
        Parent ref = new Child();
        System.out.println(ref.first());
    }
}