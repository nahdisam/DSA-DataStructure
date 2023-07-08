/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sam
 */
public class NewStack {
   int arr[];
   int topOfStack ;

    public NewStack(int size) {
        this.arr = new int [size];
        this.topOfStack = -1;
        System.out.println("the size of stack "+ size);
    }
 public boolean isEmpty(){
        if(topOfStack == -1 ){
            return true;
             
        }else {
            return false;
        }
    }
 public boolean isFull(){
     if(topOfStack == arr.length-1 ){
         System.out.println("stack is full");
         return true;
     }else{
         return false;
     }
 }
  
   
   
}
