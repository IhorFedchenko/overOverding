package o1;

public class O1 {
}
class ParentMessage {
//    msg.call(); как бы Parent, но в метод можно передать вполне законно его наследника
//    что и вызовет метод наследника.
    void call() {
        System.out.println("Parent");
    }
}
class ChildMessage extends ParentMessage {
    void call() {
        System.out.println("Child");
    }
}
class Test {
    public static void main(String[] args) {
        send(new ChildMessage());
    }
    public static void send(ParentMessage msg) {
        msg.call();
    }
}
