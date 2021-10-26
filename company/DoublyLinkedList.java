package com.company;

public class DoublyLinkedList {
    int size;
    NodeD head;

    DoublyLinkedList(){
        this.size=0;
        this.head=null;
    }
    public void insertAtFirst(int val){
        if (head==null){
            NodeD n=new NodeD();
            n.data=val;
            n.next=null;
            n.previous= null;
            head=n;

        }
        else{
            NodeD n=new NodeD();
            n.data=val;
            n.next=head;
            head.previous=n;
            head=n;

        }
        size++;
    }
    public void insertAtLast(int val){
        if(head==null){
            NodeD n=new NodeD();
            n.data=val;
            n.previous=null;
            n.next=null;
            head=n;
        }
        else{
            NodeD n=new NodeD();
            n.data=val;
            NodeD t;
            t=head;
            while(t.next!=null){
                t=t.next;
            }
            n.previous=t;
            t.next=n;
        }
        size++;
    }
    public void insertAtPos(int val,int pos){
        if(head==null) return;
        if(pos<1 || pos>size) return;
        NodeD t;
        t=head;
        for(int i=1;i<pos;i++){
            t=t.next;
        }
        if(t.previous==null){
            NodeD n=new NodeD();
            n.data=val;
            n.previous=null;
            n.next=t;

            t.previous=n;
            head=n;
        }
        else{
            NodeD n=new NodeD();
            n.data=val;
            n.previous=t.previous;
            n.next=t;

            t.previous.next=n;
            t.previous=n;

        }
        size++;
    }

    public void isEmpty(){
        if(head==null)
            System.out.println("true");
        else
            System.out.println("false");
    }
    public void size(){
        System.out.println(size);
    }

    public void display(){
        if(head==null)
            System.out.println("Doublylinked list is Empty");
        else{
            NodeD t;
            t=head;
            while(t.next!=null){
                System.out.print(t.data+" ");
                t=t.next;
            }
            System.out.println(t.data);
        }
    }
    public void removeFront(){
        if(head==null)
            return;
        head=head.next;
        head.previous=null;
        size--;
    }

    public void  removeRear(){
        if(head==null) return;
        if(head.next==null){
            head=null;
            size--;
        }
        else{
            NodeD t;
            t=head;
            while(t.next.next!=null){
                t=t.next;
            }
            t.next=null;
            size--;
        }
    }
    public void removeAt(int pos){
        if(head==null) return;
        if(pos<1 || pos>size ) return;
        NodeD t;
        t=head;
        for(int i=1;i<pos;i++){
            t=t.next;
        }
        if(t.next==null){
            t.previous.next=null;
        }
        else if(t.previous==null){
            t=t.next;
            t.previous=null;
            head=t;
        }
        else{
            t.previous.next=t.next;
            t.next.previous=t.previous;
        }
        size--;
    }

}









