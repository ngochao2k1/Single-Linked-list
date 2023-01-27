package StructuresData;

public class main {
    public static void main(String[] args) {
        MyLink_list<Integer> l = new MyLink_list<>();
        l.addRail(1);
        l.addRail(2);
        l.addRail(3);
        l.addRail(4);
        l.addRail(5);
        // create a loop for testing
        l.head.next.next.next.next = l.head.next;
        // testing

        System.out.println(detectTheLoopLinkList.detect2(l));

    }
}
