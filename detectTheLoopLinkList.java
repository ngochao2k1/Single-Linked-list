package StructuresData;

import java.util.HashSet;
import java.util.Set;

public class detectTheLoopLinkList {
    public static boolean detect1(MyLink_list list){
        // Implementation of Floyd’s Cycle-Finding Algorithm
        MyLink_list.Node fast = list.head;
        MyLink_list.Node slow = list.head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static boolean detect2(MyLink_list list){
        //using hashSet
        Set<MyLink_list.Node> set = new HashSet<>();
        MyLink_list.Node current = list.head;
        while(current.next != null){
            if(set.contains(current)){
                return true;
            }
            set.add(current);
            current = current.next;
        }
        return false;
    }

    //find length the Loop
    // just find a  point in a Loop...
    public static int lengthLoop1(MyLink_list list){
        int count = 1;
        MyLink_list.Node fast = list.head;
        MyLink_list.Node slow = list.head;
        MyLink_list.Node flag = list.head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                flag = fast;
                while (flag.next != fast ){
                    count++;
                    flag = flag.next;
                }
                return count;
            }
        }
        return 0;
    }
    public static int lengthLoop2(MyLink_list list){
        int count =1;
        Set<MyLink_list.Node> set = new HashSet<>();
        MyLink_list.Node curr = list.head;
        while (curr.next != null){
            if(set.contains(curr)){
                MyLink_list.Node flag = curr;
                while (flag.next != curr){
                    count++;
                    flag = flag.next;
                }
                return count;
            }
            set.add(curr);
            curr = curr.next;
        }
        return 0;
    }
}
