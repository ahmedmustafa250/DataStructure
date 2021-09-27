package com.company;
//[2,4,6,8,16,32,64,98]
public class BinarySearch {
    private int search;
    BinarySearch(int search){
        this.search=search;
    }
    public void find(int [] arr){
        int low=0;
        int high=(arr.length)-1;
        while(low<=high){
            int mid=(int) Math.ceil((double)(low+high) / 2);
            if(search==arr[mid]){
                System.out.println("'"+search+"'" +" is placed at "+mid+" index");
                break;
            }
            else if(search<arr[mid]){
                high=mid-1;
            }
            else if(search>arr[mid]){
                low=mid+1;
            }
        }
    }
}
