package o2;

public class O2 {
}
class ParentMessage {

    static void call() {
        System.out.println("Parent");
    }
}
class ChildMessage extends ParentMessage {
    static void call() {
        System.out.println("Child");
    }
}
class Test {
    public static void main(String[] args) {
        send(new ChildMessage());
    }
    public static void send(ParentMessage msg) {
//        Статические методы вызывать правильно ParentMessage.call();
//        public static void send(ChildMessage msg) вызовет ChildMessage.call();
        msg.call();
    }
}
