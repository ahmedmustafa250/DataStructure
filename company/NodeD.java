package com.company;

public class NodeD {
    int data;
    NodeD next;
    NodeD previous;
    NodeD(){
        this.data=0;
        this.next=null;
        this.previous=null;
    }
    NodeD(int data,NodeD next,NodeD previous){
        this.data=data;
        this.next=next;
        this.previous=previous;
    }
}
