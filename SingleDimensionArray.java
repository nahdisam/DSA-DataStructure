
package com.mycompany.mavenproject1;

public class SingleDimensionArray {
    int []arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int location,int valueInserted){
        if(arr[location]==Integer.MIN_VALUE){
            arr[location]=valueInserted;
            System.out.println("Value inserted successfully");
        }else{
            System.out.println("this cell already taken");
        }
    }
    
}
