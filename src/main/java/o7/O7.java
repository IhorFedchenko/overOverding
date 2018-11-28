package o7;

public class O7 {
}
class Parent {
    Parent(){
        //без дефольтного конструктора Parent(){...} нельзя унаследовать созданный конструктор.
    }
    Parent(int i) {
        System.out.println("Parent(int)");
    }
}
class Child extends Parent {
    Child() {
        System.out.println("Child()");
    }
    Child(int i) {
//если нет дефольтного конструктора, можно super(i);
        System.out.println("Child(int)");
    }
}
class Test {
    public static void main(String[] args) {
        new Child(0);
    }
}