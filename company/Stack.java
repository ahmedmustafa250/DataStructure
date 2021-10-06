package com.company;

public class Stack {
    private int top;
    int [] stackArray;
    Stack(int SizeOfStack){
        stackArray=new int[SizeOfStack];
    }
    public void push(int item){
        if(top<stackArray.length){
            stackArray[top]=item;
            top++;
        }
        else{
            System.out.println("Stack Condition is OverFlow");
        }
    }

    public void pop(){
        if(top==-1){
            System.out.println("stack is underFlow");
        }
        else{
            System.out.println("pop item : "+stackArray[top-1]);
            stackArray[top-1]=0;
            top--;
        }
    }
    public void isEmpty(){
        if(top==0 && stackArray[top]==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public void peek(){
        if(top>0){
            System.out.println("Peek item : "+stackArray[top-1]);
        }
        else{
            System.out.println("No item is at peek position");
        }
    }
    public void isFull(){
        if(top==stackArray.length){
            System.out.println("Stack is Full");
        }
        else{
            System.out.println("Stack is not full");
        }
    }

    public void displayStack(){
        for(int val:stackArray){
            System.out.print(val+" ");
        }
        System.out.println("");
    }

}
