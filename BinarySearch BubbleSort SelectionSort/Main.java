package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


    //Binary Search
        int [] arr={2,4,6,8,16,32,64,98};
        BinarySearch bs=new BinarySearch(64);
        bs.find(arr);

    // Taken Array for sorting...
        int [] arr1={12,22,64,90,11,25,34,0,7,1000,500,19,39,50,0};

    //Bubble sort
        BubbleSort bs1=new BubbleSort();
        for(int vul:bs1.sort(arr1)){
            System.out.print(vul+" ");
        }

    //Selection sort
        SelectionSort bs2=new SelectionSort();
        for(int vul: bs2.selectionSort(arr1)){
            System.out.print(vul+" ");
        }

    //Alphabetically Sort Array
        String [] fruits={"mango","banana","apple","water","grapes"};
        AlphabeticallySorting As=new AlphabeticallySorting();
        System.out.println(Arrays.toString(As.alphabeticallySort(fruits)));

        }
}
