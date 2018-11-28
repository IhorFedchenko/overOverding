package o9;

public class O9 {
}
class Parent {
//    Унаследованный метод позвращает переопределенный метод.
    String first() {
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