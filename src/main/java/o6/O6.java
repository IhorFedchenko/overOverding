package o6;

public class O6 {
}
class Parent {
//    output: Parent() Child(int) так как у наследника в конструкторе всега не явно будет как в коментарии
    Parent() {
        System.out.println("Parent()");
    }
    Parent(int i) {
        System.out.println("Parent(int)");
    }
}
class Child extends Parent {
    Child() {
//        super(); во всех конструкторах наследников "этого сезона, встречайте"
        System.out.println("Child()");
    }
    Child(int i) {
//        super();
        System.out.println("Child(int)");
    }
}
class Test {
    public static void main(String[] args) {

        new Child();
    }
}