package o3;

public class O3 {
}
class ParentMessage {
//    хороший тон:
// 1. это когда у наследника не дублируются поля
// 2. инкапсулированы поля.

//   Под видом какого класса мы переменную используем, та и будет вызываться.

    String call = "Parent";
}
class ChildMessage extends ParentMessage {
    String call = "Child";
}
class Test {
    public static void main(String[] args) {
        send(new ChildMessage());
    }
    public static void send(ParentMessage msg) {
        System.out.println(msg.call);
    }
}