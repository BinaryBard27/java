package com.libary;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        System.out.println("welcome to array specific element delete");
        //original array declare
        int[] arr=new int[]{1,2,3,4,5};
        //new array
        int[] new_arr=new int[arr.length-1];
        //index to delete
        int j=2;
        //loop
        for(int i=0,k=0;i<arr.length;i++){
          if(i!=j){
              new_arr[k]=arr[i];
              k++;
          }

        }
        //print using Arrays.toString
        System.out.println("before: "+ Arrays.toString(arr));
        System.out.println("after: "+Arrays.toString(new_arr));
    }
}
