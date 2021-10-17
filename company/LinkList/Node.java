package com.company;

public class Node {
        int data;
        Node next;
        Node(){
             this.data=0;
             this.next=null;
        }
        Node(int d,Node n){
            this.data=d;
            this.next=n;
        }

}
