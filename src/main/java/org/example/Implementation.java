package org.example;

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
        int counter = 0;
        int index = 0;

            for (int value : arr){
                if (value == val) {
                    size++;
                }
            }

            if (size != 0){
                int[] found = new int[size];
                for (int value : arr){
                    if (value == val){
                        found[index] = counter;
                        index++;
                    }
                    counter++;
                }
                return found;
            }else{
                throw new NullPointerException();
            }


    }

    @Override
    public void appendLast(int value) {
        int[] result = new int[arr.length+1];
        // for (int i=0; i< arr.length; i++){
        //     result[i] = arr[i];
        // }
        System.arraycopy(arr, 0, result, 0, arr.length);
        result[result.length-1] = value;
        arr = result;
    }

    @Override
    public void insertAt(int pos, int value) {
        int[] result = new int[arr.length+1];
        try {
            for (int i = result.length - 1; i >= 0; i--) {
                if (i > pos) {
                    result[i] = arr[i - 1];
                }
                if (i == pos) {
                    result[i] = value;
                }
                if (i < pos) {
                    result[i] = arr[i];
                }
            }
            arr = result;
        }
        catch (Exception e){
            throw new NullPointerException();
        }
    }

    @Override
    public int getAt(int pos) {
        try{
            return arr[pos];
        }catch (Exception e){
            throw new NullPointerException();
        }
    }

    @Override
    public void setAt(int pos, int element) {
        try{
            arr[pos] = element;
        }catch (Exception e){
            throw new NullPointerException();
        }
    }

    @Override
    public int deleteAt(int pos) {
        int[] result = new int[arr.length-1];
        int counter = 0;
        int index = 0;
        int found = 0;

        try{
            for (int value : arr){
                if (index == pos){
                    found = value;
                }else{
                    result[counter] = value;
                    counter++;
                }
                index++;
            }
            arr = result;
            return found;
        }catch (Exception e){
            throw new NullPointerException();
        }
    }

}
