package com.company;

public class priorityQueue {
    int rear;
    int front;
    int size;
    int [] array;
   priorityQueue(int length){
        this.size=length;
        this.array=new int[size];
        front=-1;
        rear=-1;
    }
    public void add(int n){
       if(rear==size-1){
              System.out.println("Queue overFlow");
          }
       else if(rear==-1 && front==-1){
           rear=0;
           front=0;
           array[rear]=n;
       }
       else{
           array[++rear]=n;
           for(int i=1;i<array.length;i++){
               int temp=array[i];
               int j=i;
               while(j>0 && array[j-1]<temp){
                   array[j]=array[j-1];
                   j--;
               }
               array[j]=temp;
           }
        }
    }
    public void poll(){
       if(rear==-1 && front==-1){
           System.out.println("Priority queue is Empty");
       }
       else if(rear==front){
           System.out.println("Priority Queue under Flow");
       }
       else{
           System.out.println(array[front]);
           front++;
       }

    }

    public void peek(){
        if(rear==-1 && front==-1){
            System.out.println("Priority queue is Empty peek doesn't exist");
        }
       else{
            System.out.println(array[front]);
       }
    }

    public void display(){
       for(int val:array){
           System.out.print(val+" ");
       }
        System.out.println("");
    }



}
