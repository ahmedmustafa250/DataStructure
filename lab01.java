package com.company;
import java.util.*;
public class Main {

    //Reverse Array program Function 

    static int [] reverseArray(int [] array,int length){
        int [] reverse=new int[length];
        int count=0;
        for(int i= (array.length-1);i>=0;i--){
            reverse[count]= array[i];
            count++;
        }
        return reverse;
    }

    public static void main(String[] args) {
        /// Reverse Array Function Called from above (Program 01)

        int [] number ={1,2,3,4,5,6,7,8,9,10};
        for (int value:reverseArray(number,10)) {
            System.out.print(value);
        }


        /// Frequency Count (Program no 02)
        
        System.out.println("");
        int [] numbers={1,1,2,2,4,5,6,4,1,2,3,4,5,7};
        Map<String,Integer> map = new HashMap<>();
        map.put("0",0);
        map.put("1",0);
        map.put("2",0);
        map.put("3",0);
        map.put("4",0);
        map.put("5",0);
        map.put("6",0);
        map.put("7",0);
        map.put("8",0);
        map.put("9",0);

        for(int i=0;i< numbers.length;i++){
            if(numbers[i]==0){
                int a1=map.get("0");
                int f1= a1+1;
                map.replace("0",a1,f1);

            }
            else if(numbers[i]==1){
                int a2=map.get("1");
                int f2= a2+1;
                map.replace("1",a2,f2);

            }
            else if(numbers[i]==2){
                int a3=map.get("2");
                int f3= a3+1;
                map.replace("2",a3,f3);

            }
            else if(numbers[i]==3){
                int a4=map.get("3");
                int f4= a4+1;
                map.replace("3",a4,f4);

            }
            else if(numbers[i]==4){
                int a5=map.get("4");
                int f5= a5+1;
                map.replace("4",a5,f5);

            }
            else if(numbers[i]==5){
                int a6=map.get("5");
                int f6= a6+1;
                map.replace("5",a6,f6);

            }
            else if(numbers[i]==6){
                int a7=map.get("6");
                int f7= a7+1;
                map.replace("6",a7,f7);

            }
            else if(numbers[i]==7){
                int a8=map.get("7");
                int f8= a8+1;
                map.replace("7",a8,f8);

            }
            else if(numbers[i]==8){
                int a9=map.get("8");
                int f9= a9+1;
                map.replace("8",a9,f9);
            }
        }

        //print frequency of Numbers
        map.forEach( (k,v) -> {
            System.out.println("Frequency of " + k + " is : " + v);
        });

    }
}
