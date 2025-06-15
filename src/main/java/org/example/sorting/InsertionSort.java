package org.example.sorting;

import java.util.Random;

public class InsertionSort {

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    private static void insertionSort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int j=i-1;
            while (j >= 0 && currentValue < array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=currentValue;

        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers =  new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=rand.nextInt(10);
        }
        System.out.println("Before Insertion Sorting...");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter Insertion Sorting...");
        printArray(numbers);
    }
}
