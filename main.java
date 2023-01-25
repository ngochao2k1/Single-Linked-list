package StructuresData;

import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        MyLink_list<String> l = new MyLink_list<>();
        l.addRail("mot");
        l.addRail("hai");
        l.addRail("ba");
        //System.out.println(l.Insert("insert",1));
        l.print();
        System.out.println(l.Delete(3));
        l.addRail("test");
        l.print();
    }
}
