package StructuresData;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionPoint2Linkedlist {
    // 2 loop  is not
    public static int get1(MyLink_list l1,  MyLink_list l2){
        MyLink_list.Node head1 = l1.head;
        MyLink_list.Node head2 = l2.head;
        while(head1.next != null){

            while(head2.next != null){
                if(head1 == head2){
                    return (int) head1.value;
                }
                head2 = head2.next;
            }
            head2 = l2.head;
            head1 = head1.next;
        }
        return -1;
    }
    //
    public static int get2(MyLink_list l1,  MyLink_list l2){
        HashSet<MyLink_list.Node> set =  new HashSet<>();
        MyLink_list.Node h1 = l1.head;
        MyLink_list.Node h2 = l2.head;
        while(h1.next != null){
            set.add(h1);
            h1 = h1.next;
        }
        while(h2.next != null){
            if(set.contains(h2)){
                return (int) h2.value;
            }
            h2=  h2.next;
        }
        return -1;
    }
    public static int get3(MyLink_list l1, MyLink_list l2){
        int size1 = l1.size();
        int size2 = l2.size();
        MyLink_list.Node h1 = l1.head;
        MyLink_list.Node h2 = l2.head;
        int d = Math.abs(size1-size2);
        if(size1 > size2){
            for(int i =0; i<d ; i++){
                h1 = h1.next;
            }
        }
        else{
            for(int i =0; i<d ; i++){
                h2 = h2.next;
            }
        }
        while (h1!=h2){
            h1 = h1.next;
            h2 = h2.next;
        }
        return (int) h1.value;
    }
    public static MyLink_list sortedIntersection(MyLink_list l1, MyLink_list l2){
        Set<Integer> set = new HashSet<>();
        MyLink_list.Node h1 = l1.head;
        MyLink_list.Node h2 = l2.head;
        while(h1.next!=null){
            set.add((Integer) h1.value);
            h1= h1.next;
        }
        MyLink_list list = new MyLink_list<>();
        while(h2.next!=null){
            if(set.contains(h2.value)){
                list.addRail(h2.value);
            }
            h2 = h2.next;
        }
        return list;
    }
}
