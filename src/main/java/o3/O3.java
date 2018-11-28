package o3;

public class O3 {
}
class ParentMessage {
//    хороший тон это когда у наследника не дублируются поля
//    TODO разобраться с этим поведением, пока что не все ясно как происходит.
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