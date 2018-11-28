package o8;

public class O8 {
}

class Parent {
    String first() {
        //этот комент показывает какой будет унаследование
//        т.е. в Child будет возврат second от Parent
        return /*this.*/second;
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