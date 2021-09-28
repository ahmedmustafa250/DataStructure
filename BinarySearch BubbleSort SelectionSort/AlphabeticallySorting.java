package com.company;

public class AlphabeticallySorting {

    public String [] alphabeticallySort(String [] array){
        
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i].compareTo(array[j])>0){
                    String temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
