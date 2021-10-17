package com.company;

public class LinkedList {
    int size;
    Node start;

    LinkedList(){
        this.size=0;
        this.start=null;
    }
    public void insertAtFirst(int val){
        Node n=new Node();
        n.data=val;
        n.next=start;
        start=n;
        size++;
    }
    public void  insertAtEnd(int val){
        Node n=new Node();
        n.data=val;

        Node t;
        t=start;
        if(t==null){
            start=n;
            size++;
        }
        else{
            while(t.next!=null){
                t=t.next;
            }
            t.next=n;
            size++;

        }
    }


    public void insertAtPos(int val,int pos){
        if(pos==1){
            insertAtFirst(val);
        }
        else if(pos==size+1){
            insertAtEnd(val);
        }
        else if(pos>1 && pos<size+1){
            Node n=new Node();
            n.data=val;

            Node t;
            t=start;
            for(int i=1;i<pos-1;i++){
                t=t.next;
            }
            n.next=t.next;
            t.next=n;
            size++;

        }
    }









    public boolean isEmpty(){
        if(start==null){
            return true;
        }
        else{
            return false;
        }
    }
    public int  getSize(){
        return size;
    }
    public void displayList(){
        Node t;
        if(isEmpty()){
            System.out.println("Linked List is Empty");
        }
        else{
            t=start;
            for(int i=1;i<=size;i++){
                System.out.print(" "+t.data);
                t=t.next;
            }
            System.out.println("");
        }
    }
    public void deleteAtFirst(){
        if(start==null){
            System.out.println("List is Already Empty");
        }
        else{
            start=start.next;
            size--;
        }
     }
    public void deleteAtLast(){
        if(start==null){
            System.out.println("List is Already Empty");
        }
        else if(size==1){
            start=null;
            size--;
        }
        else{
            Node t;
            t=start;
            for (int i=1;i<size-1;i++){
                t=t.next;
            }
            t.next=null;
            size--;
        }

    }

    public void deletepos(int pos){
        if(pos<1 || pos>size){
            System.out.println("InValid postion");
        }
        else if(pos==1){
            deleteAtFirst();
        }
        else if(pos==size){
            deleteAtLast();
        }
        else {
            Node t,t1;
            t=start;
            for(int i=1;1<pos-1;i++){
                t=t.next;
            }
            t1=t.next;
            t.next=t1.next;
            size--;
        }
    }





}
