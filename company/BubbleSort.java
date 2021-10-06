package com.company;

public class BubbleSort {
    private int array [];
    BubbleSort(int [] array){
        this.array=array;
    }

    public void display(){
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] +" ");
        }
    }

    public void bubbleSort(){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int num=array[j];
                    array[j]=array[j+1];
                    array[j+1]=num;
                }
            }
        }
    }

}
