package o4;

public class O4 {
}
class ParentMessage {
    static String call = "Parent";
}
class ChildMessage extends ParentMessage {
    static String call = "Child";
}
class Test {
    public static void main(String[] args) {
  send(new ChildMessage()); //тут будет как нижнем коменте, который выведет Parent, так работает статика.
        /*ParentMessage parentMessage = new ChildMessage();
        System.out.println(parentMessage.call);*/
    }
    public static void send(ParentMessage msg) {
        System.out.println(msg.call);
    }
}