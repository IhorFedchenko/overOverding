package o12;

public class O12 {
}
class Parent {
    /*static */String first() {
        //инстанс переменная не может быть возвращена в статическом методе.
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