package o10;

public class O10 {
}
//Статические переменные коректно записывать через имя класа, как в коментарии,
//по этому Child.first() выведет "Parent"
class Parent {
    String first() {
        return /*Parent.*/second;
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