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
//        l.head.next.next.next.next = l.head.next;
        // testing
//        System.out.println(detectTheLoopLinkList.detect2(l));
//        System.out.println(detectTheLoopLinkList.lengthLoop1(l));
//        System.out.println(detectTheLoopLinkList.lengthLoop2(l));
        //reserve Linked-list
//        MyLink_list<Integer> reserve = ReserveLinkedlist.reserve1(l);
//        reserve.print();
        //test Intersection
        MyLink_list<Integer> l2 = new MyLink_list<>();
        l2.addHead(2);
        l2.addRail(4);
        //l2.addRail(5);
        IntersectionPoint2Linkedlist.sortedIntersection(l,l2).print();
//        l2.head.next = l.head.next.next.next;
//        l2.print();
        //System.out.println(detectTheLoopLinkList.lengthLoop2(l2));
//        System.out.println(IntersectionPoint2Linkedlist.get1(l,l2));
//        System.out.println(IntersectionPoint2Linkedlist.get2(l,l2));
//        System.out.println(IntersectionPoint2Linkedlist.get3(l,l2));

    }
}
