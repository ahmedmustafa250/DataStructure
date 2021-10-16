package com.company;

public class queue {
    int front;
    int rear;
    int size;
    int [] array;
    int count=0;
    queue(int size){
        this.size=size;
        this.array=new int [size];
        this.front=-1;
        this.rear=-1;
    }
    public void insert(int n){
        if(rear==size-1){
            System.out.println("Queue is OverFlow");
        }
        else if(front==-1 && rear==-1){
            front=0;
            rear=0;
            array[rear]=n;
        }
        else{
            rear++;
            array[rear]=n;
        }
    }
    public void remove(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is UnderFlow");
        }
        else if(front==rear){
            System.out.println(array[front]);
            rear=-1;
            front=-1;
        }
        else {
            System.out.println(array[front]);
            front++;
        }
    }
    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty");
        }
        else{
            for(int val:array){
                System.out.print(val+" ");
            }
            System.out.println("");
        }

    }

    public void peek(){
        if(front==1 && rear==-1){
            System.out.println("Queue is Empty Peek value not exist ");
        }
        else{
            System.out.println(array[front]);
        }
    }

    public void isEmpty(){
        if(rear==-1 && front==-1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public void isFull(){
        if(rear==size-1){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }


}
