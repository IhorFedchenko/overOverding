package o5;

public class O5 {
}
class Parent {
    Parent() {
        System.out.println("Parent()");
    }
    Parent(int i, int j) {
        System.out.println("Parent(int,int)");
    }
}
class Child extends Parent {
    Child() {
        System.out.println("Child()");
    }
    Child(int i) {
        System.out.println("Child(int)");
    }
}
class Test {
    public static void main(String[] args) {
        //конструктор нельзя унаследовать, должен быть такой же как и в классе.
//        new Child(0,0);
    }
}