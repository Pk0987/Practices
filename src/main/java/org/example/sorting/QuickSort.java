package org.example.sorting;

import java.util.Random;

public class QuickSort {
     public static void printArray(int[] numbers){
         for(int x:numbers) System.out.printf("%d ", x);

    }
    static void swap(int[] array, int a, int b){
         int temp = array[a];
         array[a]=array[b];
         array[b]=temp;
    }
    static void quickSort(int[] array){
        quickSort(array,0,  array.length-1);
    }
   static void quickSort(int[] array, int lowIndex, int hignIndex){

         if(lowIndex>=hignIndex){
             return;
         }
         int pivotIndex = new Random().nextInt(hignIndex - lowIndex)+ lowIndex;
         int pivot = array[pivotIndex];
         swap(array,pivotIndex,hignIndex);

         int leftPointer = partition(array, lowIndex, hignIndex, pivot);

         quickSort(array,lowIndex,leftPointer-1);
         quickSort(array,leftPointer+1,hignIndex);
    }

    private static int partition(int[] array, int lowIndex, int hignIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = hignIndex;

        while (leftPointer <  rightPointer ){

            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array,leftPointer,rightPointer);
        }
        swap(array,leftPointer, hignIndex);
        return leftPointer;
    }

    public static void main() {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=rand.nextInt(100);
        }
        System.out.println("Before QuickSort: ");
        printArray(numbers);

        quickSort(numbers);

        System.out.println("\nAfter QuickSort: ");
        printArray(numbers);
    }
}
