package StructuresData;

public class ReserveLinkedlist {
    public  static MyLink_list reserve1(MyLink_list list){
        MyLink_list res = new MyLink_list<>();
        MyLink_list.Node head = list.head;
        while (head.next  !=null){
            res.addHead(head.value);
            head = head.next;
        }
        return res;
    }
}
