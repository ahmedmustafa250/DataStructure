package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//    //Binary Search
        int [] arr={2,4,6,8,16,32,64,98};
        BinarySearch bs=new BinarySearch(98);
        bs.find(arr);



//
//    //Bubble sort
        int [] arr1={12,22,64,90,11,25,34,0,7,1000,500,19,39,50,0};
        BubbleSort bs1=new BubbleSort(arr1);
        bs1.bubbleSort();
        bs1.display();
        System.out.println("");


//    //Selection sort
        int [] arr2={12,22,64,90,11,25,34,0,7,1000,500,19,39,50,0};
        SelectionSort bs2=new SelectionSort(arr2);
        bs2.selectionSort();
        bs2.display();
        System.out.println("");



//    //Alphabetically Sort Array
        String [] fruits={"mango","banana","apple","water","grapes"};
        AlphabeticallySorting As=new AlphabeticallySorting();
        System.out.println(Arrays.toString(As.alphabeticallySort(fruits)));


//        Selection Sort
        int [] arr3={12,22,64,90,11,25,34,0,7,1000,500,19,39,50,0};
        InsertionSort ins=new InsertionSort(arr3);
        ins.insertion();
        ins.display();




        }
}
