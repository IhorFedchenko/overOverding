package o11;

public class O11 {
}
//Закоментировано то что происходит на самом деле. Статические методы и переменные вызываются через имя класса.
//
class Parent {
    String first() {
        return /*Parent.*/second();
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