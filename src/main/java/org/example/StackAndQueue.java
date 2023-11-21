package org.example;

import javax.sound.midi.Soundbank;
import java.util.*;

public class StackAndQueue {
    int ptr = -1;
    int arr[];
    static final int defaultSize = 10;
    public StackAndQueue(){
        this(defaultSize);
    }
    public StackAndQueue(int size){
        this.arr = new int[size];
    }
    public void push(int num){
        if(arr.length == defaultSize){
            System.out.println("stack full");
        }
        ptr++;
        arr[ptr] = num;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack empty");
        }
        int top = arr[ptr];
        ptr--;
        return top;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public void show(){
        for (int j : arr) {
            System.out.println(j+" ");
        }
    }
}
