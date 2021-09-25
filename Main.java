package com.company;

public class Main {


    // lab task 01
    public static void rotateArray(int [] num,int n){
        for(int j=0;j<n;j++){
            int first=num[0];
            for(int i=0;i<(n);i++){
                num[i]=num[(i+1)];
            }
            num[(num.length)-1]=first;

            for(int val:num){
                System.out.print(val);
            }
            System.out.println("");
        }
    }





    // Lab task 02
    public static void finder(int [][] array){
        int length=array.length;
        int [] row=new int [length];
        int [] col=new int [length];
        int columnSum=0;
        int rowSum=0;

        int middle =(int) Math.ceil((double)(length) / 2);
        for(int k=0;k<array.length;k++){
            row[k]=(array[middle-1][k]);
            col[k]=(array[k][middle-1]);
            rowSum+=array[middle-1][k];
            columnSum+=array[k][middle-1];
        }
        System.out.print("Middle Row ");
        for(int ans:row){
            System.out.print(ans+",");
        }
        System.out.println("");

        System.out.println("Sum of Middle row is "+rowSum);
        System.out.print("Middle Col ");
        for(int ans:col){
            System.out.print(ans+",");
        }
        System.out.println("");
        System.out.println("Sum of Middle Column is "+columnSum);

    }

    public static void main(String[] args) {


        // lab task 1 function call..

        int [] abc={1,2,3,4,5};
        int n=4;
        rotateArray(abc,n);



        // Lab Task 2 function call....

        int [][] array={{3,5,4},{7,6,9},{2,1,8}};
        finder(array);






    }
}
