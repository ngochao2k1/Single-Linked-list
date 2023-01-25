package StructuresData;

import java.util.Objects;

class MyLink_list<T> {
    Node head;
    public MyLink_list() {
        head = new Node();
    }
    class Node{
        T value;
        Node next ;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public void addHead(T value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void addRail(T value){
        Node current = head;
        while(current.next  != null){
            current = current.next;
        }
        current.value = value;
        Node rail = new Node();
        current.next = rail;
    }
    public boolean Insert(T value, int position){
        if(position > size()) return false;

        Node current = head;
        int dem=1;
        while(dem != position){
            dem++;
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }
    public boolean Delete(int position){
        if(position > size()) return false;
        if(position <= 1){
            head = head.next;
            return true;
        }
        int dem = 1;
        Node current = head;
        while(dem!=position){
            dem++;
            current = current.next;
        }
        Node temp = head;
        while(temp.next != current){
            temp = temp.next;
        }
        temp.next = current.next;
        return true;
    }
//    public boolean contains (T value){
//
//    }
    public int size(){
        int size =0;
        Node current= head;
        while(current.next != null){
            size++;
            current = current.next;
        }
        return size;
    }
    public void print(){
        Node temp = head ;
        while(temp.next != null){
            System.out.print(temp.value+ " ");
            temp = temp.next ;
        }
    }
}
