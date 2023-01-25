package StructuresData;

public class Linklist {
    node head ;

    public Linklist() {
        head = new node();
    }

    static class node{
        int value;
        node next;
        public node() {
        }
        public node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public void addHead(int a){
            node newNode = new node(a);
            newNode.next = head;
            head = newNode;
    }
    public void addRail(int a){
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.value = a;
        node rail = new node();
        temp.next = rail;
    }
    public void insert(int position, int value){
        int dem =0 ;
        node temp = head;
        while(dem != position){
            temp = temp.next;
            dem++;
        }
        node Next = temp.next;
        node  newNode =new node(value);
        temp.next = newNode;
        newNode.next = Next;
    }
    public boolean search(int value){
        node current = head;
        while(current.next != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean search2(node current,int value){
        if(current.value == value) return true;
        if(current.next == null) return false;
        return search2(current.next,value);
    }
    public void headDelete(){
        if(head.next == null) return;
        head = head.next;
    }
    public void railDelete(){
        if(head.next == null) return;
        node current = head;
        while(current.next != null){
            current = current.next;
        }
    }
    public boolean delete(int a){
        node current = head;
        if(current.value == a) {
            head = head.next;
            return true;
        }
        if(!search(a)) return false;
        while(current.value != a){
            current = current.next;
        }
        node temp = head;
        while(temp.next != current){
            temp = temp.next;
        }
        temp.next = current.next;
        System.gc();
        return true;
    }

    public void print(){
        node temp = head ;
        while(temp.next != null){
            System.out.print(temp.value+ " ");
            temp = temp.next ;
        }
    }
}
