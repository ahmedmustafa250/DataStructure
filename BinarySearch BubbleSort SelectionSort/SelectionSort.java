package com.company;

public class SelectionSort {
    public int [] selectionSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            int first=i;
            for(int j=i+1;j<array.length;j++){
                if(array[first]>array[j]){
                    int temp=array[first];
                    array[first]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
