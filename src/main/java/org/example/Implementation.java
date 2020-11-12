package org.example;

import java.util.Arrays;

public class Implementation implements IIntArray {

    public int[] arr;

    public Implementation(int[] arr) {
        this.arr = arr;
    }

    @Override
    public double getAverage() {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total /arr.length;
    }

    @Override
    public int[] findPositions(int val) {
        int size = 0;
        int[] found = {};

        for(int i=0; i<arr.length; i++){
            if (arr[i] == val){
                size++;

            }
        }
        int[] test = new int[size];

        for (int j=0; j<size; j++){
            for (int i : arr) {
                if (arr[i] == val){
                    if (test[j] != i){
                        test[j] = i;
                    }

                }
            }
        }

        for (int i : test) {
            System.out.println(i);
        }

        return test;
    }

    @Override
    public void appendLast(int value) {

    }

    @Override
    public void insertAt(int pos, int value) {

    }

    @Override
    public int getAt(int pos) {
        return 0;
    }

    @Override
    public void setAt(int pos, int element) {

    }

    @Override
    public int deleteAt(int pos) {
        return 0;
    }
}
