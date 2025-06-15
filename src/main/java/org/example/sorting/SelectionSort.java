package org.example.sorting;

import java.util.Random;

import static org.example.sorting.QuickSort.swap;
import static org.example.sorting.QuickSort.printArray;

public class SelectionSort {
    static void selectionSort(int[] numbers){
        int length = numbers.length;

        for (int i = 0; i < length-1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i+1; j < length; j++) {
                if(numbers[j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers,i,indexOfMin);
        }
    }


    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before Selection Sorting...");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("\nAfter Selection Sorting...");
        printArray(numbers);
    }
}
