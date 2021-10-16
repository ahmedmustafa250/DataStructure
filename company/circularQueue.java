package com.company;

public class circularQueue {
    int rear;
    int front;
    int size;
    int [] array;
    circularQueue(int length){
        this.size=length;
        this.array=new int[size];
        front=-1;
        rear=-1;
    }
    public void insert(int n){
         if(rear==-1 && front==-1){
             rear=0;
             front=0;
             array[rear]=n;
         }
         else if((rear+1)%size==front){
             System.out.println("Queue is full");
         }
         else{
             rear=(rear+1)%size;
             array[rear]=n;
         }
    }
    public void remove(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is UnderFLow");
        }
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%size;
        }
    }

    public void display(){
        if(rear==-1 && front==-1){
            System.out.println("Array is Empty");
        }
        else{
            int i=front;
            while (i!=rear){
                System.out.println(array[i]);
                i=(i+1)%size;
            }
            System.out.println(array[i]);

        }
    }

    public void peek(){
        if(rear==-1 && front==-1){
            System.out.println("Queue is Empty and Peek does not exist");
        }
        else{
            System.out.println(array[front]);
        }
    }


}

