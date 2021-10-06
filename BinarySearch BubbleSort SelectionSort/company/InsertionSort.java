package com.company;

public class InsertionSort {
    private int [] insertionArray ={};
    InsertionSort(int [] array){
        this.insertionArray=array;
    }

    public void display(){
        for(int i=0;i< insertionArray.length;i++){
            System.out.print(insertionArray[i] +" ");
        }
    }

    public  void insertion(){
        for(int out=1;out< insertionArray.length;out++){
            int temp=insertionArray[out];
            int in=out;
            while(in>0 && insertionArray[in-1]>temp){
                insertionArray[in]=insertionArray[in-1];
                in--;
            }
            insertionArray[in]=temp;
        }

    }


}
